package algorithm;

public class eightQueens {
    private int count;
    boolean flag;

    public int getResult(int n) {
        int map[][] = new int[n][n];

        count = 0;
        dfs(map, 0, n);
        //System.out.println("count:" + count);
        return count;
    }

    public void dfs(int[][] map, int cur, int n) {
        if (cur == n) {
            count++;
            if (!flag) {
                list(map);
                flag = true;
            }

            return;
        }

        for (int j = 0; j < n; j++) {
            if (judge(cur, j, map)) {
                map[cur][j] = 1;
                dfs(map, cur + 1, n);
                map[cur][j] = 0;
            }
        }
    }

    public boolean judge(int i, int j, int[][] map) {
        for (int k = 0; k < i; k++) {
            if (map[k][j] == 1) {
                return false;
            }
        }

        for (int k = 0; k < j; k++) {
            if (map[i][k] == 1) {
                return false;
            }
        }

        for(int ki = i-1, kj = j-1; ki >=0 && kj >= 0; ki--, kj--){
            if (map[ki][kj] == 1) {
                return false;
            }
        }

        for(int ki = i-1, kj = j+1; ki >= 0 && kj < map.length; ki--,kj++){
            if (map[ki][kj] == 1) {
                return false;
            }
        }

        return true;
    }

    public void list(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void service() {
        System.out.println(getResult(4));
    }

    public static void main(String[] args) {
        new eightQueens().service();
    }
}
