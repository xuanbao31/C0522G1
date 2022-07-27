package ss10_DSA.bai_tap_lam_them.service;

import ss10_DSA.bai_tap_lam_them.model.Teacher;
import ss10_DSA.bai_tap_lam_them.untils.GetUntils;
import ss10_DSA.bai_tap_lam_them.untils.Regex;
import ss10_DSA.bai_tap_lam_them.untils.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements PersonService {
    private static ArrayList<Teacher> teacherList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void writeFileTeacher() {
        WriteAndReadFile.clearFile("src/ss10_DSA/bai_tap_lam_them/data/teacher.csv");
        for (Teacher ghiFileteacher : teacherList) {
            String data = ghiFileteacher.getCode() + "," + ghiFileteacher.getName() + "," + ghiFileteacher.getBirthDay() + "," + ghiFileteacher.getGender() + "," + ghiFileteacher.getSpecialize();
            WriteAndReadFile.writeFile("src/ss10_DSA/bai_tap_lam_them/data/teacher.csv", data);
        }
    }

    public static List<Teacher> readFileTeacher() {
        teacherList.clear();
        List<String> stringList = WriteAndReadFile.readFile("src/ss10_DSA/bai_tap_lam_them/data/teacher.csv");
        for (String s : stringList) {
            String[] strings = s.split(",");
            String code = strings[0];
            String name = strings[1];
            String birthDay = strings[2];
            String gender = strings[3];
            String specialize = strings[4];
            teacherList.add(new Teacher(code, name, birthDay, gender, specialize));
        }
        return teacherList;
    }


    @Override
    public void add() {
        readFileTeacher();
        System.out.println("Nhập mã giảng viên");
        String code = scanner.nextLine();
        String name = getName();
        String birthDay= GetUntils.getDateOfBirth();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập trình độ chuyên môn");
        String specialize = scanner.nextLine();
        teacherList.add(new Teacher(code, name, birthDay, gender, specialize));
        writeFileTeacher();
    }

    @Override
    public void delete() {
        List<Teacher> teachers = readFileTeacher();
        System.out.println("Nhập mã giảng viên bạn muốn xóa");
        String xoa = scanner.nextLine();
        for (int i = 0; i < teachers.size(); i++) {
            if (xoa.equals(teachers.get(i).getCode())) {
                do {
                    System.out.println("Bạn chắc chắn muốn xóa chứ" +
                            "\n 1. Chắc Chắn" +
                            "\2 2. Thôi không xóa nữa");
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            teachers.remove(i);
                            writeFileTeacher();
                            display();
                            return;
                        case "2":
                            return;
                    }
                } while (true);
            }
        }
    }

    @Override
    public void display() {
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void search() {
        readFileTeacher();
        String checkCode = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getCode().equals(checkCode)) {
                System.out.println(teacherList.get(i));
            }
        }
    }
    public static String getName() {
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        String[] arr = name.toLowerCase().trim().split("");
        StringBuilder str = new StringBuilder().append(arr[0].toUpperCase());
        for (int i = 1; i < arr.length; i++) {
            if (!arr[i].equals(" ")) {
                if (arr[i - 1].equals(" ")) {
                    str.append(arr[i].toUpperCase());
                } else {
                    str.append(arr[i]);
                }
            } else if (!arr[i + 1].equals(" ")) {
                str.append(arr[i]);
            }
        }
        return str.toString();
    }
}
