package ss17_IO_BinaryFile_Serialization.bai_tap.data.Untils;

import ss17_IO_BinaryFile_Serialization.bai_tap.model.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileCar {
    public static void writeFile(List<Car> cars) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/ss17_IO_BinaryFile_Serialization/bai_tap/data/data/car.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(cars);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Car> readFile() {
        List<Car> list = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("src/ss17_IO_BinaryFile_Serialization/bai_tap/data/data/car.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Car>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
