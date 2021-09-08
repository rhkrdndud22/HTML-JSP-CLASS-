package studyobserver;

import java.util.ArrayList;

public class Robot implements UseObserPattern{
	
	public ArrayList<EmergencyStopable> parts= new ArrayList<>();

	@Override
	public void subscribe(EmergencyStopable r) {
		// TODO Auto-generated method stub
		parts.add(r);
	}

	@Override
	public void unsubscribe(EmergencyStopable r) {
		// TODO Auto-generated method stub
		parts.remove(r);
	}

	@Override
	public void notifyParts() {
		// TODO Auto-generated method stub
//		람다버전소스
//		parts.forEach(item -> item.Stop());
		
//		no람다
		for(int i=0; i<parts.size(); i++)
			parts.get(i).Stop();
		
//		for(EmergencyStopable item:parts)
//		items.stop();
	}
	
}
