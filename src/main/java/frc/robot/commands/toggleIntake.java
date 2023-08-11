package frc.robot.commands;

public class toggleIntake extends Instantcommand{
    public toggleIntake() {
        addRequirements(Intake.getInstance()); {
        }
        public void excecute() {
            Intake.getInstance().toggleState();
        }
}
