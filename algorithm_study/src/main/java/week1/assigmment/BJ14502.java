package week1.assigmment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ14502 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        // 각 행을 읽어와서 배열에 저장
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine()); // 각 행마다 읽어옴
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken()); // 배열에 값 저장
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
