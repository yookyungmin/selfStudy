package main.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 백준 연결 요소 개수 구하기  11724
 */
public class Dfs  {
    static  boolean visited[];//방문 기록배열 스태틱
    static ArrayList<Integer>[] A; //그래프 데이터 저장 인접리스트
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        //그래프 데이터도 받기 떄문에 데이터가 많으니 버퍼드리더 사용

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); //노드 갯수
        int m = Integer.parseInt(st.nextToken()); //에지 갯수

        visited = new boolean[n+1]; //n+1 사이즈로 선언한 이유는 0번을 쓰지 않기에
         A = new ArrayList[n+1]; //

        for(int i = 1; i<n+1; i++){ //n의 갯수, 갯수만큼 반복문 구하기
            A[i] = new ArrayList<>(); //A인접리스트의 각 ArrayList초기화하기
        }
        for(int i = 1; i<m; i++){  //m의갯수 엣지 갯수만크맙ㄴ복문
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //시작점
            int e = Integer.parseInt(st.nextToken()); //종료점
            A[s].add(e); // 시작점에서 종료점으로 갈수 있고
            A[e].add(s); //종료점에서 시작점을갈수 있기에 양쪽으로 해준다

        }
        int count = 0; //정답
        for(int i = 0; i<n; i++){ //n의갯수만큼반복
            if(!visited[i]){//방문하지 않은 노드가 있으면
                count++; // 연결 노드 갯수 ++
                DFS(i); //DFS  현재 방문하지 않는 노드를 시작점으로 실행
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
    if(visited[v]){//현재 노드가 방문 노드이면
        return; // 더이상 탐색하지 않는다
    }
    visited[v] = true;  //방문 노드가 아니라면 visited 에 true셋팅
        for(int i : A[v]){ //현재 노드에서 연결 되어있는 노드들을 모두 탐색하면서
        if(!visited[i]){  //아직 탐색하지 않은 노드가 있으면
            DFS(i); // 걔를 기준으로 다시 DFS실행
        }
        }
    }
}
