package ss14_Exception_Debug.bai_tap;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập cạnh a của tam giác");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh b của tam giác");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c của tam giác");
    }
}
