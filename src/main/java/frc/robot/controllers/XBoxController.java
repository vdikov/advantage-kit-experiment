package frc.robot.controllers;

import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class XBoxController implements GenericController {
  private final CommandXboxController controller;

  public XBoxController(int port) {
    controller = new CommandXboxController(port);
  }

  @Override
  public Trigger getAOrCrossTrigger() {
    return controller.a();
  }

  @Override
  public Trigger getBOrCircleTrigger() {
    return controller.b();
  }

  @Override
  public Trigger getXOrSquareTrigger() {
    return controller.x();
  }

  @Override
  public Trigger getYOrTriangleTrigger() {
    return controller.y();
  }

  @Override
  public Trigger getLBOrL1Trigger() {
    return controller.b();
  }

  @Override
  public Trigger getRBOrR1Trigger() {
    return controller.rightBumper();
  }

  @Override
  public Trigger getLTOrL2Trigger() {
    return controller.leftTrigger();
  }

  @Override
  public Trigger getRTOrR2() {
    return controller.rightTrigger();
  }

  @Override
  public double getLeftX() {
    return controller.getLeftX();
  }

  @Override
  public double getRightX() {
    return controller.getRightX();
  }

  @Override
  public double getLeftY() {
    return controller.getLeftY();
  }

  @Override
  public double getRightY() {
    return controller.getRightY();
  }

  @Override
  public double getLTOrL2Axis() {
    return controller.getLeftTriggerAxis();
  }

  @Override
  public double getRTOrR2Axis() {
    return controller.getRightTriggerAxis();
  }
}
