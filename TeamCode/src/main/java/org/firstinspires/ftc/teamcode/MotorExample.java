package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous (name = "MotorExample")
public class MotorExample  extends LinearOpMode{

    DcMotor motorFL;
    DcMotor motorFR;
    DcMotor motorBL;
    DcMotor motorBR;


    @Override
    public void runOpMode(){

        motorFL=hardwareMap.get(DcMotor.class, "motorFL");
        motorFR=hardwareMap.get(DcMotor.class, "motorFR");
        motorBL=hardwareMap.get(DcMotor.class, "motorBL");
        motorBR=hardwareMap.get(DcMotor.class, "motorBR");

        motorFL.setDirection(DcMotorSimple.Direction.FORWARD);
        motorFR.setDirection(DcMotorSimple.Direction.REVERSE);
        motorBL.setDirection(DcMotorSimple.Direction.FORWARD);
        motorBR.setDirection(DcMotorSimple.Direction.REVERSE);

        motorFL.setPower(0);
        motorFR.setPower(0);
        motorBL.setPower(0);
        motorBR.setPower(0);

        waitForStart();

        //drives for 1 second then stops
        motorFL.setPower(0.8);
        motorFR.setPower(0.8);
        motorBL.setPower(0.8);
        motorBR.setPower(0.8);

        sleep(1000);

        motorFL.setPower(0);
        motorFR.setPower(0);
        motorBL.setPower(0);
        motorBR.setPower(0);

    }
}