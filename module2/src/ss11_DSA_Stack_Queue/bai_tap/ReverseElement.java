package ss11_DSA_Stack_Queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> myStack= new Stack<>();
        System.out.println("Nhap so luong phan tu ban muon");
        int number= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println("nhập phần tử có trong mảng");
            myStack.push(Integer.parseInt(scanner.nextLine()));
        }
        int []arr=new int[myStack.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=myStack.pop();
        }
        System.out.println(Arrays.toString(arr));

    }
}
