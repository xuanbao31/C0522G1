package Case_1.Controller;

import Case_1.Service.DienThoaiChinhHangImpl;

import java.util.Scanner;

public class DienThoaiController {
    static Scanner scanner=new Scanner(System.in);
    public  void displayMenu(){
        do {
            System.out.println("-----Chương Trình Quản Lý Điện Thoại----" +
                    "\n Vui lòng chọn dịch vụ" +
                    "\n 1.Điện Thoại Chính Hãng" +
                    "\n 2.Điện Thoại Xách Tay");
            String choose =scanner.nextLine();
            switch (choose){
                case "1":displayMenuDienThoaiChinhHang();
                case "2":

            }
        }while (true);


    }
    public static void displayMenuDienThoaiChinhHang(){
        do {
            System.out.println("1. Thêm mới điện Thoại" +
                    "\n 2. Xóa" +
                    "\n 3. Xem danh sách điện thoại" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Thoát");
             String choose = scanner.nextLine();
            DienThoaiChinhHangImpl dienThoaiChinhHang=new DienThoaiChinhHangImpl();
             switch (choose){
                 case "1":
                     dienThoaiChinhHang.add();
                 case "2":
                     dienThoaiChinhHang.delete();
                 case "3":
                     dienThoaiChinhHang.display();
                 case "4":
                     dienThoaiChinhHang.search();
                 case "5":
                     return;
             }
        }while (true);
    }
}
