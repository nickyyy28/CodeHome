/**
 * @AUTHOR : 张辉阳
 * @date :  2020/10/31 7:53
 * @version : 1.0
 */


package cn.itcast.crawler.test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;

public class HttpGetTest {

    public static void main(String[] args) throws URISyntaxException {
        CloseableHttpClient client = HttpClients.createDefault();



        URIBuilder uriBuilder = new URIBuilder("https://www.itheima.com/search");

        uriBuilder.setParameter("keys","Java");

        CloseableHttpResponse response = null;

        HttpGet httpGet = new HttpGet(uriBuilder.build());
        try {
            response = client.execute(httpGet);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int code = response.getStatusLine().getStatusCode();
        if (code == 200){
            try {
                String string = EntityUtils.toString(response.getEntity(), "utf-8");
                System.out.println(string);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        try {
            response.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
