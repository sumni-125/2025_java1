package day07;

import java.util.Scanner;

public class 실습문제2_함수사용_최지태 {
	static Scanner sc = new Scanner(System.in);
	static String[][] schedule = new String[7][5]; // 7일 5개 일정
	static final String[] DAYS = { "월", "화", "수", "목", "금", "토", "일" }; // 요일 이름 저장

	public static int chooseDay() { // 요일 선택후 정수형으로 반환
		while (true) {
			System.out.println("월~일 중 추가할 요일을 선택하세요.");
			String input = sc.next();
			for (int i = 0; i < DAYS.length; i++) { // 요일 선택 확인
				if (DAYS[i].equals(input)) { // 문자열이 같으면 요일 인덱스 저장
					System.out.println(input + "요일 선택됨");
					return i;
				}
			}
			System.out.println("요일 선택이 잘못되었습니다.");
		}
	}

	public static boolean isScheduleFull(int day) { // 특정 요일의 일정이 가득 차 있는지 확인
		for (int i = 0; i < schedule[day].length; i++) {
			if (schedule[day][i] == null) {
				return false;
			}
		}
		System.out.println("일정이 가득 찼습니다.");
		return true;
	}

	public static boolean isScheduleNull(int day) { // 특정 요잏의 일정이 없는지 확인
		if (schedule[day][0] == null) {
			System.out.println("일정이 비어있습니다.");
			return true;
		}
		return false;
	}

	public static void addSchedule(int day) { // 일정 추가
		System.out.println("추가할 일정을 입력하세요. : ");
		String scheduleName = sc.next();
		for (int i = 0; i < schedule[day].length; i++) {
			if (schedule[day][i] == null) {
				schedule[day][i] = scheduleName;
				System.out.println("일정이 추가 되었습니다.");
				return;
			}
		}
	}

	public static int checkScheduleNum() { // 몇 번째 일정을 선택할지 확인
		int scheduleNum = 0;
		while (true) {
			System.out.print("입력 : ");
			scheduleNum = sc.nextInt();
			if (scheduleNum > 0 && scheduleNum <= 5) {
				break;
			}
			System.out.println("입력을 확인해주세요.");
		}
		return scheduleNum;
	}

	public static void deleteSchedule(int day) { // 일정 삭제
		System.out.println("삭제할 일정 번호를 입력하세요. : ");
		int scheduleNum = checkScheduleNum();
		if (schedule[day][scheduleNum] == null) {
			System.out.println("일정을 확인해주세요.");
		} else {
			for (int i = scheduleNum; i < schedule[day].length; i++) {
				schedule[day][i - 1] = schedule[day][i];
			}
			schedule[day][scheduleNum] = null;
		}
	}

	public static void changeSchedule(int day) { // 일정 변경
		System.out.println("변경할 일정 번호를 입력하세요. : ");
		int scheduleNum = checkScheduleNum();
		System.out.print("변경할 일정을 입력하세요 : ");
		String scheduleName = sc.next();
		schedule[day][scheduleNum - 1] = scheduleName;
	}

	public static void printSchedule(int scheduleDay) { // 일정 출력
		System.out.println("<" + DAYS[scheduleDay] + "요일 일정>");
		if (!isScheduleNull(scheduleDay)) {
			System.out.print("[ ");
			for (String content : schedule[scheduleDay]) {
				if (content == null) {
					System.out.print("]\n");
					break;
				} else {
					System.out.print(content + " ");
				}
			}

		}
	}

	public static void main(String[] args) {
		loop: while (true) { // 종료 할 때 까지 반복
			System.out.println("==========");
			System.out.println("일정관리 프로그램");
			System.out.println("1.추가, 2.확인, 3.변경, 4.삭제, 5.종료");
			System.out.print("메뉴 선택 해주세요 : ");
			int menu = sc.nextInt(); // 메뉴 선택 저장
			switch (menu) {
			case 1: { // 일정 추가
				System.out.println("==========");
				System.out.println("일정 추가 입니다.");
				int dayNum = chooseDay();
				if (!isScheduleFull(dayNum)) {
					addSchedule(dayNum);
				}
				break;
			}
			case 2: { // 일정 확인
				System.out.println("==========");
				System.out.println("일정 확인 입니다.");
				for (int i = 0; i < DAYS.length; i++) {
					printSchedule(i);
				}
				break;
			}
			case 3: { // 일정 추가
				System.out.println("==========");
				System.out.println("일정 변경 입니다.");
				int dayNum = chooseDay();
				if (!isScheduleNull(dayNum)) {
					printSchedule(dayNum);
					changeSchedule(dayNum);
				}
				break;
			}
			case 4: { // 일정 삭제
				System.out.println("==========");
				System.out.println("일정 삭제 입니다.");
				int dayNum = chooseDay();
				if (!isScheduleNull(dayNum)) {
					printSchedule(dayNum);
					deleteSchedule(dayNum);
				}
				break;
			}
			case 5: {
				System.out.println("==========");
				System.out.println("종료 합니다.");

				break loop;
			}
			default: {
				System.out.println("==========");
				System.out.println("입력 오류!");
			}
			}

		}
		System.out.println("프로그램 종료");
	}

}
