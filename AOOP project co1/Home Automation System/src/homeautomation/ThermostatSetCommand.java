package homeautomation;

class ThermostatSetCommand implements Command {  
    private Thermostat thermostat;  //thermostat is a object which is created in Thermostat class i.e. thermostat is instance of Thermostat
    
    private int temperature;  

    public ThermostatSetCommand(Thermostat thermostat, int temperature) {  
        this.thermostat = thermostat;  
        this.temperature = temperature;  
    }  

    public void execute() {  
        thermostat.setTemperature(temperature);  
    }  
}   