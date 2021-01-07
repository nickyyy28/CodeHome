/**
 * @AUTHOR : 张辉阳
 * @date :  2020/10/30 22:47
 * @version : 1.0
 */


package cn.itcast.crawler.test;

import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class crawlerFirst {

    public static void main(String[] args) throws IOException {
        //1.打开浏览器
        CloseableHttpClient client = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet("http://www.baidu.com");

        //2.输入网址,发起请求

        CloseableHttpResponse response = client.execute(httpGet);

        //3.回车

        //4.解析响应,获取数据
        String content = null;

        if (response.getStatusLine().getStatusCode() == 200){
            HttpEntity entity = response.getEntity();
            content = EntityUtils.toString(entity , "utf-8");
//            System.out.println(content);
            System.out.println("爬取成功");
        }

        BufferedWriter bw = new BufferedWriter(
                new FileWriter(
                        new File("D:\\CrawlerFile\\"+new Date().getTime() +".html")
                )
        );
        bw.write(content);
        bw.close();


    }
}
