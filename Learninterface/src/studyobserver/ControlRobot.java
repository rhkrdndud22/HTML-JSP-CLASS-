package studyobserver;

public class ControlRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robot MyRobot = new Robot();
		
		RobotArm MyRot_Arm = new RobotArm();
		RobotLeg MyRot_Leg = new RobotLeg();
		RobotHead MyRot_Head = new RobotHead();
		

		System.out.println("비상정지시 로봇의 팔을 멈추게한다.");
		MyRobot.subscribe(MyRot_Arm);
		MyRobot.notifyParts();
		
		System.out.println("비상정지시 로봇의 다리와 팔을 멈추게한다.");
		MyRobot.subscribe(MyRot_Leg);
		MyRobot.notifyParts();
		
		System.out.println("비상정지시 로봇의 팔과 다리와 머리을 멈추게한다.");
		MyRobot.subscribe(MyRot_Head);
		MyRobot.notifyParts();
		
		System.out.println("비상정지시 로봇의 팔은 움직여도 되고 다리랑 머"
				+ "리를을 멈추게한다.");
		MyRobot.unsubscribe(MyRot_Arm);
		MyRobot.notifyParts();
	}

}
