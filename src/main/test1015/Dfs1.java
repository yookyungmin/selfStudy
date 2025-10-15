package main.test1015;

/*

DFS — 깊이 우선 탐색

그래프나 2차원 배열에서 연결된 영역을 모두 탐색하는 문제에 자주 등장

💡 실제 문제 예시: 백준 2667 — 단지번호붙이기

지도(0,1)가 주어질 때, 연결된 1의 묶음(단지)을 모두 찾아
각 단지의 크기를 출력하시오.


<그림 1>과 같이 정사각형 모양의 지도가 있다. 1은 집이 있는 곳을, 0은 집이 없는 곳을 나타낸다. 철수는 이 지도를 가지고 연결된 집의 모임인 단지를 정의하고,
단지에 번호를 붙이려 한다. 여기서 연결되었다는 것은 어떤 집이 좌우, 혹은 아래위로 다른 집이 있는 경우를 말한다. 대각선상에 집이 있는 경우는 연결된 것이 아니다.
 <그림 2>는 <그림 1>을 단지별로 번호를 붙인 것이다. 지도를 입력하여 단지수를 출력하고, 각 단지에 속하는 집의 수를 오름차순으로 정렬하여 출력하는 프로그램을 작성하시오.



7
0110100
0110101
1110101
0000111
0100000
0111110
0111000

지도(배열) 형태 → 탐색 문제일 확률 높음

“연결된 것들을 하나의 그룹으로 묶기” → DFS or BFS

‘1’이고 방문 안 한 곳에서 탐색 시작 → 연결된 곳 전부 방문 → 개수 세기

탐색 끝나면 단지 수 +1

결과를 오름차순 정렬 후 출력


🧠 알고리즘 선택

DFS (재귀) 또는 BFS (큐) 모두 가능

깊이 탐색이니까 DFS로 풀이


모든 아파트를 다 돌면서 "단지" 로 묶어줘야한다.
→DFS

붙어있는 아파트들끼리 단지로 묶이니까, 방향 배열로 주변을 탐색해줘야한다
→dx, dy배열

각 단지에 속하는 집의 수를 담아서 오름차순으로 정렬해서 출력해야한다
→ 단지가 몇 개 나올지 모르니까 ArrayList에 담아줄 것이다.


DFS는 대게 스택을 사용하고 모든 노드를 방문하고자 할떄 사용합니다 BFS 보다 간단하게 구현되지만 검색속도자체는 BFS에 비해 느립니다

 🔍 핵심 포인트

dfs 함수는 현재 집에서 상하좌우를 재귀적으로 탐색.

count는 단지에 포함된 집 개수를 셈.

방문 체크(visited[][])는 중복 탐색 방지용.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dfs1 {

    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int count; //단지 내 집 수


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String line = sc.next();
            for(int j = 0; j < N; j++){
                map[i][j] = line.charAt(j) - '0';
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    count = 0;
                    dfs(i,j);
                    result.add(count);
                }
            }
        }


    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        count++;

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (!visited[nx][ny] && map[nx][ny] == 1) {
                    dfs(nx, ny); // 재귀로 연결된 집 탐색
                }
            }
        }
    }

}
