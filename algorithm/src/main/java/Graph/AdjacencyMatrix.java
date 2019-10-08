package Graph;

import java.util.*;

public class AdjacencyMatrix {

    private int[][] orientedGraph(int[] v, int[][] e){
        int[][] array = new int[v.length+1][v.length+1];
        for(int i = 0; i < e.length; i++){
            array[e[i][0]][e[i][1]] = 1;
        }


        return array;
    }

    public int[][] undirectedGraph(int[] v, int[][] e){
        int[][] array = new int[v.length+1][v.length+1];
        for(int i = 0; i < e.length; i++){
            array[e[i][0]][e[i][1]] = 1;
            array[e[i][1]][e[i][0]] = 1;
        }


        return array;
    }

    public int[][] valueGraph(int[] v, int[][] e){
        int[][] array = new int[v.length+1][v.length+1];
        for(int i = 0; i < e.length; i++){
            array[e[i][0]][e[i][1]] = e[i][2];
            //array[e[i][1]][e[i][0]] = e[i][2];
        }


        return array;
    }

    public int dijkstra(int s, int t, int[][] graph){
        int distince[] = new int[graph.length];
        for(int i = 0; i < distince.length; i++){
            if(i == s) {
                //System.out.println("aha" + i);
                distince[i] = 0;
            }else{
                distince[i] = Integer.MAX_VALUE;
            }

        }
        boolean used[] = new boolean[graph.length];
        while(true){
            int index = -1, min = Integer.MAX_VALUE;
            for(int i = 0; i < distince.length; i++){
                //System.out.println(i + " : "+ used[i] + " : " + distince[i]);
                if(!used[i] && distince[i] < min){
                    min = distince[i];
                    index = i;
                    used[i] = true;
                }
            }
            //System.out.println("index: " + index + " " + distince[index]);
            if(index == -1){
                break;
            }

            if(index == t){
                return distince[index];
            }
            for(int i = 0; i < graph[index].length; i++){
                if(graph[index][i] != 0){
                    distince[i] = Math.min(distince[i], distince[index] + graph[index][i]);
                    //System.out.print(i + " : " + distince[i]);
                }
            }
        }
        return distince[t];
    }

    public int topo(int[][] graph){{

    }
        return 0;
    }

    public void service(){
        int[] v = {1,2,3,4,5,6};
//        int[][] e = {{1,3,4}, {1,4,5},{3,5,2},{5,6,1}, {4,5,9}, {2,5,1}, {3,6,3}, {1,6,14}};
        int[][] e = {{1,2}, {2,3}, {3,4}, {1,4}};

        /*int[][] array = orientedGraph(v, e);
        for(int i = 1; i < v.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }*/
       /* int[][] array = undirectedGraph(v, e);
        for(int i = 1; i < v.length+1; i++){
            System.out.println(Arrays.toString(array[i]));
        }*/

        /*int[][] array = orientedGraph(v, e);
        for(int i = 1; i < v.length+1; i++){
            System.out.println(Arrays.toString(array[i]));
        }
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        //dfs(1, array, result);
        bfs(1, array, result);*/
        int[][] array = valueGraph(v, e);
        System.out.println(dijkstra(1,6, array));
    }

    public void dfs(int s, int[][] graph, List result){
        //System.out.print(s);
        for(int i = 0; i < graph[s].length; i++){
            //System.out.println(Arrays.toString(graph[s]));
            if(graph[s][i] != 0){
                result.add(i);
                dfs(i, graph, result);
                result.remove(result.size()-1);
            }
        }
        System.out.println(result);
    }

    public void bfs(int s, int[][] graph, List result){
        Deque<Integer> queue = new ArrayDeque();
        queue.add(s);
        System.out.print(s+" ");
        while(!queue.isEmpty()){
            int p = queue.poll();
            for(int i = 0; i < graph[p].length; i++){
                if(graph[p][i] != 0){
                    queue.add(i);
                    System.out.print(i+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        new AdjacencyMatrix().service();
    }
}
