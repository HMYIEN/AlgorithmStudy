package week3.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ4963 {
    static int w, h;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dirX = {-1, 1, 0, 0, -1, -1, 1, 1};
    static int[] dirY = {0, 0, -1, 1, -1, 1, -1, 1};
    static Queue<Node> q = new LinkedList<>();
    static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 && h == 0) break;

            map = new boolean[h][w];
            visited = new boolean[h][w];
            int count = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    if (Integer.parseInt(st.nextToken()) == 1) {
                        map[i][j] = true;
                    }
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && map[i][j]) {
                        count++;  // 섬 체크
                        bfs(j, i);
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {
        q.offer(new Node(x, y));
        visited[y][x] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            int curX, curY;
            for (int i = 0; i < 8; i++) {
                curX = cur.x + dirX[i];
                curY = cur.y + dirY[i];

                if (range_check(curX, curY) && !visited[curY][curX] && map[curY][curX]) {
                    q.offer(new Node(curX, curY));
                    visited[curY][curX] = true;
                }
            }
        }
    }

    private static boolean range_check(int x, int y) {
        return x >= 0 && x < w && y >= 0 && y < h;
    }
}
