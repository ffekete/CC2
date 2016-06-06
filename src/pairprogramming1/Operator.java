/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairprogramming1;

/**
 *
 * @author Tamas_Vitai
 */
public class Operator extends Item{
    
    private String operator;
    
    public Operator(String operator)
    {
        this.operator = operator;
    }
    
    public String getOperator()
    {
        return this.operator;
    }
    
}
