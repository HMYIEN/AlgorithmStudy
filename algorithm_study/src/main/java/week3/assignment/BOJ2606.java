package week3.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2606 {
    static int node, edge;
    static boolean[] visited;
    static boolean[][] mapping;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());
        visited = new boolean[node + 1];
        mapping = new boolean[node + 1][node + 1];
        count = 0;

        StringTokenizer st;
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            mapping[a][b] = mapping[b][a] = true;
        }

        dfs(1);

        System.out.println(count - 1);
    }

    public static void dfs(int start) {
        visited[start] = true;
        count++;

        for (int i = 1; i <= node; i++) {
            if (mapping[start][i] == true && !visited[i]) {
                dfs(i);
            }
        }
    }
}
