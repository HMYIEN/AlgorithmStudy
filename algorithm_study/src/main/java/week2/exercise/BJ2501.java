package week2.exercise;

import java.io.*;
import java.util.StringTokenizer;

public class BJ2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 입력하는 정수 n과 k가 필요하고
        // count (k번째 정수를 찾을 변수). result(출력하는 정답의 값)
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
            if (count == k) {
                result = i;
                break;
            }
        }
        bw.write(String.valueOf(result) + "\n"); // 문자열 변환해서 넣어줌

        bw.flush();
        br.close();
        bw.close();
    }
}
