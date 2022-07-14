package ss10_DSA.bai_tap_lam_them.controller;

import ss10_DSA.bai_tap_lam_them.model.Teacher;
import ss10_DSA.bai_tap_lam_them.service.StudentService;
import ss10_DSA.bai_tap_lam_them.service.TeacherService;

import java.util.Scanner;

public class PersonController {
    public static void displayMenuPerson() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----Chương trình quản lý sinh viên---" +
                    "\n 1.  giảng viên " +
                    "\n 2. học sinh");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    displayMenuTeacher();
                    break;
                case "2":
                    displayMenuStudent();
                    break;
            }
        } while (true);
    }

    public static void displayMenuTeacher() {
        do {
            System.out.println("1. Thêm mới giảng viên" +
                    "\n 2. Xóa giảng viên." +
                    "\n 3. Xem Danh sách giảng viên" +
                    "\n 4. Thoát");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    TeacherService teacherService = new TeacherService();
                    teacherService.add();
                    break;
                case "2":
                    TeacherService teacherService1 = new TeacherService();
                    teacherService1.delete();
                    break;
                case "3":
                    TeacherService teacherService2 = new TeacherService();
                    teacherService2.display();
                    break;
                case "4":
                    return;

            }
        }while (true);
    }

    public static void displayMenuStudent() {
        do {
            System.out.println("1. Thêm mới học viên" +
                    "\n 2. Xóa học viên." +
                    "\n 3. Xem Danh sách học viên" +
                    "\n 4. Thoát");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    StudentService studentService = new StudentService();
                    studentService.add();
                    break;
                case "2":
                    StudentService studentService1 = new StudentService();
                    studentService1.delete();
                    break;
                case "3":
                    StudentService studentService2 = new StudentService();
                    studentService2.display();
                    break;
                case "4":
                    return;
            }
        } while (true);

    }
}
