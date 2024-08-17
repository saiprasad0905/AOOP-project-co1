package homeautomation;

import java.util.function.BooleanSupplier;

class Light {  
    void turnOn() {  
        System.out.println("The light is on");  
    }  
    void turnOff() {  
        System.out.println("The light is off");  
    }
	public BooleanSupplier isOn() {
		// TODO Auto-generated method stub
		return null;
	}  
}  
