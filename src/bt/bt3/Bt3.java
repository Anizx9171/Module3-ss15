package bt.bt3;

public class Bt3 {
    public static void main(String[] args) {
        int[] arr = {1,5,5,6,10,8,9};
        System.out.println(sumArr(arr));
        try {
            int sum = sumArr(arr);
            System.out.println("Tổng của mảng là: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("?");
        }
    }
    private static int sumArr(int[] arr){
        int sum = 0;
        for (int j : arr) {
            try {
                sum += Integer.parseInt(String.valueOf(j));
            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }
        }
        return sum;
    }
}
