package pl.sda.regex.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    public static boolean isValidPostalCode(String text) {
        Pattern pattern = Pattern.compile("[\\d]{2}-[\\d]{3}");
//        Pattern pattern = Pattern.compile("[0-9]{2}-[0-9]{3}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public static boolean isVaildDateFormat(String text) {
        Pattern pattern = Pattern.compile("[0-3]?\\d\\.[0-1]\\d\\.[\\d]{1,4}");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }
}
