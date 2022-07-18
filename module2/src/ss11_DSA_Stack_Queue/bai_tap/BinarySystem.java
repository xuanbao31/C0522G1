package ss11_DSA_Stack_Queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập số bạn muốn đổi");
        int number = Integer.parseInt(scanner.nextLine());
        int x;
        do {

            x = number % 2;
            stack.push(x);
            number = number / 2;

        } while (number > 0);
        System.out.println(stack.size());
        String Result = " ";
        while (!stack.isEmpty()) {
            Result = Result + stack.pop();
        }
        System.out.println(Result);
    }
}

