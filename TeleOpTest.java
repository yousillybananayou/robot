package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "TeleOpTest (Blocks to Java)", group = "test")
public class TeleOpTest extends LinearOpMode {

    private DcMotor motor1;
    private DcMotor motor2;
    private DcMotor motor3;
    private DcMotor motor4;

    /**
     * This function is executed when this Op Mode is selected from the Driver Station.
     */
    @Override
    public void runOpMode() {
        double tgtPowerLeft;
        double tgtPowerRight;
        double tgtPowerLeft1;
        double tgtPowerRight1;

        motor1 = hardwareMap.dcMotor.get("motor1");
        motor2 = hardwareMap.dcMotor.get("motor2");
        motor3 = hardwareMap.dcMotor.get("motor3");
        motor4 = hardwareMap.dcMotor.get("motor4");

        // Put initialization blocks here.
        waitForStart();
        // Put run blocks here.
        while (opModeIsActive()) {
            // Put loop blocks here.
            tgtPowerLeft = -gamepad1.left_stick_y;
            tgtPowerLeft1 = -gamepad2.left_stick_y;
            tgtPowerRight = -gamepad1.right_stick_y;
            tgtPowerRight1 = -gamepad2.right_stick_y;
            motor1.setPower(tgtPowerLeft);
            motor3.setPower(tgtPowerLeft1);
            motor2.setPower(tgtPowerRight);
            motor4.setPower(tgtPowerRight1);
            telemetry.addData("Target 1 Power", tgtPowerLeft);
            telemetry.addData("Target 2 Power", tgtPowerRight);
            telemetry.addData("Motor 1 Power", motor1.getPower());
            telemetry.addData("Motor 2 Power", motor2.getPower());
            telemetry.update();
            idle();
        }
    }
}