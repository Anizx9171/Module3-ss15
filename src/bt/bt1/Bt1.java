package bt.bt1;

import config.Config;

public class Bt1 {
    public static void main(String[] args) {
        System.out.println("số thứ 1");
        int a = Config.getInt();
        System.out.println("số thứ 2");
        int b = Config.getInt();
        System.out.printf("kết quả của %d + %d = %d",a,b,a+b);
    }
}
