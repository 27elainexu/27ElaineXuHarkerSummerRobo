package frc.robot.commands;

public class drivemanual extends Indefinitecommand {
    public drivemanual() {
        addRequirements(Drivetrain.getInstance());


    }
    public void excecute() {
        double speed = OI.getInstance().getDriver().getLeftY();
        double turn = OI.getInstance().getDriver().getLeftX();
        Drivetrain.getInstance().setAngleAndDrive(speed, turn);
    }

    public void end() {
        Drivetrain.getInstance().setAngleAndDrive(0, 0);
    }




    }
}
