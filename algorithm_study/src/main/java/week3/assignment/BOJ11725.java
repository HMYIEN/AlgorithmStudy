package week3.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ11725 {
    static int N;
    static boolean[]visited;
    static int[] parent;
    static List<Integer>[] child;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        child = new ArrayList[N + 1];
        parent = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            child[i] = new ArrayList<>();
        }

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            child[a].add(b);
            child[b].add(a);
        }

        dfs(1);

        for (int i = 2; i <= N; i++) {
            sb.append(parent[i]);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int parentNode) {
        visited[parentNode] = true;

        for (int node : child[parentNode]) {
            if (!visited[node]) {
                parent[node] = parentNode;
                dfs(node);
            }
        }
    }
}
