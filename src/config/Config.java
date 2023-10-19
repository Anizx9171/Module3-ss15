package config;

import java.util.Scanner;

public class Config {
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
    public static int getInt(){
        int value;
        while (true){
            try{
                System.out.println("Nhập số: ");
                value  = Integer.parseInt(scanner().nextLine());
                return value;
            }catch (Exception e){
                System.err.println("Không hợp lệ");
            }
        }
    }
}
