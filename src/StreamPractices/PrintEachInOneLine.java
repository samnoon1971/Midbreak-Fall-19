package StreamPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Nation{
    public String name, capital, currency;
    Nation(String name, String capital, String currency){
        this.name=name;
        this.capital=capital;
        this.currency=currency;
    }
    public void showInfo()
    {
        System.out.println();
        System.out.println("Country Info");
        System.out.println(name);
        System.out.println(capital);
        System.out.println(currency);
        System.out.println();
    }
}
public class PrintEachInOneLine {
    public static void main(String[] args){
        printNumbers();
        printNations();
    }
    public static void printNumbers(){

        List<Integer>numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.forEach(System.out::println);
        numbers.forEach(value->System.out.println(value));
        numbers.forEach((Integer value) -> System.out.println(value));
    }
    public static void printNations(){
        List<Nation>countries = Arrays.asList(new Nation(
                "Bangladesh", "Dhaka", "BDT"),
                new Nation("China", "Beijing", "RMB"),
                new Nation("USA", "WDC", "USD"),
                new Nation("India", "ND", "INR"));
                countries.forEach(value->value.showInfo());
    }


}
