package Test03;

import java.util.Scanner;

public class WeekScheduler {

	Day[] days;
	Scanner sc;
	String[] week = {"월","화","수","목","금","토","일"};
	
	public WeekScheduler() {
		sc = new Scanner(System.in);
		days = new Day[7];
		for (int i=0; i<days.length; i++) {
			days[i] = new Day();
		}
	}
	
	void menu() {
		System.out.println();
		System.out.println("1. 스케줄 생성");
		System.out.println("2. 스케줄 삭제");
		System.out.println("3. 스케줄 수정");
		System.out.println("4. 스케줄 보기");
		System.out.println("0. 스케줄러 종료");
	}
	
	void makeSchedule() {
		System.out.println("등록할 요일을 입력하시오");
		String day = sc.nextLine();
		
		for(int i = 0; i<week.length; i++) {
			if(day.equals(week[i])) {
				
				if(days[i].getSchedule() == null) {
					System.out.println("스케줄을 입력하세요");
					String schedule = sc.nextLine();
					days[i].setSchedule(schedule);
				}else {
					System.out.println(week[i]+"요일은 이미 스케줄이 있습니다.");
				}
			}
		}
	}
	
	void removeSchedule() {
		System.out.println("삭제할 요일을 입력하세요");
		String remove = sc.nextLine();
		for( int i =0; i<week.length; i++) {
			if(remove.equals(week[i])) {
				days[i].setSchedule(null);
			}
		}
	}
	
	void modifySchedule() {
		System.out.println("수정할 요일을 입력하세요");
		String modify = sc.nextLine();
		for( int i =0; i<week.length; i++) {
			if(modify.equals(week[i])) {
				if(days[i].getSchedule() != null) {
					System.out.println("변경할 스케줄을 다시 입력하세요");
					String schedule = sc.nextLine();
					days[i].setSchedule(schedule);
				}else {
					System.out.println("해당 요일에 스케줄이 없으므로 새로운 스케줄을 입력하겠습니까?");
					String yes = sc.nextLine();
					if(yes.equalsIgnoreCase("yes")) {
						System.out.println("스케줄을 다시 입력하세요");
						String schedule = sc.nextLine();
						days[i].setSchedule(schedule);
					}else {
						System.out.println("변경된 스케줄이 없습니다.");
					}
				}
			}
		}
	}
	
	void output() {
		System.out.println("스케줄 전체 출력");
		for (int i = 0; i<days.length; i++) {
			System.out.println(week[i]+"요일 스케줄");
			days[i].output();
		}
	}
	 
	void exit() {
		System.out.println("스케줄러를 종료합니다");
		sc.close();
		System.exit(0);  //프로그램 종료 코드
	}
	 
	void run() {
		while(true) {
			menu();
			System.out.print("작업선택 >>");
			int choice= sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1 : makeSchedule(); break;
			case 2 : removeSchedule(); break;
			case 3 : modifySchedule(); break;
			case 4 : output(); break;
			case 0 : exit(); break;
			default : System.out.println("다시 선택하세요");
			}
		}
	}
}
