package ss15_IO_TextFile.bai_tap.service;

import ss15_IO_TextFile.bai_tap.model.World;
import ss15_IO_TextFile.bai_tap.untils.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorldImpl implements WorldService {
    Scanner scanner = new Scanner(System.in);
    static List<World> worldList = new ArrayList<>();

    public static void writeFileWorldImpl() {
//       WriteAndReadFile.clearFile();
        for (World writeFileWorld : worldList) {
            String data = writeFileWorld.getId() + "," + writeFileWorld.getCode() + "," + writeFileWorld.getNameCountry();
            WriteAndReadFile.writeFile("src/ss15_IO_TextFile/bai_tap/data/World.txt", data);
        }
    }

    public static List<World> readFileWorld() {
        worldList.clear();
        List<String> stringList = WriteAndReadFile.readFile("src/ss15_IO_TextFile/bai_tap/data/World.txt");
        for (String s : stringList) {
            String[] strings = s.split(",");
            int id = Integer.parseInt(strings[0]);
            String code = strings[1];
            String nameCountry = strings[2];
            worldList.add(new World(id, code, nameCountry));
        }
        return worldList;

    }


    @Override
    public void add() {
        readFileWorld();
        System.out.println("Nhập id ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã quốc gia");
        String code = scanner.nextLine();
        System.out.println("Nhập tên quốc gia");
        String nameCountry = scanner.nextLine();
        worldList.add(new World(id, code, nameCountry));
        writeFileWorldImpl();
    }

    @Override
    public void delete() {
        readFileWorld();
        System.out.println("Nhập tên quốc gia muốn xóa");
        String name = scanner.nextLine();
        for (int i = 0; i < worldList.size(); i++) {
            if (worldList.get(i).getNameCountry().equals(name)) {
                do {
                    System.out.println("Bạn có chắc chắn muốn xóa" +
                            "\n 1. Chắc chắn" +
                            "\n 2. Thui Giỡn");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            worldList.remove(i);
                            display();
                            writeFileWorldImpl();
                        case "2":
                            return;
                    }

                } while (true);

            }
        }

    }

    @Override
    public void display() {
        readFileWorld();
        for (World world : worldList) {
            System.out.println(world);
        }
    }

    @Override
    public void search() {
        readFileWorld();
        System.out.println("Nhập tên quốc gia bạn muốn kiếm");
        String name = scanner.nextLine();
        for (int i = 0; i < worldList.size(); i++) {
            if (worldList.get(i).getNameCountry().equals(name)) {
                System.out.println(worldList.get(i));
            } else {
                System.out.println("tên quốc gia không có trong danh sách");
            }
        }

    }
}
