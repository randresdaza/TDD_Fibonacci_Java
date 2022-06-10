package com.mycompany.fibonacci;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author radaz
 */
public class FibonacciTest {
    
    @Test
    public void testFibonacci() {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
        serie.add(1);
        serie.add(2);
        serie.add(3);
        serie.add(5);
        assertEquals(serie,Fibonacci.CalcularSerie(6));            
    } 
    
    @Test
    public void testFibonacci2() {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
        serie.add(5);
        serie.add(2);
        serie.add(3);
        serie.add(5);
        assertEquals(serie,Fibonacci.CalcularSerie(6));            
    } 
}
