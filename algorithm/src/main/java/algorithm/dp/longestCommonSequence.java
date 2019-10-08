package algorithm.dp;

import java.util.Arrays;

public class longestCommonSequence {

    public int getLongestCommonSequence(String str1, String str2){
        //System.out.println("long");
        int length = 0;
        int a[][] = new int[str1.length()+1][str2.length()+1];

        for(int i = 1; i <= str1.length(); i++){
            for(int j = 1; j <= str2.length(); j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    System.out.println(i + " : " + j);
                    a[i][j] = a[i-1][j-1]+1;
                }else{
                    a[i][j] = Math.max(a[i-1][j], a[i][j-1]);
                }
            }

        }

        return a[str1.length()][str2.length()];
    }

    public void service(){
        String str1 = "adebsdfcd";
        String str2 = "adecd";
        //System.out.println("service");
        System.out.println(getLongestCommonSequence(str1, str2));
    }
    public static void main(String[] args) {
        new longestCommonSequence().service();
    }
}
