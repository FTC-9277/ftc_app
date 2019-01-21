package org.firstinspires.ftc.teamcode.Operation.Subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.FtcExplosivesPackage.Subsystem;

public class ClimbSubsystem extends Subsystem {
    DcMotor climber;
    public final double AUTOCLIMB = 0.23;
    public final double UNHOOK = 0.975;
    public final double TELECLIMB = 0.5;
    public final double REST = 0.3;
    public final double HOOK = 0.85;
    public final double LEVEL = 0.7;

    public ClimbSubsystem(DcMotor climber, OpMode opmode){
        super(opmode);
        this.climber = climber;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public void stop() {

    }

    public void set(double pow){
        climber.setPower(pow);
    }
}