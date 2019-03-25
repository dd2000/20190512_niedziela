package pl.sda.regex.tasks;

public class RegexTest {
    public static void main(String[] args) {
//        String s1 = "10-123";
//        String s2 = "80-432";
//        String s3 = "1-300";
//        String s4 = "ab-cde";
//        String s5 = "80+432";
//        String s6 = "80-4324";
//        String s7 = "800-432";
//        String s8 = "80-43";

//        System.out.println("s1 -> " + RegexUtil.isValidPostalCode(s1));
//        System.out.println("s2 -> " + RegexUtil.isValidPostalCode(s2));
//        System.out.println("s3 -> " + RegexUtil.isValidPostalCode(s3));
//        System.out.println("s4 -> " + RegexUtil.isValidPostalCode(s4));
//        System.out.println("s5 -> " + RegexUtil.isValidPostalCode(s5));
//        System.out.println("s6 -> " + RegexUtil.isValidPostalCode(s6));
//        System.out.println("s7 -> " + RegexUtil.isValidPostalCode(s7));
//        System.out.println("s8 -> " + RegexUtil.isValidPostalCode(s8));
        System.out.println(RegexUtil.isVaildDateFormat("12.09.1992"));
        System.out.println(RegexUtil.isVaildDateFormat("dfjdaslkdjasdl"));
        System.out.println(RegexUtil.isVaildDateFormat("1.10.200"));
        System.out.println(RegexUtil.isVaildDateFormat("02.15.188"));
        System.out.println(RegexUtil.isVaildDateFormat("45.10.188"));


   }
}
