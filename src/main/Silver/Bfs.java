package main.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
백준 2718 미로탐색하기
 */
public class Bfs {

    static int[] dx = {0, 1, 0, -10}; //x 축
    static int[] dy = {1,0, -1,0}; //y축
    static boolean[][] visited; //방문 기록 저장 배열
    static int[][] A; //2차원 배열
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //row
        M = Integer.parseInt(st.nextToken());   //column
        A = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j = 0; j<N; j++) {
                A[i][j] = Integer.parseInt(line.substring(j, j+1));//j부터 j+1 전까지 짜르기
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]); //인덱스 0부터 시작하니 -1
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j}); //offer데이터넣기
        visited[i][j] = true; ///방문 했으니 true
        while (!queue.isEmpty()){ //q가 빌떄까지 돌리낟 bfs 탐색할수 없을떄까지
            int now[] = queue.poll(); //데이터 뽑기
            for(int k = 0; k<4; k++){ //상하좌우 탐색을 하며 bfs를 돌리기에 4
                int x = now[0]+dx[k];
                int y = now[1]+dy[k];
                if(x >= 0 && y>=0 && x<N && y<N){//배열을 넘어가면 안되고
                    if(A[x][y]!=0&&!visited[x][y]){//변경될 xy가 0이면 안되고 방문한 배열이면 안된다
                        //이제 갈수 있는 곳이다
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]]+ 1;//핵심
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
    }
}
