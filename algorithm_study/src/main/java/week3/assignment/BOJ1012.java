package week3.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1012 {
    static int T, M, N, K, X, Y;
    static boolean[][] map;
    static boolean[][] visited;
    static int[] dirX = {0, 0, -1, 1};
    static int[] dirY = {1, -1, 0, 0};
    static int curX, curY;
    static int count;
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
        T = Integer.parseInt(br.readLine()); // 테스트케이스 개수

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            map = new boolean[N][M];
            visited = new boolean[N][M];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                X = Integer.parseInt(st.nextToken());
                Y = Integer.parseInt(st.nextToken());
                map[Y][X] = true;
            }

            count = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (visited[i][j] == false && map[i][j] == true) {
                        count++;

                        bfs(j, i);
                    }
                }
            }
            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {
        q.offer(new Node(x,y));
        visited[y][x] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            for (int i = 0; i < 4; i++) {
                curX = cur.x + dirX[i];
                curY = cur.y + dirY[i];

                if (range_check() && !visited[curY][curX] && map[curY][curX]) {
                    q.offer(new Node(curX, curY));
                    visited[curY][curX] = true;
                }
            }
        }
    }

    private static boolean range_check() {
        return curX >= 0 && curX < M && curY >= 0 && curY < N;
    }
}
