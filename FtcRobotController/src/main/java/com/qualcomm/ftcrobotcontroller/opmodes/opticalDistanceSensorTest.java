package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

/**
 * Created by benjamin on 27/02/2016.
 */
public class opticalDistanceSensorTest extends OpMode {

    //Test code for ODS - idea is to put it on the bottom of the robot
    //And for it to detect change between having and not having a floor on the mountain

    OpticalDistanceSensor ODS;

    @Override
    public void init() {

        ODS = hardwareMap.opticalDistanceSensor.get("ODS");

    }

    @Override
    public void loop() {

        //double getLightDetected()
        //Get the amount of light detected by the sensor. 1.0 is max possible light, 0.0 is least possible light.
        //Returns:
        //amount of light, on a scale of 0 to 1

        //int getLightDetectedRaw()
        //Get the amount of light detected by the sensor as an int.
        //        Returns:
        //amount of light, unscaled.

        //Perhaps enabling LED could be fun? have try at some point in init()
        //void enableLed(boolean enable)
        //Enable the LED light
        //Parameters:
        //enable - true to enable; false to disable


        telemetry.addData("ODS.getLightDetected()", ODS.getLightDetected());
        telemetry.addData("ODS.getLightDetectedRaw()", ODS.getLightDetectedRaw());
        telemetry.addData("Right Position", ODS.;
    }


}
