package ss17_IO_BinaryFile_Serialization.bai_tap.data.controller;

import ss17_IO_BinaryFile_Serialization.bai_tap.data.service.CarImpl;

import java.util.Scanner;

public class CarController {
    public static void displayMenuCar() {
        Scanner scanner = new Scanner(System.in);
        CarImpl car=new CarImpl();
        do {
            System.out.println("---Chương trình quản lý sản phẩm xe hơi---" +
                    "\n 1. Thêm sản phẩm" +
                    "\n 2. Hiển thị sản phẩm" +
                    "\n 3. Tìm kiếm sản phẩm" +
                    "\n 4. Xóa sản phẩm" +
                    "\n 5. Exit");
            String choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    car.add();
                    break;
                case "2":
                    car.display();
                    break;
                case "3":
                    car.search();
                    break;
                case "4":
                    car.delete();
                    break;
                case "5":
                    return;
            }
        } while (true);


    }
}
