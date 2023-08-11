package frc.robot;

import harkerrobolib.joysticks.XboxGamepad;

public class OI {
    private static OI instance;
    private XboxGamepad driver;

    private OI() {
        driver = new XboxGamepad(Constants.DRIVER_ID);    
    }

    public static OI getInstance() {
        if (instance == null) {
            instance = new OI();
        }
        return instance;
    }

    public XboxGamepad getDriver() {
        return driver;
    }
    
    private void initBindings() {
        driver.getButtonX().whiletrue(new toggleIntake());
    }
}
