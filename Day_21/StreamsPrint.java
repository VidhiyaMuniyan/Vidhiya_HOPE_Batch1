package Day_21;

import java.util.*;


public class StreamsPrint {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list=Arrays.asList(1,2,3,4,5);
        int sum=list.stream().filter(i -> i%2==1)
                .map(i -> i*i)
                .reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
