package ss10_DSA.bai_tap_lam_them.service;

import ss10_DSA.bai_tap_lam_them.model.Student;
import ss10_DSA.bai_tap_lam_them.untils.WriteAndReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements PersonService {
    private static ArrayList<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    public static void writeFileStudent() {
        WriteAndReadFile.clearFile("src/ss10_DSA/bai_tap_lam_them/data/student.csv");
        for (Student ghiFileStudent : studentList) {
            String data = ghiFileStudent.getCode() + "," + ghiFileStudent.getName() + "," + ghiFileStudent.getBirthDay() + "," + ghiFileStudent.getGender() + "," + ghiFileStudent.getNameClass() + "," + ghiFileStudent.getPoints();
            WriteAndReadFile.writeFile("src/ss10_DSA/bai_tap_lam_them/data/student.csv", data);
        }
    }

    public static List<Student> readFileStudent() {
        studentList.clear();
        List<String> stringList = WriteAndReadFile.readFile("src/ss10_DSA/bai_tap_lam_them/data/student.csv");
        for (String s : stringList) {
            String[] strings = s.split(",");
            String code = strings[0];
            String name = strings[1];
            String birthDay = strings[2];
            String gender = strings[3];
            String nameClass = strings[4];
            Double points = Double.parseDouble(strings[5]);
            studentList.add(new Student(code, name, birthDay, gender, nameClass, points));

        }
        return studentList;

    }


    @Override
    public void add() {
        readFileStudent();
        System.out.println("Nhập mã học sinh");
        String code = scanner.nextLine();
        System.out.println("Nhập tên học sinh");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String bithDay = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập tên lớp học");
        String nameClass = scanner.nextLine();
        System.out.println("Nhập điểm ");
        Double points = Double.parseDouble(scanner.nextLine());
        studentList.add(new Student(code, name, bithDay, gender, nameClass, points));
        writeFileStudent();
    }

    @Override
    public void delete() {
        List<Student>studentList=readFileStudent();
        System.out.println("Nhập mã học sinh cần xóa ");
        String xoa = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (xoa.equals(studentList.get(i).getCode())) {
                System.out.println("Bạn có chắc chắn muốn xóa" +
                        "\n 1. Chắc chắn" +
                        "\n 2. Thôi đừng xóa");
                String choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        studentList.remove(i);
                        writeFileStudent();
                        display();
                        return;
                    case "2":
                        return;
                }
            }

        }
    }

    @Override
    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
