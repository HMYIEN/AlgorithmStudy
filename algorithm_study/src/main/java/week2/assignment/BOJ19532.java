package week2.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

//        int x = 0;
//        int y = 0;
//
//        for (int i = -999; i <= 999; i++) {
//            for (int j = -999; j <= 999; j++) {
//                if ((a * i + b * j) == c && (d * i + e * j) == f) {
//                    x = i;
//                    y = j;
//                    break;
//                }
//            }
//        }
//        System.out.println(x + " " + y);

        StringBuilder sb = new StringBuilder();

        int x = (c * e - b * f) / (a * e - b * d);
        int y = (c * d - f * a) / (b * d - e * a);

        sb.append(x);
        sb.append(" ");
        sb.append(y);

        System.out.println(sb);
    }
}