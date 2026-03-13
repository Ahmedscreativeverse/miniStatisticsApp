
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;






    public class AirConditionerTest {
    
    @Test
    
    
    public void getTheDefaultStateOfAc() {
    
    boolean actual = AirConditioner.knowTheDefaultStateOfAc();
    
    boolean expected = false;
    
    
    
    assertEquals(expected, actual);
    
     }
        }
        
       
       @Test
    public void testIfAcIsOn() {
    
    boolean actual = AirConditioner.checkIfAcIsOn();
    
    boolean expected = True;
    
    assertEquals(expected, actual);
    
     
    }
    
      @Test
    public void checkIfAcIsOff() {
        assertTrue(AirConditioner.isOff());
    }

   
    @Test
    public void checkThatAcIsOn() {
        AirConditioner.turnOn();         
        assertTrue(AirConditioner.isOn()); 
    }

    

