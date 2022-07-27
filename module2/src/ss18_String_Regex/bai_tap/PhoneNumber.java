package ss18_String_Regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final  String PHONE_NUMBER_REGEX="^(84)-[0][0-9]{9}";

    public PhoneNumber() {
    }
    public static boolean validate(String regex){
        Pattern pattern=Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
