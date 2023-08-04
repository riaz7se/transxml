import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Matchers;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TransactioServiceTest {

    TransactionService transactioService;

    private CyberArkService cyberArkService;

    private NiprXmlResponseParser niprXmlResponseParser;

    private CloseableHttpClient httpClient;
    private CloseableHttpResponse response;
    private HttpEntity entity;
    private StatusLine statusline;


    @BeforeAll
    public void setUp() throws Exception {
        this.httpClient = mock(CloseableHttpClient.class);
        this.response = mock(CloseableHttpResponse.class);
        this.entity = mock(HttpEntity.class);
        this.statusline = mock(StatusLine.class);

    }

    @Test
    public void testSplitResponse() throws IOException {
        transactioService = new TransactionService();

        String payload = "xml";

        Config config = mock(Config.class);
        when(config.getconjureAlias()).thenReturn(*******);
        when(config.getB2bEndPoint()).thenReturn(******);
        when(config.getElegibility_endpoint()).thenReturn(*******);

        Credential credential = mock(Credential.class);
        when(cyberArkService.getCredentials(any())).thenReturn(credential);

        when(response.getEntity()).thenReturn(
                new InputStreamEntity(
                        new ByteArrayInputStream(
                                "XMLLLLL".getBytes())));

        ElResponseTransaction elTransaction = ElResponseTransaction.builder().build();
        when(niprXmlResponseParser.parseElResponseXml(Matchers.any(String.class))).thenReturn(elTransaction);

        List<ElResponseTransaction> elList = new ArrayList();
        when(niprXmlResponseParser.consolidateTransactionXmls(Matchers.any(ElResponseTransaction.class))).thenReturn(elList)

        when(httpClient.execute(Matchers.any(HttpPost.class))).thenReturn(response);

        String consildatedXml = transactioService.splitPostTransactionAssistant(payload);

        Assert.assertNonNull(consildatedXml);

    }

}
