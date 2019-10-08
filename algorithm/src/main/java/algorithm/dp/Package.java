package algorithm.dp;

public class Package {

    public int getMaxValue(int[] v, int[] w, int c){
        int a[] = new int[c+1];
        for(int i = 0; i < w.length; i++){
            for(int j = c; j >= w[i]; j--){
                a[j] = Math.max(a[j], a[j-w[i]]+v[i]);
            }
        }
        return a[c];
    }

    public void service(){
        int[] v = {6,10,12,17};
        int[] w = {1,2,3,4};
        System.out.println(getMaxValue(v, w, 7));

    }

    public static void main(String[] args) {
        new Package().service();
    }
}
