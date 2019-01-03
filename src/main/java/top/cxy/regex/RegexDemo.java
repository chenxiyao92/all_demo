package top.cxy.regex;

/**
 * Created by Administrator on 2018/5/24.
 */
public class RegexDemo {


    public static final String QQ_REGEX = "^[1-9]\\d{4,11}$";


    public static final String SPLIT_BY_NUMBER = "\\d+";


    public static void main(String[] args) {

        /*
        1、第一位不能是零；
 	2、QQ号码在5到12之间（包含）；
3、QQ号码都是由数字组成；
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入QQ号码");
//        String s = scanner.nextLine();
//        System.out.println(s.matches(QQ_REGEX));


        String test = "sfajs12321dbfj234d23sjfk454sdjf565sdhd757hf";

        String[] result = test.split(SPLIT_BY_NUMBER);

        for (String str:result) {
            System.out.println(str);
        }


    }

}
