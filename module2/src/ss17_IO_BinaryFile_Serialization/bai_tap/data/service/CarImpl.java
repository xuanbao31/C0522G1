package ss17_IO_BinaryFile_Serialization.bai_tap.data.service;

import ss17_IO_BinaryFile_Serialization.bai_tap.data.Untils.WriteAndReadFileCar;
import ss17_IO_BinaryFile_Serialization.bai_tap.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarImpl implements CarService {
    Scanner scanner = new Scanner(System.in);
    static List<Car> carList = new ArrayList<>();

    //    String maSanPham, String tenSanPham, String hangSanPham, double giaSanPham, String mauSacSanPham
    @Override
    public void add() {
        carList=WriteAndReadFileCar.readFile();
        System.out.println("Nhập mã sản phẩm");
        String maSanPham = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm ");
        String tenSanPham = scanner.nextLine();
        System.out.println("Nhập hãng sản phẩm ");
        String hangSanPham = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        Double giaSanPham = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc sản phẩm");
        String mauSacSanPham = scanner.nextLine();
        carList.add(new Car(maSanPham, tenSanPham, hangSanPham, giaSanPham, mauSacSanPham));
        WriteAndReadFileCar.writeFile(carList);
    }

    @Override
    public void display() {
          carList=WriteAndReadFileCar.readFile();
        for (Car car : carList) {
            System.out.println(car);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập mã sản phẩm ");
        String choose = scanner.nextLine();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getMaSanPham().equals(choose)) {
                System.out.println(carList.get(i));
                carList = WriteAndReadFileCar.readFile();
            }
        }
    }

    @Override
    public void delete() {
        carList = WriteAndReadFileCar.readFile();
        System.out.println("Nhập mã sản phẩm");
        String choose = scanner.nextLine();
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getMaSanPham().equals(choose)) {
                System.out.println("--Bạn có chắc chắn muốn xóa--" +
                        "\n 1. Chắc chắc" +
                        "\n 2. Thui kh xóa nữa ");
                String xoa = scanner.nextLine();
                switch (xoa) {
                    case "1":
                        carList.remove(carList.get(i));
                        display();
                        WriteAndReadFileCar.writeFile(carList);

                        return;
                    case "2":
                        return;
                }
            }
        }
    }
}
