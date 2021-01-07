package utils;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class DownloadUtil {
//        response.setCharacterEncoding("utf-8");
//    response.setContentType("application/msword");
//    String  fileName="哈哈哈哈.doc";
//
//    if (request.getHeader("User-Agent").toLowerCase().indexOf("firefox") > 0) {
//        fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1"); // firefox浏览器
//    } else if (request.getHeader("User-Agent").toUpperCase().indexOf("MSIE") > 0) {
//        fileName = URLEncoder.encode(fileName, "UTF-8");// IE浏览器
//    }else if (request.getHeader("User-Agent").toUpperCase().indexOf("CHROME") > 0) {
//        fileName = new String(fileName.getBytes("UTF-8"), "ISO8859-1");// 谷歌
//    }
//   response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
    public static String getFileName(String agent , String filename) throws UnsupportedEncodingException {
        if (agent.toLowerCase().indexOf("firefox")>0){
            filename = new String(filename.getBytes("utf-8"),"iso8859-1");
        } else if (agent.toUpperCase().indexOf("MSIE") > 0){
            filename = URLEncoder.encode(filename,"utf-8");
        } else if (agent.toUpperCase().indexOf("CHROME") > 0){
            filename = new String(filename.getBytes("utf-8"),"iso8859-1");
        }

        return filename;
    }


//    public static void main(String[] args) {
//        String name = "哈哈哈.doc";
//        String fileName = null;
//        try {
//            fileName = getFileName("chrome", name);
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        System.out.println(fileName);
//    }

}
