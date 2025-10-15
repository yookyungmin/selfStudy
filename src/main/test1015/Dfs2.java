package main.test1015;

import java.util.*;

/*
Stack을 이용해 직접 DFS 흐름을 구현 (재귀 대신 수동 호출 스택)

스택의 push/pop이 재귀 호출의 역할을 대신함

visited를 push 시점에 true로 바꾸면 중복 탐색 방지 가능
 */
public class Dfs2 {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    result.add(dfsStack(i, j));
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for (int n : result) System.out.println(n);
    }

    static int dfsStack(int startX, int startY) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startX, startY});
        visited[startX][startY] = true;
        int count = 0;

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int x = cur[0];
            int y = cur[1];
            count++;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        stack.push(new int[]{nx, ny});
                        visited[nx][ny] = true;
                    }
                }
            }
        }

        return count;
    }
}
