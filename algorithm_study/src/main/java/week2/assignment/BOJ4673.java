package week2.assignment;

public class BOJ4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int num = i;
            int sum = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum <= 10000) {
                arr[sum] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }
}
