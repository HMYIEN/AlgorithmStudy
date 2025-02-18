package week2.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int i = 1;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (true) {
            if (m < Math.sqrt(i) && Math.sqrt(i) <= n) {
                if (min > Math.sqrt(i)) {
                    min = (int)Math.sqrt(i);
                }
                sum += (int)Math.sqrt(i);
            } else continue;
            i++;
        }

        System.out.println(min);
    }
}
