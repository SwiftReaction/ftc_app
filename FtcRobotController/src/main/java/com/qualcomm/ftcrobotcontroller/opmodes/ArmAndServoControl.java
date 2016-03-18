package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by benjamin on 17/03/2016.
 */
public class ArmAndServoControl extends OpMode {

    DcMotor leftArm;
    DcMotor rightArm;

    Servo leftFinger;
    Servo rightFinger;

    @Override
    public void init() {
        leftArm = hardwareMap.dcMotor.get("left_arm");
        rightArm = hardwareMap.dcMotor.get("right_arm");
        leftArm.setDirection(DcMotor.Direction.REVERSE);//reversing the left motor for testing

        leftFinger = hardwareMap.servo.get("left_finger");
        rightFinger = hardwareMap.servo.get("right_finger");
    }

    @Override
    public void loop() {
        /*if (gamepad2.right_stick_y < 0.0) {
            leftArm.setPower(gamepad2.right_stick_y);
            rightArm.setPower(gamepad2.right_stick_y);
        }
        else if(gamepad2.right_stick_y > 0.0) {
            leftArm.setPower(gamepad2.right_stick_y);
            rightArm.setPower(gamepad2.right_stick_y);
        }
        else {
            leftArm.setPower(0);
            rightArm.setPower(0);
        }*/
        leftArm.setPower(gamepad2.right_stick_y);
        rightArm.setPower(gamepad2.right_stick_y);
        rightFinger.setPosition(.7);
        leftFinger.setPosition(.5);
        telemetry.addData("Left figer position", leftFinger.getPosition());
        telemetry.addData("Right finger position",rightFinger.getPosition());
    }
}
