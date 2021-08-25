package Test03;

public class Day {

	String schedule;

	public Day() {}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getSchedule() {
		return schedule;
	}

	void output() {
		if(schedule == null) {
			System.out.println("없음");
		}else {
			System.out.println(schedule);
		}
	}
}
