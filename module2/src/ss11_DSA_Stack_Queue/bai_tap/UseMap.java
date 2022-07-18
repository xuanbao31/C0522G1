package ss11_DSA_Stack_Queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class UseMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = scanner.nextLine();
        TreeMap<String, Integer> stringTreeMap = new TreeMap<>();
        String[] strings = string.toLowerCase().split(" ");
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("")) {
                if (stringTreeMap.containsKey(strings[i])) {
                    stringTreeMap.put(strings[i], stringTreeMap.get(strings[i]) + 1);
                } else {
                    stringTreeMap.put(strings[i],1);
                }
            }
        }
        System.out.println(stringTreeMap);
    }


}
