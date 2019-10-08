package Queue;

public class Queue {
    private int array[];
    private int tail;
    private int head;
    private static int defaultSize = 10;
    public Queue(){
        array = new int[defaultSize];
        tail = 0;
        head = 0;
    }

    public void expand(){
        int length = array.length;
        int[] temp = new int[array.length*2];
        if(head < tail){
            for(int i = head; i != tail; i++){
                temp[i] = array[i];
            }
            array = temp;
            System.out.println("扩容成功！！！");
            return;
        }

        for(int i = 0; i < length-head; i++){
            temp[i] = array[head+i];
        }

        for(int i = 0; i < tail; i++){
            temp[length-head+i] = array[i];
        }

        head = 0;
        tail = length-1;
        array = temp;
        System.out.println("扩容成功！！");
    }

    public boolean add(int val){
        //空出来一个位置不放元素,这个位置不是指最后一个位置，而是头尾之间的位置。
        if((tail + 1)%array.length == head){
            expand();
            array[tail] = val;
            tail = (tail + 1)%array.length;
            return true;
        }

        array[tail] = val;
        tail = (tail+1)%array.length;
        return true;
    }

    public int poll(){
        if(head == tail){
            System.out.println("队列里没有数据！！！");
            return -1;
        }
        //System.out.println("aha");
        int val = array[head];
        //System.out.println("val:" + val);
        head = (head+1)%array.length;
        return val;
    }

    public int peek(){
        if(head == tail){
            System.out.println("队列里没有数据！！！");
            return -1;
        }
        return array[head];
    }

    public boolean isEmpty(){
        return head == tail;
    }
}
