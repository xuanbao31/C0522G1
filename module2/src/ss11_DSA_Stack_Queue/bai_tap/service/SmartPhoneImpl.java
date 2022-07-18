package ss11_DSA_Stack_Queue.bai_tap.service;

import ss11_DSA_Stack_Queue.bai_tap.model.SmartPhone;

import javax.accessibility.AccessibleHyperlink;
import java.util.*;

public class SmartPhoneImpl implements SmartPhoneService {
    static List<SmartPhone> smartPhoneList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void add() {
        System.out.println("Nhập hãng điện thoại");
        String phoneCompany = scanner.nextLine();
        System.out.println("Nhập id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá điện thoại");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tên điện thoại");
        String phoneName = scanner.nextLine();
        smartPhoneList.add(new SmartPhone(phoneCompany, id, price, phoneName));

    }

    @Override
    public void delete() {
        System.out.println("Nhập id bạn muốn xóa");
        int choose = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < smartPhoneList.size(); i++) {
            if (choose == smartPhoneList.get(i).getId()) {
                System.out.println("bạn có chắc chắn muốn xóa" +
                        "\n 1. oke" +
                        "\n 2. thui");
                String xoa = scanner.nextLine();
                switch (xoa) {
                    case "1":
                        smartPhoneList.remove(i);
                        display();
                        break;
                    case "2":
                        return;
                }
            }
        }
    }

    @Override
    public void display() {
        for (SmartPhone smartPhone : smartPhoneList) {
            System.out.println(smartPhone);

        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn kiếm");
        String choose = scanner.nextLine();
        for (int i = 0; i < smartPhoneList.size(); i++) {
            if (smartPhoneList.get(i).getPhoneName().equals(choose)) {
                System.out.println(smartPhoneList.get(i));
            }
        }
    }

    @Override
    public void update() {
        System.out.println("Nhập id bạn muốn cập nhật ");
        int choose = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < smartPhoneList.size(); i++) {
            if (choose == smartPhoneList.get(i).getId()) {
                System.out.println("Nhập hãng điện thoại");
                String hangDienThoai = scanner.nextLine();
                System.out.println("Nhập giá điện thoại");
                Double giaTien = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập tên điện thoại");
                String tenDienThoai = scanner.nextLine();
                smartPhoneList.get(i).setPhoneName(tenDienThoai);
                smartPhoneList.get(i).setPhoneCompany(hangDienThoai);
                smartPhoneList.get(i).setId(choose);
                smartPhoneList.get(i).setPrice(giaTien);
                display();
            }

        }
    }

    @Override
    public void arrangement() {
        Collections.sort(smartPhoneList);
        display();

    }

}
