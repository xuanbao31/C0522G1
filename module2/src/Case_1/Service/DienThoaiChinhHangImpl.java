package Case_1.Service;

import Case_1.Model.DienThoaiChinhHang;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class DienThoaiChinhHangImpl implements DienThoai {
   static LinkedList<DienThoaiChinhHang> dienThoaiChinhHangLinkedList = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    //    int id, String namePhone, int soLuong, String nhaSanXuat, String thoiGianBaoHanh, String phamViBaoHanh
    @Override
    public void add() {
        int id = 0;
        int max = dienThoaiChinhHangLinkedList.get(0).getId();
        if (dienThoaiChinhHangLinkedList.size() == 0) {
            id = 1;
        } else {
            for (int i = 1; i < dienThoaiChinhHangLinkedList.size(); i++) {
                if (dienThoaiChinhHangLinkedList.get(i).getId() > max) {
                    max = dienThoaiChinhHangLinkedList.get(i).getId();
                }
            }
            id = max + 1;
        }

        System.out.println("Nhập tên điện thoại");
        String namePhone = scanner.nextLine();
        System.out.println("Nhập số lượng");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Nhập thời gian");
        String thoiGianBaoHanh = scanner.nextLine();
        System.out.println("Nhập phạm vi bảo hành");
        String phamViBaoHanh = scanner.nextLine();
        dienThoaiChinhHangLinkedList.add(new DienThoaiChinhHang(id, namePhone, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh));

    }

    @Override
    public void delete() {
        System.out.println("Nhập id điện thoại bạn muốn xóa");
        int choose = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiChinhHangLinkedList.size(); i++) {
            if (choose == dienThoaiChinhHangLinkedList.get(i).getId()) {
                System.out.println("Bạn có chắc chắn muốn xóa" +
                        "\n 1. Chắc chắn" +
                        "\n 2. Kh xóa nữa");
                String choose1 = scanner.nextLine();
                switch (choose1) {
                    case "1":
                        dienThoaiChinhHangLinkedList.remove(i);
                        display();
                    case "2":
                        return;
                }
            }
        }
    }

    @Override
    public void display() {
        for (DienThoaiChinhHang dienThoaiChinhHang:dienThoaiChinhHangLinkedList) {
            System.out.println(dienThoaiChinhHang);
        }

    }

    @Override
    public void search() {
        System.out.println("Nhập id bạn muốn tìm kiếm");
        int search=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < dienThoaiChinhHangLinkedList.size(); i++) {
            if (search==dienThoaiChinhHangLinkedList.get(i).getId()){
                System.out.println(dienThoaiChinhHangLinkedList.get(i));
            }
        }

    }
}

