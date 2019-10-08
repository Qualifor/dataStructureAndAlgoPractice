package Stack;

public class MyStack {
    private int array[];
    private int count;
    private static int defaultSize = 10;

    public MyStack(){
        this.array = new int[defaultSize];
        this.count = 0;
    }

    public MyStack(int capacity){
        this.array = new int[capacity];
        this.count = 0;
    }

    public void expand(){
        int temp[] = new int[array.length*2];
        for(int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }
        array = temp;
    }

    public boolean push(int num){
        if(count == array.length){
            System.out.println("容量不够，需要扩容!!!");
            expand();
            array[count++] = num;
            return true;
        }

        array[count++] = num;
        return true;
    }

    public int pop(){
        if(count == 0){
            throw new ArrayIndexOutOfBoundsException(-1);
        }
        return array[--count];
    }

    public int peek(){
        if(count == 0){
            throw new ArrayIndexOutOfBoundsException(-1);
        }
        return array[count-1];
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return count == 0;
    }
}
