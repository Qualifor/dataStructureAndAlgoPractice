package Array;

import java.util.Arrays;

/*
* 实现一个支持动态扩容的数组
* */

public class dynamicExpandArray {
    private class Array{
        private  int[] array;
        private int length;
        private int count;

        public Array(int length){
            array = new int[length];
            this.length = length;
            this.count = 0;
        }

        public void add(int num){
            if(count == length) {
                System.out.println("存储空间占满，需要动态扩容!!");
                int temp[] = new int[length * 2];

                for (int i = 0; i < length; i++) {
                    temp[i] = array[i];
                }
                temp[count++] = num;
                length = length * 2;
                array = temp;
                //System.out.println("array:" + Arrays.toString(array));
                /*array = new int[length];
                array = Arrays.copyOf(temp, length);*/
            }else{
                array[count++] = num;
            }
        }

        @Override
        public String toString() {
            int[] temp1 = new int[count];
            temp1 = Arrays.copyOf(array, count);
            return Arrays.toString(temp1);
        }
    }

    public void service(){
        Array array = new Array(10);
        for(int i = 1; i <= 10; i++){
            array.add(i);
        }
        System.out.println(array);
        for(int i = 11; i <= 21; i++){
            array.add(i);
        }
        array.add(11);
        System.out.println(array);
        System.out.println(array.length);
    }

    public static void main(String[] args) {

        new dynamicExpandArray().service();
    }
}
