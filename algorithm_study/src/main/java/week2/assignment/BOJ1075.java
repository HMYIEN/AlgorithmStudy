package week2.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1075 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int num = ((n / 100) * 100) % f;

        if (num == 0) {
            System.out.print("00");
        } else {
            System.out.printf("%02d", f - num);
        }
    }
}
