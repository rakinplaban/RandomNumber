import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Generates a random large prime number. ");
        double number = Math.random();
        System.out.println("The random number is : "+number);
        Random my_random_var = new Random(number);
        
        System.out.println(my_random_var.primeGenerator());
    }
}