package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import frc.robot.RobotMap;
import frc.robot.HSTalon;

public class Intake extends SubsystemBase {
    private static Intake instance;
   
    private HSTalon intakeMaster;
    private HSTalon intakeFollower;
    private DoubleSolenoid intakePiston;

    public Intake() {
        intakeMaster = new HSTalon(RobotMap.Elevator.INTAKE_MASTER_ID);
        intakeFollower = new HSTalon(RobotMap.Elevator.INTAKE_FOLLOWER_ID);

        intakeMaster.setInverted(RobotMap.Elevator.INTAKE_MASTER_INVERT);
        intakeFollower.setInverted(RobotMap.Elevator.INTAKE_FOLLOWER_INVERT);

        intakePiston = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 0, 2);
    }

    public void setOutput(double power) {
        intakeMaster.set(ControlMode.PercentOutput, power);
    }

    public void toggleState() {
        if (intakePiston.get() == Value.kOff) {
            intakePiston.set(Value.kReverse);
        } else {
            intakePiston.toggle();
        }
    }
    public static Intake getInstance() {
        if(instance == null) {
          instance = new Intake();  
        }
        return instance;
    }
}
