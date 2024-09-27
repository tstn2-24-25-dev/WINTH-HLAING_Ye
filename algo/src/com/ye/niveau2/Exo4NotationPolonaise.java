package com.ye.niveau2;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Exo4NotationPolonaise {
    public static void main(String[] args) {

        // read file
        String fileName = "src/com/ye/niveau2/input1.txt";
        String[] resultFile = readFromFile(fileName);

        if ( resultFile == null ){
            System.out.println("Reading file error");
            return ;
        }
        try {
            // calculate the result of polish notation expression
            int result = calculateNotationPolonaise(resultFile);
            
            System.out.println("Output :" + result );

        }catch(Exception e ) {
            // print the error message
            System.out.println("Output :" + e.getMessage());
            }
        }

    // function to read from the file
    public static String[] readFromFile(String fileName){
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if ( line != null ){
                return line.split(" ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    // function to calculation notation polonaise
    public static int calculateNotationPolonaise(String[] resultFile) throws Exception {
        Stack<Integer> stack = new Stack<>();

        // for operation + , - , * , /
        Map<String , Operator > operators = new HashMap<>();

        operators.put("+", Integer::sum);
        operators.put("-", (a,b) -> a - b );
        operators.put("*" , (a,b) -> a*b );
        operators.put("/" , (a,b) -> a/b);

        for ( String operator : resultFile){
            if ( operators.containsKey(operator)){

                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result = operators.get(operator).apply(operand1,operand2);
                stack.push(result);
            }else {
                stack.push(Integer.parseInt(operator));
            }
        }
        return stack.pop();
    }

    @FunctionalInterface
    interface Operator{
        int apply(int a , int b );
    }
}
