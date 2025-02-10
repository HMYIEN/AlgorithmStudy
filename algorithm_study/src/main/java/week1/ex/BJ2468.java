package week1.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ2468 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            // 각 줄을 공백으로 구분하여 토큰화
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                // 각 토큰을 정수로 변환하여 배열에 저장
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}