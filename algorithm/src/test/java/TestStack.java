import Stack.MyStack;
import org.junit.Test;
import Stack.MyLinkedStack;

import java.util.Stack;

public class TestStack {
    @Test
    public void testStack(){
        MyStack stack = new MyStack(5);
        for(int i = 0; i < 11; i++){
            stack.push(i);
        }
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }

    }

    @Test
    public void testLinkedList(){
        MyLinkedStack linkedStack = new MyLinkedStack();

        for(int i = 0; i < 10; i++){
            linkedStack.push(i);
        }
        boolean flag = true;
        while(!linkedStack.isEmpty()){
            System.out.print(linkedStack.pop() + " ");
            if(flag){
                linkedStack.push(13);
                flag = false;
            }
        }

        System.out.println();
    }

    @Test
    public void simulateBrowser(){
        //use two stack to realize it

        MyLinkedStack stack1 = new MyLinkedStack();
        MyLinkedStack stack2 = new MyLinkedStack();
        browserNew(stack1, 1);
        browserNew(stack1, 2);
        System.out.println(getBack(stack1, stack2));
        System.out.println(getBack(stack1, stack2));
        System.out.println(getForward(stack2));
        browserNew(stack1, 3);
        System.out.println(getBack(stack1, stack2));
        System.out.println(getForward(stack2));
        System.out.println(getForward(stack2));


    }

    public void browserNew(MyLinkedStack stack, int page){
        stack.push(page);
    }

    public int getBack(MyLinkedStack stack1, MyLinkedStack stack2){
        if(stack1.isEmpty()){
            System.out.println("no pages has been browsered ever");
            return -1;
        }
        stack2.push(stack1.peek());
        return stack1.pop();

    }

    public int getForward(MyLinkedStack stack){
        if(stack.isEmpty()) {
            System.out.println("no pages has been browsered ever");
            return -1;
        }
        return stack.pop();
    }
}
