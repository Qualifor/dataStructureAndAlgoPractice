package Array;

import java.util.Arrays;

public class sortedArrayForCURD {
    public class Array{
        private int array[];
        private int length;
        private int count;

        public Array(int length){
            this.length = length;
            this.count = 0;
            array = new int[length];
        }

        /**
         * search the first number which is bigger than num from the array, then move the all numbers bigger than or equal to num backword to 1 steps
         * the vacant space in the middle of array is used to store the new number
         * time complexity:O(n)
         * space complexity:O(1)
         * @param num
         */
        public void add(int num){
            if(count == length){
                System.out.println("没有多余的空间了，没办法再进行插入操作！！！");
                return;
            }
            int i = 0;
            for(i = 0; i < count; i++){
                if(array[i] > num){
                    for(int j = count; j >= i+1; j--){
                        array[j] = array[j-1];
                    }
                    array[i] = num;
                    count++;
                    break;
                }
            }
            if(i == count){
                array[count++] = num;
            }
        }

        /**
         *
         * @param num
         * search the number of num as times from the array,then move all the number after the num forward to times step
         * time complexity:O(n)
         * only some variables used to be temporary variables, so space complexity: O(1)
         */
        public void delete(int num){
            int i = 0;
            int tempCount = count;
            for(i = 0; i < count; i++){
                if(array[i] == num){
                    int times = 1;
                    int j = i+1;
                    //System.out.println("j:" + j);
                    for(j = i+1; j < count; j++){
                        if(array[j] == num){
                            times++;
                        }else {
                            int index = j - times;
                            //System.out.println("times:" + times + " index:" + index + " j " + j);
                            for (int k = index; k < count - times; k++) {
                                array[k] = array[k + times];
                            }
                            count = count - times;
                            break;
                        }
                    }

                    if(j == count){
                        count = i;
                    }

                    break;
                }
            }
            //the reason we used tempCount is that count maybe be changed to i when the num to be deleted is the last number in the array
            if(i == tempCount){
                System.out.println("数组中没有该元素，故不可以删除");
            }
        }

        /**
         * time complexity:O(n)
         * space complexity:O(1)
         * @param original
         * @param newNum
         */
        public void update(int original, int newNum){
            int i = 0;
            for(i = 0; i < count; i++){
                if(array[i] == original){
                    break;
                }
            }
            if(i == count){
                System.out.println("数组中没有该元素，故无法进行替换！！！");
                return;
            }
            delete(original);
            add(newNum);
        }

        @Override
        public String toString() {
            int temp[] = new int[count];
            temp = Arrays.copyOf(array, count);
            return Arrays.toString(temp);
        }
    }

    public void service(){
        Array array = new Array(20);
        System.out.print("[");
        for(int i = 0; i < 20; i++){
            int num = (int) (Math.random()*20);
            System.out.print(num+", ");
            array.add(num);
        }
        System.out.println("]");
        System.out.println(array);
        array.delete(18);
        System.out.println(array);
        System.out.println(array.count);
        array.update(6, 10);
        System.out.println(array);
    }

    public static void main(String[] args) {

        new sortedArrayForCURD().service();
    }
}
