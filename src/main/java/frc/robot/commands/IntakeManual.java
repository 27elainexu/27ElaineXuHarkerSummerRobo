package frc.robot.subsystems;

public class IntakeManual {

    public IntakeManual() {
        addRequirements(Intake.getInstance())
    }

    public void excecute() {
        if (OI.getDriver.getTriggerRight() > 0.5) {
            Intake.getInstance().setOutput(0.3);
        } else {
            Intake.setOutput(0);
        }
        if (OI.getDriver.getTriggerLeft() > 0.5) {
            Intake.getInstance().setOutput(0.3);
        } else {
            Intake.getInstance().setOutput(0);
        }
    }
    public void end(boolean interrupted) {
        Intake.getInstance().setOutput(0);
    }
}
