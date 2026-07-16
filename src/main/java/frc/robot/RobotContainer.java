package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import frc.robot.Constants.ArmConstants;
import frc.robot.Constants.OIConstants;

public class RobotContainer {

  // --- == ---

  public RobotContainer() {

    configureButtonBindings();
  }

  private void configureButtonBindings() {

  }


  public Command getAutonomousCommand(){return null;};
}
