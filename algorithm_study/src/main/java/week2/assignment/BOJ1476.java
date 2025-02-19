package week2.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int i = E;
        while (true) {
            if ((i - E) % 15 == 0 && (i - S) % 28 == 0 && (i - M) % 19 == 0) {
                System.out.println(i);
                return;
            }
            i += 15;
        }
    }
}
