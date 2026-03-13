package Module8;

public class CountSetBits {
    public static void main(String[] args) {
        int num = 29;
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num = num >> 1;
        }
        System.out.println("Number of set bits: " + count);
    }
}