package week2.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받은 걸 숫자로 바꾸고, 한수의 개수 계산해서 출력
        System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
    }

    // 주어진 숫자 num까지의 한수의 개수를 계산하는 함수
    public static int arithmetic_sequence(int num) {
        int cnt = 0; // 한수 카운팅

        // 100 미만의 수는 모두 한수이므로 바로 num을 반환
        if (num < 100) {
            return num;
        }
        else {
            // 100 이상에서는 기본적으로 99까지는 한수로 세었으므로, 카운트를 99로 초기화
            cnt = 99;

            // 100부터 입력받은 num까지의 수들을 차례대로 확인
            for (int i = 100; i <= num; i++) {
                int hun = i / 100;       // 백의 자리
                int ten = (i / 10) % 10; // 십의 자리
                int one = i % 10;        // 일의 자리

                // 각 자릿수 간의 차이가 일정한지 체크
                // ex) 123의 경우 1 → 2 → 3이므로 (2 - 1) == (3 - 2) 이어야 한수
                if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면(한수이면)
                    cnt++;                        // 카운트 증가
                }
            }
        }
        return cnt;  // 최종적으로 한수의 개수 반환
    }
}
