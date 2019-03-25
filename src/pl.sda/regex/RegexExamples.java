package pl.sda.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExamples {
    public static void main(String[] args) {
        String text1 = "abc 123 def";
        Pattern pattern = Pattern.compile("([a-z0-9]+)");

        // regex for the whole text provided
//        Pattern pattern = Pattern.compile("([a-z0-9\\s]+)");

//        Pattern pattern = Pattern.compile("\\d+");
//        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text1);

        System.out.println("Matcher.matches > " + matcher.matches());

        // Exception -> IllegalStateException: No match found
        System.out.println(matcher.group());

        System.out.println("Groups -> " + matcher.groupCount());

        // group index: -1
        matcher.find(); // group index: 0
        System.out.println(matcher.group());
        matcher.find(); // group index: 1
        System.out.println(matcher.group());
        matcher.find(); // group index: 2
        System.out.println(matcher.group());

        // using loop
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String text2 = "Hello Java! I love Java!";
        String newText1 = text2.replaceAll("Java", "JavaScript");
        System.out.println(newText1);

        String newText2 = text2.replaceAll("\\s", "");
        System.out.println(newText2);

        String text3 = "abcccc";
        String reg1 = "^abc.";
        System.out.println(text3 + " matches: `" + reg1 + "`? - " + text3.matches(reg1));

        String reg2 = "^abc.*";
        System.out.println(text3 + " matches: `" + reg2 + "`? - " + text3.matches(reg2));

        String reg3 = "^abc+";
        System.out.println(text3 + " matches: `" + reg3 + "`? - " + text3.matches(reg3));

        String reg4 = "^abc?";
        System.out.println(text3 + " matches: `" + reg4 + "`? - " + text3.matches(reg4));

        String reg5 = "^abc?c*";
        System.out.println(text3 + " matches: `" + reg5 + "`? - " + text3.matches(reg5));
    }
}
