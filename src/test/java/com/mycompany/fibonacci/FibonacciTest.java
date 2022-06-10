package com.mycompany.fibonacci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author radaz
 */
public class FibonacciTest {
    
    @Test
    public void testFibonacci() {
        assertEquals(true,Fibonacci.CalcularSerie());            
    }   
}
