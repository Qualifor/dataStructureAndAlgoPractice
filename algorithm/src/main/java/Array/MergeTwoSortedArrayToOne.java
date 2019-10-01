package Array;

import java.util.Arrays;

public class MergeTwoSortedArrayToOne {

    public static int[] merge(int[] a, int[] b){
        int temp[] = new int[a.length+b.length];
        int count = 0;
        int j = 0;
        int i = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                temp[count++] = a[i++];
            }else{
                temp[count++] = b[j++];
            }
        }

        while(i < a.length){
            //System.out.println("enheng");
            temp[count++] = a[i++];
        }
        while(j < b.length){
            temp[count++] = b[j++];
        }

        return temp;
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        int b[] = {2,8};
        System.out.println(Arrays.toString(merge(a, b)));
    }
}
