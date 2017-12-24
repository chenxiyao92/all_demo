package top.cxy.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by Administrator on 2017/12/17.
 */
public class URLDecodeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {


//        System.out.println("采用UTF-8字符集进行解码:");
//        String keyWord = URLDecoder.decode("%E5%A4%A9%E6%B4%A5%E5%A4%A7%E5%AD%A6+Rico", "UTF-8");
//        System.out.println(keyWord);
//        System.out.println("\n 采用GBK字符集进行解码:");
//        System.out.println(URLDecoder.decode("%E5%A4%A9%E6%B4%A5%E5%A4%A7%E5%AD%A6+Rico", "GBK"));

        // 将普通字符串转换成application/x-www-form-urlencoded字符串
//        System.out.println("\n 采用utf-8字符集:");
//        String urlStr = URLEncoder.encode("天津大学", "utf-8");
//        System.out.println(urlStr);
//        System.out.println("\n 采用GBK字符集:");
//        String urlStr2 = URLEncoder.encode("天津大学", "GBK");
//        System.out.println(urlStr2);


        System.out.println(URLDecoder.decode("%E5%A4%A9%E6%B4%A5%E5%A4%A7%E5%AD%A6+++Rico", "utf-8"));


    }
}

