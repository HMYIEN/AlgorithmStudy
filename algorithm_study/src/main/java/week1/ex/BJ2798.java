package week1.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ2798 {
    public static void main(String[] args) throws IOException {

        // region 인풋 부분입니다. n m arr
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;
        // 첫 번째 줄에서 n과 m을 공백으로 구분하여 입력 받음
        StringTokenizer st = new StringTokenizer(br.readLine()); // 한 줄 읽어와서 쪼갬
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 두 번째 줄에서 카드의 값을 입력받기 위해 StringTokenizer 사용
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  // 배열에 토큰 하나씩 저장
        }
        System.out.println(Arrays.toString(arr));
        // end region
    }
}