package frc.robot;

public class PortMap {
    
    public class USB {
        public static final int XBOXCONTROLLER = 0; 
    }

    public class CAN {
        public static final int FRONT_LEFT_MOTOR = 3;
        public static final int FRONT_RIGHT_MOTOR = 2;
        public static final int REAR_LEFT_MOTOR = 4;
        public static final int REAR_RIGHT_MOTOR = 1;
        public static final int INTAKE_MOTOR_CONTROLLER = 5;
        public static final int SHOOTER_MOTOR_CONTROLLER = 7;
        public static final int STORAGE_MOTOR_CONTROLLER = 6;
        public static final int ENDGAME_RIGHT_MOTOR = 9;
        public static final int ENDGAME_LEFT_MOTOR = 8;
    }

    public class DIO {
        public static final int BOTTOM_STORAGE = 0;
    }
}

// TODO change intake, storage, shooter, endgame values