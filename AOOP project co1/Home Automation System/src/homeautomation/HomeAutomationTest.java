package homeautomation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HomeAutomationTest {
    private Light livingRoomLight;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private RemoteControl remote;

    @BeforeEach
    void setUp() {
        livingRoomLight = new Light();
        thermostat = new Thermostat();
        securitySystem = new SecuritySystem();
        remote = new RemoteControl();
    }

    @Test
    void testLightOnCommand() {
        Command lightOn = new LightOnCommand(livingRoomLight);
        remote.setCommand(lightOn);
        remote.pressButton();
        assertTrue(livingRoomLight.isOn()); // Verify the light is on
    }

    @Test
    void testThermostatSetCommand() {
        Command setThermostat = new ThermostatSetCommand(thermostat, 22);
        remote.setCommand(setThermostat);
        remote.pressButton();
        assertEquals(22, thermostat.getTemperature()); // Verify the thermostat is set to 22 degrees
    }

    @Test
    void testSecurityActivateCommand() {
        Command activateSecurity = new SecurityActivateCommand(securitySystem);
        remote.setCommand(activateSecurity);
        remote.pressButton();
        assertTrue(securitySystem.isActivated()); // Verify the security system is activated
    }
}
