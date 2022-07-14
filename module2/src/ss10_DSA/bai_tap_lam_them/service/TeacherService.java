package ss10_DSA.bai_tap_lam_them.service;

import ss10_DSA.bai_tap_lam_them.model.Teacher;
import ss10_DSA.bai_tap_lam_them.untils.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements PersonService {
   private static ArrayList <Teacher> teacherList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
//    String code, String name, String birthDay, String gender, String specialize


public static void writeFileTeacher(){
    WriteAndReadFile.clearFile("src/ss10_DSA/bai_tap_lam_them/data/teacher.csv");
    for (Teacher ghiFileteacher:teacherList) {
        String data=ghiFileteacher.getCode()+","+ghiFileteacher.getName()+","+ghiFileteacher.getBirthDay()+","+ghiFileteacher.getGender()+","+ghiFileteacher.getSpecialize();
        WriteAndReadFile.writeFile("src/ss10_DSA/bai_tap_lam_them/data/teacher.csv",data);
    }
}
public static List<Teacher> readFileTeacher(){
    teacherList.clear();
    List<String>stringList=WriteAndReadFile.readFile("src/ss10_DSA/bai_tap_lam_them/data/teacher.csv");
    for (String s:stringList) {
        String[]strings=s.split(",");
        String code=strings[0];
        String name =strings[1];
        String birthDay=strings[2];
        String gender = strings[3];
        String specialize=strings[4];
        teacherList.add(new Teacher(code,name,birthDay,gender,specialize));
    }
    return teacherList;
}



    @Override
    public void add() {
    readFileTeacher();
        System.out.println("Nhập mã giảng viên");
        String code = scanner.nextLine();
        System.out.println("Nhập tên ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String birthDay = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập trình độ chuyên môn");
        String specialize = scanner.nextLine();
        teacherList.add(new Teacher(code, name, birthDay, gender, specialize));
writeFileTeacher();
    }

    @Override
    public void delete() {
    List<Teacher>teachers=readFileTeacher();
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
}
