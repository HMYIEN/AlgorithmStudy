package week2.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String row = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int minChanges = Integer.MAX_VALUE;    // 최소변경횟수 저장할 변수 선언

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int startB = 0;  // B로 시작하는 체스판 변경횟수 저장
                int startW = 0;  // W로 시작하는 체스판 변경횟수 저장

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        if (((i + x) + (j + y)) % 2 == 0) {  // 짝수번째 칸
                            // startB -> 짝수 칸 B, startW -> 짝수 칸 W
                            if (board[i + x][j + y] != 'B') startB++;
                            if (board[i + x][j + y] != 'W') startW++;
                        } else {
                            // startB -> 홀수 칸 W, startW -> 홀수 칸 B
                            if (board[i + x][j + y] != 'W') startB++;
                            if (board[i + x][j + y] != 'B') startW++;
                        }
                    }
                }
                minChanges = Math.min(minChanges, Math.min(startB, startW));
            }
        }
        System.out.println(minChanges);
    }
}
