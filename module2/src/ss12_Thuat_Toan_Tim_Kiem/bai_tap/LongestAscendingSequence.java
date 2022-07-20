package ss12_Thuat_Toan_Tim_Kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestAscendingSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String string = scanner.nextLine();
        LinkedList<Character> max =new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character>list=new LinkedList<>();
            list.add(string.charAt(i));
            for (int j=i+1;j< string.length();j++){
                if(string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
            }
                if (list.size()>max.size()){
                    max.clear();
                    max.addAll(list);
                }
                list.clear();
        }
        for (Character character: max){
            System.out.println(character);
        }
        System.out.println();
    }
}
