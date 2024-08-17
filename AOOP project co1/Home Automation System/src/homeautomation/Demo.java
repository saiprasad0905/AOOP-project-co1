
package homeautomation;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Light livingRoomLight = new Light();  
	        Thermostat thermostat = new Thermostat();  
	        SecuritySystem securitySystem = new SecuritySystem();  
	        
	        Command lightOn = new LightOnCommand(livingRoomLight);  
	        Command setThermostat = new ThermostatSetCommand(thermostat, 22);  
	        Command activateSecurity = new SecurityActivateCommand(securitySystem);  
	        Command lightOff = new LightOff(livingRoomLight);  
	        
	        RemoteControl remote = new RemoteControl();  
        
	       
	        	
	        // Control light  
	        remote.setCommand(lightOn);  
	        remote.pressButton();  
	        
	        // Set thermostat  
	        
	        remote.setCommand(setThermostat);  
	        remote.pressButton();  
	        	
	        // Activate security
	       remote.setCommand(activateSecurity);  
	        remote.pressButton(); 
	        
	        remote.setCommand(lightOff);  
	        remote.pressButton();  
	        
	        	
	        
	        	
	        	
	       
		

	}

}
