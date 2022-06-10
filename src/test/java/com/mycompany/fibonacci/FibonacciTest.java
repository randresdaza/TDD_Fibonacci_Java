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
    public void testFibonacci0() {
        assertEquals(null,Fibonacci.CalcularSerie(0));            
    } 
    
    @Test
    public void testFibonacci1() {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        assertEquals(serie,Fibonacci.CalcularSerie(1));            
    } 
    
    @Test
    public void testFibonacci2() {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
        assertEquals(serie,Fibonacci.CalcularSerie(2));            
    }
    
    @Test
    public void testFibonacci3() {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
        serie.add(1);
        assertEquals(serie,Fibonacci.CalcularSerie(3));            
    }
    
    @Test
    public void testFibonacci4() {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
        serie.add(1);
        serie.add(2);
        assertEquals(serie,Fibonacci.CalcularSerie(4));            
    }
    
    @Test
    public void testFibonacci5() {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
        serie.add(1);
        serie.add(2);
        serie.add(3);
        assertEquals(serie,Fibonacci.CalcularSerie(5));            
    }
    
    @Test
    public void testFibonacci6() {
        ArrayList<Integer> serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
        serie.add(1);
        serie.add(2);
        serie.add(3);
        serie.add(5);
        assertEquals(serie,Fibonacci.CalcularSerie(6));            
    }
}
