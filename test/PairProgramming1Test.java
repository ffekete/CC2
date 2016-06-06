/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pairprogramming1.Calculator;

/**
 *
 * @author Tamas_Vitai
 */
public class PairProgramming1Test {
    
    private Calculator calc = new Calculator();
    
    public PairProgramming1Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void addition()
    {
        double result = calc.execute("1+2");
        Assert.assertEquals(3.0, result);
    }
    
    @Test
    public void substraction()
    {
        double result = calc.execute("3-2");
        Assert.assertEquals(1.0, result);
    }

    @Test
    public void multiplicationParentheses_triple()
    {
        double result = calc.execute("6X(((5+2)))");
        Assert.assertEquals(42.0, result);
    }
    
    @Test
    public void multiplicationParentheses_double()
    {
        double result = calc.execute("6X((5+2))");
        Assert.assertEquals(42.0, result);
    }
    
    @Test
    public void multiplicationParentheses()
    {
        double result = calc.execute("6X(5+2)");
        Assert.assertEquals(42.0, result);
    }
    
    @Test
    public void multiplication()
    {
        double result = calc.execute("6X5");
        Assert.assertEquals(30.0, result);
    }
    
    @Test
    public void division()
    {
        double result = calc.execute("100/10");
        Assert.assertEquals(10.0, result);
    }

    @Test
    public void trimAndAddNumbers()
    {
        double result = calc.execute("1+1+2+4-2");
        Assert.assertEquals(6.0, result);
    }

    @Test
    public void trimAndAddNumbers_1()
    {
        double result = calc.execute("1+1+2+4-2X2");
        Assert.assertEquals(4.0, result);
    }    
    
    @Test
    public void multiplicationAndAdditionWith3Numbers_2()
    {
        double result = calc.execute("5+6/3+3");
        Assert.assertEquals(10.0, result);
    }
    
    @Test
    public void multiplicationAndAdditionWith3Numbers_1()
    {
        double result = calc.execute("5+6/3");
        Assert.assertEquals(7.0, result);
    }

    
    @Test
    public void multiplicationAndAdditionWith3Numbers_0()
    {
        double result = calc.execute("5+2X3");
        Assert.assertEquals(11.0, result);
    }
    
    @Test
    public void multiplicationAndAdditionWith3Numbers()
    {
        double result = calc.execute("5X2+3");
        Assert.assertEquals(13.0, result);
    }
    
    @Test
    public void additionWith3Numbers()
    {
        double result = calc.execute("1+2+3");
        Assert.assertEquals(6.0, result);
    }
    
    @Test
    public void subtractionAndAdditionWith3Numbers()
    {
        double result = calc.execute("1+2+3-4");
        Assert.assertEquals(2.0, result);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
