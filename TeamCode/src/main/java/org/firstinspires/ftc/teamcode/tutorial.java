package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp (name = "tutorial", group = "linear OpMode")
    public class tutorial extends LinearOpMode {

    @Override
    public void runOpMode(){
        telemetry.addData("status", "Init");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()){
            telemetry.addData("Hello", "my name is _______");
            telemetry.update();
        }

    }

}