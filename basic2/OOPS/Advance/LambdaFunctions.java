package sortingAlgo.OOPs;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i< 5; i++){
           list.add(i+1);
        }
        list.forEach((item) -> System.out.println(item * 2));
        Operation sum = (a, b)-> a+b;
        Operation mul =(a, b)-> a*b;
        Operation sub = (a,b) ->a-b;
       
        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,3,sum));
        System.out.println(myCalculator.operate(5,3,mul));
        System.out.println(myCalculator.operate(5,3,sub));

// these forEach and sum are an lanbda function
    }
    int sum(int a , int b){
        return a+b;
    }
    private int operate(int a , int b , Operation op){
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a , int b);
}
