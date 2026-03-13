


 public class AirConditioner {

    
public static boolean knowTheDefaultStateOfAc() { 
      
      boolean on = false;  
        
        return on;  
    }
}

 public static boolean isOff() {
        return !on;  
    }

    public void turnOn() {
        on = true;  
    }

    public boolean isOn() {
        return on;  
    }

