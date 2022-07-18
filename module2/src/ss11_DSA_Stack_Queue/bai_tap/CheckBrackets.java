package ss11_DSA_Stack_Queue.bai_tap;

import java.util.Stack;

public class CheckBrackets {
    public static boolean check(String alphabet) {

        Stack<Character> bstack = new Stack<>();
//        Character left;
        for (int i = 0; i < alphabet.length(); i++) {
            char sym = alphabet.charAt(i);
            if (sym == '(') {
                bstack.push(sym);
            }
            if (sym == ')') {
                if (bstack.isEmpty()) {
                    return false;
                } else {
                     bstack.pop();

                }
//                if (left.equals(')')) {
//                    return false;
//                }
            }
        }
        if (bstack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
