package StreamPractices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class PrimeChecker{
    public List<Integer> numbers;
    public PrimeChecker(){
        numbers = new ArrayList<>();
        for(int i=2; i<101; i++) {
            numbers.add(i);
        }
    }
    public boolean isPrime(int number){
        if(number%2==0 && number!=2)
            return false;
        for(int i=3; i<number; i+=2){
            if(number%i==0)
                return false;
        }
        return true;
    }
}
public class PrimeCheckNaiveMethod {
    public static void main(String[] args){
       PrimeChecker numberSeries = new PrimeChecker();
       List<Integer> primeList =
               numberSeries.numbers
               .stream()
               .filter(e->numberSeries.isPrime(e))
               .collect(Collectors.toList());
       System.out.println("List of prime numbers from 2 to 100");
       primeList.forEach(System.out::println);
    }
}
