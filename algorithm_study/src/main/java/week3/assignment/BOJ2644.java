package week3.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2644 {
    static int n, num1, num2, m;
    static boolean map[][];
    static boolean visited[];
    static int answer = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = true;
        }

        dfs(num1, 0);
        System.out.println(answer);
    }

    private static void dfs(int cur, int cnt) {
        if (cur == num2) {
            answer = cnt;
            return;
        }

        visited[cur] = true;

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && map[cur][i]) {
                dfs(i, cnt + 1);
            }
        }
    }
}
