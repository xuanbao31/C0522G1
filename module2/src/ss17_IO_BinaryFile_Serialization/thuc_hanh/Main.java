package ss17_IO_BinaryFile_Serialization.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//public class Main {
//    public static void writeToFile(String path, List<Student> students) {
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(path);
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(students);
//            objectOutputStream.close();
//            fileOutputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        List<Student> students = new ArrayList<>();
//        System.out.println("Nhập id ");
//        int id = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập họ và tên");
//        String name = scanner.nextLine();
//        System.out.println("Nhập thành phố đang sinh sống ");
//        String city = scanner.nextLine();
//        students.add(new Student(id, name, city));
//        writeToFile("src/ss17_IO_BinaryFile_Serialization/thuc_hanh/data/student.txt", students);
//        List<Student> studentDataFromFile = readDataFromFile("src/ss17_IO_BinaryFile_Serialization/thuc_hanh/data/student.txt");
//        for (Student student : studentDataFromFile) {
//            System.out.println(student);
//        }
//    }
//
//    public static List<Student> readDataFromFile(String path) {
//        List<Student> students = new ArrayList<>();
//        try {
//            FileInputStream fileInputStream = new FileInputStream(path);
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//            students = (List<Student>) objectInputStream.readObject();
//            fileInputStream.close();
//            objectInputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return students;
//    }
//}
