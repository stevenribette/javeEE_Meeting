package file.modele;

import java.util.List;

import meeting.modele.meeting;

public class file {

	public static List<meeting> meeting;
	
	public file() {
		
	}

	public List<meeting> getMeeting() {
		return meeting;
	}

	public static void addMeeting(meeting meeting) {
		int size = file.meeting.size();
		if(size>=10) {
			
		}else {
			file.meeting.add(meeting);
		}
	}
}