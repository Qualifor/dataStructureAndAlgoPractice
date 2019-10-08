package algorithm;

import java.util.Arrays;

public class ReverseDegree {
    private int num;
    public void mergeSort(int a[], int start, int end){
        if(start >= end){
            return;
        }
        int middle = (start+end)/2;
        mergeSort(a, start, middle);
        mergeSort(a, middle+1, end);
        merge(a, start, middle, end);
    }

    public void merge(int[] a, int start, int middle, int end){
        int i = start;
        int j = middle+1;
        int[] tmp = new int[end-start+1];
        int count = 0;

        while(i <= middle && j <= end){
            if(a[i] < a[j]){
                tmp[count++] = a[i++];
            }else{
                tmp[count++] = a[j++];
                System.out.println("aha?");
                num += middle-i+1;
            }
        }
        while(i <= middle){
            tmp[count++] = a[i++];
        }

        while(j <= end){
            tmp[count++] = a[j++];
        }

        count = 0;
        for(i = start; i <= end; i++){
            a[i] = tmp[count++];
        }
        System.out.println(Arrays.toString(a));
    }

    public void service(){
        int[] v = {1,5,4,3,2};
        mergeSort(v, 0, 4);
        System.out.println("num:" + num);
    }

    public static void main(String[] args) {
        new ReverseDegree().service();
    }
}
