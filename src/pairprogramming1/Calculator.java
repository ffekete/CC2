/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairprogramming1;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tamas_Vitai
 */
public class Calculator {
    
    private Stack<Item> items = new Stack<>();
    
    private void processStack(){
        while(items.size() > 1){
            double op1 = ((Operand)items.pop()).getOperand();
            String operator = ((Operator)items.pop()).getOperator();
            double op2 = ((Operand)items.pop()).getOperand();
            double result = 0;
            
            switch (operator)
            {
                case "+":
                    result = (op1+op2);
                    break;
                case "-":
                    result = (op2-op1);
                    break;
                case "X":
                    result = (op1*op2);
                    break;
                case "/":
                    result = (op2/op1);
                    break;
                default:
                        throw new IllegalArgumentException("No such operator.");
            }
            
            items.push(new Operand(result));
        }
    }
    
    public double execute(String input)
    {
        Pattern p = Pattern.compile("\\((.+)\\)");
        Matcher m = p.matcher(input);
        
        if(m.find()){
            input = input.replace("("+m.group(1)+")", Double.toString(execute(m.group(1))));
            System.out.println("New input is: "+input);
        }
        
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter("[-+X/]");
        
        Scanner scann2 = new Scanner(input);
        scann2.useDelimiter("[0-9]*");
        
        
        //double op1 = ((Operand)items.pop()).getOperand();
        double result = 0;        
        String operator;
        
        result = scanner.nextDouble();
        items.add(new Operand(result));
        
        while (scanner.hasNextDouble())
        {
            operator = scann2.next();        
            items.add(new Operator(operator));

            double op2 = scanner.nextDouble();
            items.add(new Operand(op2));

            switch (operator)
            {
                case "(":
                    break;
                case "X":
                case "/":
                    processStack();
                    break;
                default:
                    /* do nothing */
            }
        }
        
        processStack();
        
        return ((Operand)items.pop()).getOperand();
    }
}
