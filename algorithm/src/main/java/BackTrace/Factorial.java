package BackTrace;

public class Factorial {
    public int getFactorial(int num){
        if(num == 1 || num == 2){
            return num;
        }

        return num*getFactorial(num-1);
    }
}
