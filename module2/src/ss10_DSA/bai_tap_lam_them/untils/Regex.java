package ss10_DSA.bai_tap_lam_them.untils;

public class Regex {
    private static final String NAME_TEACHER_REGEX = "^[A-Z][a-z]*(\\s[A-Z][a-z]+)*$";

    public static boolean checkName(String s) {
        return s.matches(NAME_TEACHER_REGEX);

    }

}
