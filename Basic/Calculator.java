import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public static void main(String[] args) {
        List<Integer> input1 = new ArrayList<>(Arrays.asList(5,6,14,7));
        List<String> input2 = new ArrayList<>(Arrays.asList("Add", "Sub", "Div"));
        System.out.println("The results is: " + calculate(input1, input2));
    }

    public static int calculate(List<Integer> input1, List<String> input2) {
        for(int i = 0; i < input2.size(); i++) {
            if (input2.get(i).equals("Mul") || input2.get(i).equals("Div")) {
                int result = operations(input1.get(i), input1.get(i + 1), input2.get(i));
                input1.remove(i + 1);
                input1.set(i, result);
                input2.remove(i);
            }
        }
        while (!input2.isEmpty()) {
            int result = operations(input1.get(0), input1.get(1), input2.get(0));
            input1.remove(1);
            input1.set(0, result);
            input2.remove(0);
        }
        return input1.get(0);
    }

    public static int operations(int num1, int num2, String operator) {
        int result = 0;
        switch (operator) {
            case "Add": result = num1 + num2; break; 
            case "Sub": result = num1 - num2; break;
            case "Mul": result = num1 * num2; break;
            case "Div": result = num1 / num2; break;
            default: throw new IllegalArgumentException("Unknown Operator" + operator);
        }
        return result;
    }
}
//  * 1 - For the order: since mul & div are superior
//  *  we find either them
//  *  calculate first
//  *  replace the two nums w a result
//  * 2 - Calculate the rest
