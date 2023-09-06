import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;
import java.util.*;
import java.util.stream.Collectors;

public class streamapi {
    public static void main(String[] args) {
        
        List<Integer> l =  Arrays.asList(2,5,10,63,8,60,4);
        
        // Stream API
        // pipelining of functions, no storage, lazy execution..
        // src --> intermediate operations  --> terminal operations

        // Intermediate operators:  Map(), filter(), sorted()
        // Terminal operators: collect(), forEach(), reduce()
         l.stream().filter(x -> x%2 == 0).filter(x -> x>=10).forEach(System.out::println);

         List<Integer> sq = l.stream().map(k -> k*k).collect(Collectors.toList());
         System.out.println(sq);

         int sumeven = l.stream().filter(e -> e%2 == 0).reduce(0, (ans,i) -> ans+i);
         System.out.println(sumeven);


         // *******  To print dupliactes  ***********
         List<Integer> n = Arrays.asList(10,52,31,10,61,10,31);
         Set<Integer> s = new HashSet<>();

         n.stream().filter(x -> !s.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));


         // Count number of times words occured
         String str = "welcome to code decode and code decode welocome you";
        List<String> str1 = Arrays.asList(str.split(" "));

        Map<String, Long> result = str1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);
    }
}
