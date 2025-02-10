package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StudyStringTokenizer {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 사용자로부터 입력을 받기 위한 준비
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a String: ");
        // 사용자로부터 입력 받은 문자열을 StringTokenizer를 사용하여 공백 기준으로 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            // StringTokenizer에서 각 토큰을 하나씩 꺼내어 배열에 정수로 변환하여 저장
            arr[i] = Integer.parseInt(st.nextToken());   // String 받아서 int로 반환 / 1 2 3 4 5 6 입력
        }

        System.out.println(Arrays.toString(arr));
    }
}