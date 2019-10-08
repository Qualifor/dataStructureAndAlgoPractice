import BackTrace.Factorial;
import BackTrace.Fibonacci;
import BackTrace.FullPermutation;
import org.junit.Test;

public class TestFibonacci {
    @Test
    public void testfibonacci(){
        for(int i = 10; i > 2; i--){
            System.out.print(new Fibonacci().fibonacci(i) + " ");
        }
    }

    @Test
    public void testFactorial(){
        for(int i = 3; i <= 10; i++){
            System.out.print(new Factorial().getFactorial(i) + " ");
        }
    }

    @Test
    public void testFullPermutation(){
        int[] a = {1,2,3,4};
        int num = 46340*46340;
        System.out.println(num);
       /* System.out.println(new FullPermutation().getAllPermutation(a));
        System.out.println(new FullPermutation().getAllPermutation(a).size());*/
    }
}
