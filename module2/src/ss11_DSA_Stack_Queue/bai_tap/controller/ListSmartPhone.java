package ss11_DSA_Stack_Queue.bai_tap.controller;

import ss11_DSA_Stack_Queue.bai_tap.service.SmartPhoneImpl;

import java.util.Scanner;

public class ListSmartPhone {
    public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("___Chương Trình Quản Lý Sản Phẩm___" +
                    "\n 1. Thêm Sản Phẩm" +
                    "\n 2. Xóa sản phẩm theo id" +
                    "\n 3. Hiển thị danh sách sản phẩm" +
                    "\n 4. Tìm kiếm sản phẩm theo tên" +
                    "\n 5. Cập nhật sản phẩm theo id" +
                    "\n 6. Sắp xếp ");
            System.out.println();
            String choose = scanner.nextLine();
            SmartPhoneImpl smartPhone = new SmartPhoneImpl();
            switch (choose) {
                case "1":
                    smartPhone.add();
                    break;
                case "2":
                    smartPhone.delete();
                    break;
                case "3":
                    smartPhone.display();
                    break;
                case "4":
                    smartPhone.search();
                    break;
                case "5":
                    smartPhone.update();
                    break;
                case "6":
                    smartPhone.arrangement();
                    break;
            }
        } while (true);
    }
}
