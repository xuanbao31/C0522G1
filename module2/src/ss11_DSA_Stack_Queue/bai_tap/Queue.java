package ss11_DSA_Stack_Queue.bai_tap;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayDeque<Character> arrayDeque=new ArrayDeque<>();
        System.out.println("Nhập chuỗi bạn muốn");
        String alphabet=scanner.nextLine();
        System.out.println(alphabet);
        for (int i = alphabet.length()-1; i >=0; i++) {
            arrayDeque.add(alphabet.charAt(i));

        }
        String alphabet2="";
        while (!arrayDeque.isEmpty()){
            alphabet2=alphabet+arrayDeque.remove();

        }
        System.out.println(alphabet2);
        if (alphabet==alphabet2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
