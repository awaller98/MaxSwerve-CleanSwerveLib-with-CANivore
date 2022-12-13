// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.swervedrivespecialties.swervelib.CanPort;
import com.swervedrivespecialties.swervelib.SdsModuleConfigurations;
//import com.swervedrivespecialties.swervelib.Mk4SwerveModuleHelper.GearRatio;
import com.swervedrivespecialties.swervelib.Mk4iSwerveModuleHelper.GearRatio;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    
    
    /* ------ Team 5013 Constants ------ */
    public static final int PCM_ID = 1;
        public static final int FALCON_500_MAX_RPM = 6380;
        public static final int STATUS_LED_PWM_PORT = 1;
        public static final int PNEUMATICS_HUB = 0;
        public static final String CANIVORE_NAME = "Canivore";


    public static final class ControllerConstants {
        public static final int DRIVER_CONTROLLER_PORT = 0;
		public static final int OPERATOR_CONTROLLER_PORT = 1;
		public static final int PROGRAMMER_CONTROLLER_PORT = 2;
        public static final double DEADBAND = 0.05;
    }

    public static final class DrivetrainConstants {
        public static final CanPort PIGEON_ID = new CanPort( 10,CANIVORE_NAME);
        public static final GearRatio SWERVE_GEAR_RATIO = GearRatio.L1;
        /**
         * The maximum voltage that will be delivered to the drive motors.
         * <p>
         * This can be reduced to cap the robot's maximum speed. Typically, this is
         * useful during initial testing of the robot.
         */
        public static final double MAX_VOLTAGE = 12.0;

        public static final class DrivetrainGeometry {

            /**
             * The left-to-right distance between the drivetrain wheels Should be measured
             * from center to center.
             */
            public static final double TRACKWIDTH_METERS = .3683;
            /**
             * The front-to-back distance between the drivetrain wheels. Should be measured
             * from center to center.
             */
            public static final double WHEELBASE_METERS = .3683;

            /**
             * The maximum velocity of the robot in meters per second.
             * <p>
             * This is a measure of how fast the robot should be able to drive in a straight
             * line.
             */
            public static final double MAX_VELOCITY_METERS_PER_SECOND = FALCON_500_MAX_RPM / 60.0
                    * SdsModuleConfigurations.MK4_L2.getDriveReduction()
                    * SdsModuleConfigurations.MK4_L2.getWheelDiameter()
                    * Math.PI;
					//* .69;
            /**
             * The maximum angular velocity of the robot in radians per second.
             * <p>
             * This is a measure of how fast the robot can rotate in place.
             */
            public static final double MAX_ANGULAR_VELOCITY_RADIANS_PER_SECOND = MAX_VELOCITY_METERS_PER_SECOND
                    / Math.hypot(TRACKWIDTH_METERS / 2.0, WHEELBASE_METERS / 2.0);
        }

        public static final class FrontLeftSwerveConstants {
            public static final CanPort STEER_MOTOR_ID = new CanPort(2,CANIVORE_NAME);
            public static final CanPort DRIVE_MOTOR_ID = new CanPort(1,CANIVORE_NAME);
            public static final CanPort ENCODER_ID = new CanPort(12,CANIVORE_NAME);
            //public static final double ENCODER_OFFSET_RADIANS =  -Math.toRadians(126.21);
            public static final double ENCODER_OFFSET_RADIANS =  -Math.toRadians(126.738);            
			public static final int STATES_INDEX = 0;
        }

        public static final class FrontRightSwerveConstants {
            public static final CanPort STEER_MOTOR_ID = new CanPort(4,CANIVORE_NAME);
            public static final CanPort DRIVE_MOTOR_ID = new CanPort(3,CANIVORE_NAME);
            public static final CanPort ENCODER_ID = new CanPort(14,CANIVORE_NAME);
            //public static final double ENCODER_OFFSET_RADIANS = -Math.toRadians(45.35);
            public static final double ENCODER_OFFSET_RADIANS =  -Math.toRadians(45.263);
            public static final int STATES_INDEX = 1;
        }

        public static final class BackLeftSwerveConstants {
            public static final CanPort STEER_MOTOR_ID = new CanPort(6,CANIVORE_NAME);
            public static final CanPort DRIVE_MOTOR_ID = new CanPort(5,CANIVORE_NAME);
            public static final CanPort ENCODER_ID = new CanPort(16,CANIVORE_NAME);
            //public static final double ENCODER_OFFSET_RADIANS = -Math.toRadians(221.92);
            public static final double ENCODER_OFFSET_RADIANS =  -Math.toRadians(222.011);
            public static final int STATES_INDEX = 2;
        }

        public static final class BackRightSwerveConstants {
            public static final CanPort STEER_MOTOR_ID = new CanPort(8,CANIVORE_NAME);
            public static final CanPort DRIVE_MOTOR_ID = new CanPort(7,CANIVORE_NAME);
            public static final CanPort ENCODER_ID = new CanPort(18,CANIVORE_NAME);
            //public static final double ENCODER_OFFSET_RADIANS =  -Math.toRadians(285.83);
            public static final double ENCODER_OFFSET_RADIANS =  -Math.toRadians(258.574);
            public static final int STATES_INDEX = 3;
        }


        // Turning the bot gains used by PIDControllers
        public static final class ThetaGains {
            public static final double kP = 4;
            public static final double kI = 0;
            public static final double kD = .05;
            public static final double kTurnToleranceRad = 0.05;
            public static final double kTurnRateToleranceRadPerS = .25;
        }

        // Driving the bot gains used by PIDControllers
        public static final class TranslationGains {
           // public static final double kP = 2.2956;
		   public static final double kP = 0.15;
            public static final double kI = 0;
            public static final double kD = 0;
            public static final double kA = 0.16089;
            public static final double kV = 2.2528;
            public static final double kS = 0.60483;
        }
        //

    }

    public static final class IntakeConstants {
        public static final int INTAKE_MOTOR = 20;
        public static final int DROP_INTAKE_SOLENOID_CHANNEL = 1;
        public static final int RAISE_INTAKE_SOLENOID_CHANNEL = 0;
		public static final double INTAKE_SPEED = 0.5;
        public static final int ROLLER_SERVO = 0;
    }

    /* ------- End team 5013 Constants ----*/

    /* ---- Brent's Values ----------
    /**
     * The left-to-right distance between the drivetrain wheels
     *
     * Should be measured from center to center.
     */
    //public static final double DRIVETRAIN_TRACKWIDTH_METERS = .3683; // FIXME Measure and set trackwidth
    /**
     * The front-to-back distance between the drivetrain wheels.
     *
     * Should be measured from center to center.
     */
    
    /*
    public static final double DRIVETRAIN_WHEELBASE_METERS = .3683; // FIXME Measure and set wheelbase

    public static final int DRIVETRAIN_PIGEON_ID = 10; // FIXME Set Pigeon ID

    public static final int FRONT_LEFT_MODULE_DRIVE_MOTOR = 9; // FIXME Set front left module drive motor ID
    public static final int FRONT_LEFT_MODULE_STEER_MOTOR = 2; // FIXME Set front left module steer motor ID
    public static final int FRONT_LEFT_MODULE_STEER_ENCODER = 12; // FIXME Set front left steer encoder ID
    public static final double FRONT_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(126.21); // FIXME Measure and set front left steer offset

    public static final int FRONT_RIGHT_MODULE_DRIVE_MOTOR = 3; // FIXME Set front right drive motor ID
    public static final int FRONT_RIGHT_MODULE_STEER_MOTOR = 4; // FIXME Set front right steer motor ID
    public static final int FRONT_RIGHT_MODULE_STEER_ENCODER = 14; // FIXME Set front right steer encoder ID
    public static final double FRONT_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(45.35); // FIXME Measure and set front right steer offset

    public static final int BACK_LEFT_MODULE_DRIVE_MOTOR = 5; // FIXME Set back left drive motor ID
    public static final int BACK_LEFT_MODULE_STEER_MOTOR = 6; // FIXME Set back left steer motor ID
    public static final int BACK_LEFT_MODULE_STEER_ENCODER = 16; // FIXME Set back left steer encoder ID
    public static final double BACK_LEFT_MODULE_STEER_OFFSET = -Math.toRadians(221.92); // FIXME Measure and set back left steer offset

    public static final int BACK_RIGHT_MODULE_DRIVE_MOTOR = 7; // FIXME Set back right drive motor ID
    public static final int BACK_RIGHT_MODULE_STEER_MOTOR = 8; // FIXME Set back right steer motor ID
    public static final int BACK_RIGHT_MODULE_STEER_ENCODER = 18; // FIXME Set back right steer encoder ID
    public static final double BACK_RIGHT_MODULE_STEER_OFFSET = -Math.toRadians(258.83); // FIXME Measure and set back right steer offset
    ----------- End Brent's Values ---------- */

}
