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

    Servo servo;

    @Override
    public void init() {
        leftArm = hardwareMap.dcMotor.get("left_arm");
        rightArm = hardwareMap.dcMotor.get("right_arm");
        leftArm.setDirection(DcMotor.Direction.REVERSE);//reversing the left motor for testing

        servo = hardwareMap.servo.get("servo");
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
        servo.setPosition(0.5 + 0.5 * gamepad2.left_stick_y);
    }
}
