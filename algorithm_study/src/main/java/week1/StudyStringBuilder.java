package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyStringBuilder {
    public static void main(String[] args) throws IOException {
        /* 목표: 코딩 알고리즘 테스트에 필요한 기본 입력 함수를 이해한다. */
        /* 원리는 무시한다. */

        System.out.print("문자열 입력해주세요: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ipnut = br.readLine();
        System.out.println(ipnut);
    }
}