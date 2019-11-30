package StreamPractices;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> even =
                numbers.stream()
                .filter(e->e%2==0)
                .collect(Collectors.toList());
        System.out.println("EVEN");
        even.forEach(System.out::println);
        System.out.println();
        List<Integer> odd =
                numbers.stream()
                .filter(e->e%2==1)
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("ODD");
        odd.forEach(System.out::println);

    }
}
