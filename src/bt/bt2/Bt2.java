package bt.bt2;

public class Bt2 {
    public static void main(String[] args) {
        int[] numbers = {};
        try {
            int maxNumber = findMaxNumber(numbers);
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int findMaxNumber(int[] numbers) throws Exception {
        if (numbers.length == 0) {
            throw new Exception("Mảng rỗng");
        }
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
