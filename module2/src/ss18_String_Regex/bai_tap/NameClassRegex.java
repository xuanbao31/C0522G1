package ss18_String_Regex.bai_tap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassRegex {
    private static final  String NAME_CLASS_REGEX="^[CAP][0-9]{4}[GHIKLM]";

    public NameClassRegex() {
    }
    public static boolean  validate(String regex){
        Pattern pattern=Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher= pattern.matcher(regex);
        return matcher.matches();
    }
}
