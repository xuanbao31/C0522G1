package ss13_Thuat_Toan_Sap_Xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class Insertsort {


    public static int[] insertSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Nhập phần tử có trong mảng có kích thước " + list.length);
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());

        }

        for (int i = 0; i < list.length; i++) {
            System.out.println("Phần tử bạn nhập vào");
            System.out.println(list[i] + "\t");

        }

        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > key; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = key;
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(insertSort()));
    }
}
