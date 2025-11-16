package frc.robot.controllers;

import edu.wpi.first.wpilibj2.command.button.CommandPS4Controller;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class PS4Controller implements GenericController {
  private final CommandPS4Controller controller;

  public PS4Controller(int port) {
    controller = new CommandPS4Controller(port);
  }

  @Override
  public Trigger getAOrCrossTrigger() {
    return controller.cross();
  }

  @Override
  public Trigger getBOrCircleTrigger() {
    return controller.circle();
  }

  @Override
  public Trigger getXOrSquareTrigger() {
    return controller.square();
  }

  @Override
  public Trigger getYOrTriangleTrigger() {
    return controller.triangle();
  }

  @Override
  public Trigger getLBOrL1Trigger() {
    return controller.L1();
  }

  @Override
  public Trigger getRBOrR1Trigger() {
    return controller.R1();
  }

  @Override
  public Trigger getLTOrL2Trigger() {
    return controller.L2();
  }

  @Override
  public Trigger getRTOrR2() {
    return controller.R2();
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
    return controller.getL2Axis();
  }

  @Override
  public double getRTOrR2Axis() {
    return controller.getR2Axis();
  }
}
