package week3.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178 {
    static int N, M;
    static boolean[][] visited;
    static int[][] map;
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};

    static Queue<Node> q = new LinkedList<>();
    static class Node {
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                map[i][j] = Character.getNumericValue(arr[j]);
            }
        }

        visited[0][0] = true;

        bfs(0, 0);

        System.out.println(map[N - 1][M - 1]);
    }

    private static void bfs(int y, int x) {
        q.offer(new Node(x, y));

        while (!q.isEmpty()) {
            Node cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int curX = cur.x + dirX[i];
                int curY = cur.y + dirY[i];

                if (curX < 0 || curY < 0 || curX >= M || curY >= N) {
                    continue;
                }

                if (visited[curY][curX] || map[curY][curX] == 0) {
                    continue;
                }

                q.offer(new Node(curX, curY));
                map[curY][curX] = map[cur.y][cur.x] + 1;
                visited[curY][curX] = true;
            }
        }
    }
}
