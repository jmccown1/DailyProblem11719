
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scan;

	public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputParser inputParser = new InputParser();
        Integer k = inputParser.getK();
        List<Integer> list = inputParser.getNumberList();

        if(calculator.isKTheSumOfTwoNumbers(k, list))
        	System.out.println("K is in fact a sum.");
        else
        	System.out.println("Nope. Try again.");
    }
}
