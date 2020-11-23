import java.util.Arrays;

public class Calculator {


    public int sum(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        if(b == 0)throw new ArithmeticException();
        else
            return a/b;
    }

    public int multiply(int a, int b) {
        return a * b ;
    }

    public int min(int a, int b){
        return Math.min(a,b);
    }

    public int max(int a, int b){
        return Math.max(a,b);
    }

    public int minElement(int[] list){
        Arrays.sort(list);
        return list[0];
    }
    public  int maxElement(int[] list){
        Arrays.sort(list);
        for(int i=0; i<list.length/2; i++){
            int temp = list[i];
            list[i] = list[list.length -i -1];
            list[list.length -i -1] = temp;
        }
        return list[0];
    }
}
