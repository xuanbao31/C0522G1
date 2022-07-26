package ss15_IO_TextFile.bai_tap.controller;

import ss15_IO_TextFile.bai_tap.service.WorldImpl;

import java.util.Scanner;

public class WorldController {
    public static void displayMenuWorld() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Chương trình thêm mới quốc gia---" +
                    "\n 1. Thêm mới quốc gia" +
                    "\n 2. Xóa quốc gia trong danh sách" +
                    "\n 3. Hiển thị danh sách" +
                    "\n 4. Tìm kiếm quốc gia trong danh sách" +
                    "\n 5. Exit");
            String choose = scanner.nextLine();
            WorldImpl world = new WorldImpl();
            switch (choose) {
                case "1":
                    world.add();
                    break;
                case "2":
                    world.delete();
                    break;
                case "3":
                    world.display();
                    break;
                case "4":
                    world.search();
                    break;
                case "5":
                    return;
            }

        } while (true);


    }
}
