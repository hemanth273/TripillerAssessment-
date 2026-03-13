package Module6;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int total = n * (n + 1) / 2;
        int missing = total - sum;
        System.out.println("Missing number = " + missing);
    }
}