package algorithm;

public class Package {

    private int max;

    public void dfs(int[] w, int[] v, boolean used[], int capacity, int value){

        if(max < value){
            max = value;
        }

        for(int i = 0; i < v.length; i++){
            if(!used[i] && w[i] <= capacity){
                used[i] = true;
                dfs(w, v, used, capacity-w[i], value+v[i]);
                used[i] = false;
            }
        }
    }



    public void service(){
        int[] v = {6,10,12};
        int[] w = {1,2,3};
        boolean used[] = new boolean[v.length];
        dfs(w,v,used,3,0);
        System.out.println("max:" + max);
    }

    public static void main(String[] args) {
        new Package().service();
    }
}
