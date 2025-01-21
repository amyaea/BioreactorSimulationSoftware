/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.bioreactorsimulationsoftware;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author yegor
 */
public class BioreactorSimulationProgramTest {
    
    /* Initial Biomass Concentration = 25
    
       Initial Substrate Amount = 150
    
       Fermentation Time = 60
    
       Broth Volume = 20

       Impeller's Speed = 400 */
    
    BioreactorSimulationProgram p = new BioreactorSimulationProgram();
    
    @Test
    public void testUmax() {
            
            assertEquals(p.returnUmax(), 0.6, 0.1);
            
        }
    
    @Test
    public void testXo() {
            
            assertEquals(p.returnXo(), 25, 0.1);
            
        }
    
    @Test
    public void testU() {
            
            assertEquals(p.returnU(), 0.5768269390998936, 0.1);
            
        }
    
    @Test
    public void testX_t() {
            
            assertEquals(p.returnX_t(), 55.16999999999994, 0.1);
            
        }
    
    @Test
    public void testP() {
            
            assertEquals(p.returnP(), 21.20609999999998, 0.1);
            
        }
    
    @Test
    public void testFinBio() {
            
            assertEquals(p.returnFinBio(), p.returnX_t(), 0.1);
            
        }
    
    @Test
    public void testFinEthanCon() {
            
            assertEquals(p.returnFinEthanCon(), 1.0603049999999992, 0.1);
            
        }
    
    @Test
    public void testFinSubCon() {
            
            assertEquals(p.returnFinSubCon(), 108.509804348, 0.1);
            
        }
    
    @Test
    public void testUCost() { 
            
            assertEquals(p.returnUCost(), 0.6891982499999995, 0.1);
            
        }
    
}
