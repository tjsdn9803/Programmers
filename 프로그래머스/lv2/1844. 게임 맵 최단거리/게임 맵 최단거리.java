import java.util.*;

class Solution{ 
public static int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();
        visited[0][0] = true;
        queue.add(new int[] {0,0,1}); //{현재 위치, 현재위치, 총 수}

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,1,-1};
        int answer = 0;

        while(queue.isEmpty() == false){
            int[] currPoint = queue.remove();
            if(currPoint[0] == n-1 && currPoint[1] == m-1){
                return currPoint[2];
            }
            for (int i = 0; i < 4; i++) {
                int xx = dx[i] + currPoint[0];
                int yy = dy[i] + currPoint[1];
                if(xx >= 0 && xx < n && yy >= 0 && yy < m){
                    if(maps[xx][yy] == 1 && !visited[xx][yy]){
                        visited[xx][yy] = true;
                        queue.add(new int[] {xx, yy, currPoint[2]+1});
                    }
                }

            }
        }
        return -1;
    }
}
// class Solution {//dfs코드 시간초과 발생
//     int[] dx = {1, 0, -1, 0};
//     int[] dy = {0, 1, 0, -1};
//     int answer = Integer.MAX_VALUE;
//     boolean[][] visited;

//     public int solution(int[][] maps) {
//         visited = new boolean[maps.length][maps[0].length];
//         dfs(maps, 0,0,1);
//         if(answer == Integer.MAX_VALUE){
//             answer = -1;
//         }
//         return answer;
//     }

//     public void dfs(int[][] maps, int x, int y,int cnt){
//         if(x==maps.length-1 && y==maps[0].length-1){
//             answer = Math.min(answer, cnt);
//             return;
//         }

//         for(int i = 0 ; i < 4; i++){
//             int nx = x + dx[i];
//             int ny = y + dy[i];
//             if(nx<0 || ny <0 || nx >= maps.length || ny>= maps[0].length) continue;
//             if(!visited[nx][ny] && maps[nx][ny] != 0){
//                 visited[nx][ny] = true;
//                 dfs(maps, nx, ny, cnt + 1);
//                 visited[nx][ny] = false;
//             }
//         }
//     }
// }