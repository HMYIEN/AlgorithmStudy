package week2.exercise;

import java.io.*;

public class BJ17614 {
    public static void main(String[] args) throws IOException {
        // 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 1번 풀이법 -> 숫자로 자릿수 확인하기4
        int clap = 0;

        for (int i = 1; i <= n; i++) {
            // 자릿수를 확인해서 정답을 찾는 로직
            int digit = 0;
            int currentNum = i;
            while(currentNum > 0) {
                digit = currentNum % 10;

                if (digit == 3 || digit == 6 || digit == 9) {
                    clap++;
                }
                currentNum /= 10;
            }
        }

//        // 2번 풀이법 -> 문자열(왼쪽에서 오른쪽으로), 그냥 순서대로
//        // 문자열은 int를 바꾼 다음에, charAt(i) -> char 형태로 찍는다.
//        // 찍어서 3인지 6인지 9인지 확인후 ++
//
//        int clap = 0;
//
//        for (int i = 1; i <= n; i++) {
//            String str = i + "";
//            // 문자열을 다시 문자로 쪼개서, 3,6,9가 들어있는지 확인하는 로직
//            for (int j = 0; j < str.length(); j++) {
//                if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
//                    clap++;
//                }
//            }
//        }

        bw.write(clap + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
