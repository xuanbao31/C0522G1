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
            TeacherService teacherService=new TeacherService();
            switch (choose) {
                case "1":
                    teacherService.add();
                    break;
                case "2":
                    teacherService.delete();
                    break;
                case "3":
                    teacherService.display();
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
                    "\n 4. Tìm kiếm học viên" +
                    "\n 5. Thoát");
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.nextLine();
            StudentService studentService=new StudentService();
            switch (choose) {
                case "1":

                    studentService.add();
                    break;
                case "2":

                    studentService.delete();
                    break;
                case "3":
                    studentService.display();
                    break;
                case "4":
                  studentService.search();
                  break;
                case "5":
                    return;
            }
        } while (true);

    }
}
