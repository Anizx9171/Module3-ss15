package bt.bt4;

import config.Config;

import java.util.ArrayList;
import java.util.List;

public class Bt4{
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi chuyển ra chữ");
        String inputString = Config.scanner().nextLine();
        List<Integer> integerList = new ArrayList<>();
        String[] stringArray = inputString.split("");
        for (String str : stringArray) {
            try {
                int number = Integer.parseInt(str);
                integerList.add(number);
            } catch (NumberFormatException e) {
                integerList.add(0);
                System.out.println("Phát hiện ký tự không phải số nguyên: " + str);
            }
        }
        System.out.println("List số nguyên: " + integerList);
    }
}
