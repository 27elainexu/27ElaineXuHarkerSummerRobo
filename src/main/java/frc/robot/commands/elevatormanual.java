package frc.robot.commands;

public class elevatormanual extends Indefinitecommand{
    public elevatormanual() {
        addRequirements(Elevator.getInstance());
    }

    public void excecute() {
        double speed = OI.getInstance().getDriver().getRightY();
        if (speed > 0.1) {
            Elevator.getInstance().setElevatorPower(speed);
        }
    
    public void end() {
        Elevator.getInstance().setElevatorPower(0);
    }
}
