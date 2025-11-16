package frc.robot.controllers;

import edu.wpi.first.wpilibj2.command.button.Trigger;

public interface GenericController {
  /**
   * Constructs a Trigger instance around the A button's (XBox) or Cross' (PS4) digital signal.
   *
   * @return a Trigger instance representing the A/Cross button's digital signal attached to the
   *     {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #a(EventLoop)
   */
  Trigger getAOrCrossTrigger();

  /**
   * Constructs a Trigger instance around the B button's (XBox) or Circle's (PS4) digital signal.
   *
   * @return a Trigger instance representing the B/Circle button's digital signal attached to the
   *     {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #b(EventLoop)
   */
  Trigger getBOrCircleTrigger();

  /**
   * Constructs a Trigger instance around the X button's (XBox) or Square's (PS4) digital signal.
   *
   * @return a Trigger instance representing the X/Square button's digital signal attached to the
   *     {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #x(EventLoop)
   */
  Trigger getXOrSquareTrigger();

  /**
   * Constructs a Trigger instance around the Y button's (XBox) or Triangle's (PS4) digital signal.
   *
   * @return a Trigger instance representing the Y/Triangle button's digital signal attached to the
   *     {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #y(EventLoop)
   */
  Trigger getYOrTriangleTrigger();

  /**
   * Constructs a Trigger instance around the left bumper (LB, XBox) or L1 (PS4) button's digital
   * signal.
   *
   * @return a Trigger instance representing the left bumper/L1 button's digital signal attached to
   *     the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #leftBumper(EventLoop)
   */
  Trigger getLBOrL1Trigger();

  /**
   * Constructs a Trigger instance around the right bumper button's (RB, XBox) or R1's (PS4) digital
   * signal.
   *
   * @return a Trigger instance representing the right bumper/R1 button's digital signal attached to
   *     the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   * @see #rightBumper(EventLoop)
   */
  Trigger getRBOrR1Trigger();

  /**
   * Constructs a Trigger instance around the axis value of the left trigger (LT, XBox) or L2 (PS4).
   * The returned trigger will be true when the axis value is greater than 0.5.
   *
   * @return a Trigger instance that is true when the left trigger's axis exceeds 0.5, attached to
   *     the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   */
  Trigger getLTOrL2Trigger();

  /**
   * Constructs a Trigger instance around the axis value of the right trigger (RT, XBox) or R2
   * (PS4). The returned trigger will be true when the axis value is greater than 0.5.
   *
   * @return a Trigger instance that is true when the right trigger's axis exceeds 0.5, attached to
   *     the {@link CommandScheduler#getDefaultButtonLoop() default scheduler button loop}.
   */
  Trigger getRTOrR2();

  /**
   * Get the X axis value of left stick of the controller (both XBox and PS4 controllers). Right is
   * positive.
   *
   * @return The axis value.
   */
  double getLeftX();

  /**
   * Get the X axis value of right stick of the controller (both XBox and PS4 controllers). Right is
   * positive.
   *
   * @return The axis value.
   */
  double getRightX();

  /**
   * Get the Y axis value of left stick of the controller (both XBox and PS4 controllers). Back is
   * positive.
   *
   * @return The axis value.
   */
  double getLeftY();

  /**
   * Get the Y axis value of right stick of the controller (both XBox and PS4 controllers). Back is
   * positive.
   *
   * @return The axis value.
   */
  double getRightY();

  /**
   * Get the left trigger (LT, XBox) or L2 (PS2) axis value of the controller. Note that this axis
   * is bound to the range of [0, 1] as opposed to the usual [-1, 1].
   *
   * @return The axis value.
   */
  double getLTOrL2Axis();

  /**
   * Get the right trigger (XBox) or R2 (PS4) axis value of the controller. Note that this axis is
   * bound to the range of [0, 1] as opposed to the usual [-1, 1].
   *
   * @return The axis value.
   */
  double getRTOrR2Axis();
}
