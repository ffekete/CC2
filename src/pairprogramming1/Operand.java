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
public class Operand extends Item{
    
    private double operand;
    
    public Operand(double operand)
    {
        this.operand = operand;
    }
    
    public double getOperand()
    {
        return this.operand;
    }
}
