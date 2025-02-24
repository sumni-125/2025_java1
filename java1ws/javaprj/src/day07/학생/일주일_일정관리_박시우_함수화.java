package day06;

import java.util.Scanner;

public class 일주일_일정관리_박시우_함수화 {
    public static void main(String[] args) {
        String[][] schedule = new String[7][7];
        Scanner sc = new Scanner(System.in);

        loop:
        while (true) {
            System.out.print("일정을 추가하려면 요일을 입력 후 일정을 입력하고 조회, 변경, 삭제, 종료를 하려면 '조회', '변경', '삭제', '종료' 를 입력하세요: ");
            String input = sc.next();

            switch (input) {
                case "월": case "화": case "수": case "목": case "금": case "토": case "일":
                    addSchedule(schedule, sc, input);
                    break;
                case "조회":
                    viewSchedule(schedule, sc);
                    break;
                case "삭제":
                    deleteSchedule(schedule, sc);
                    break;
                case "변경":
                    changeSchedule(schedule, sc);
                    break;
                case "종료":
                    System.out.println("종료합니다.");
                    break loop;
                default:
                    System.out.println("올바른 입력이 아닙니다. 다시 입력하세요.");
            }
        }
        sc.close();
    }

    
    // 요일을 숫자로 변환하는 함수
    public static int getDayIndex(String day) {
        switch (day) {
            case "월": return 0;
            case "화": return 1;
            case "수": return 2;
            case "목": return 3;
            case "금": return 4;
            case "토": return 5;
            case "일": return 6;
            default: return -1;
        }
    }

    
    // 일정 개수를 세는 함수
    public static int getScheduleCount(String[] daySchedule) {
        int count = 0;
        for (String schedule : daySchedule) {
            if (schedule == null) break;
            count++;
        }
        return count;
    }

    
    // 일정 추가 함수
    public static void addSchedule(String[][] schedule, Scanner sc, String day) {
        int dayIndex = getDayIndex(day);
        
        int count = getScheduleCount(schedule[dayIndex]);

        System.out.print("추가할 일정을 입력하세요: ");
        schedule[dayIndex][count] = sc.next();
        System.err.println("일정이 추가되었습니다.");
    }

    
    // 일정 조회 함수
    public static void viewSchedule(String[][] schedule, Scanner sc) {
        System.out.print("월요일부터 일요일까지 1~7의 숫자로 조회할 날짜를 입력하세요: ");
        int dayIndex = sc.nextInt() - 1;

        int count = getScheduleCount(schedule[dayIndex]);
        if (count == 0) {
            System.out.println("조회할 일정이 없습니다.");
            return;
        }

        System.out.println("해당 요일 일정:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + schedule[dayIndex][i]);
        }
    }

    
    // 일정 변경 함수
    public static void changeSchedule(String[][] schedule, Scanner sc) {
        System.out.print("월요일부터 일요일까지 1~7의 숫자로 일정을 변경할 날짜를 입력하세요: ");
        int dayIndex = sc.nextInt() - 1;

        int count = getScheduleCount(schedule[dayIndex]);
        if (count == 0) {
            System.out.println("변경할 일정이 없습니다.");
            return;
        }

        System.out.println("변경할 일정의 번호를 입력하세요:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + schedule[dayIndex][i]);
        }

        int scheduleIndex = sc.nextInt() - 1;

        System.out.println("변경할 내용을 입력하세요: ");
        schedule[dayIndex][scheduleIndex] = sc.next();
        System.err.println("일정이 변경되었습니다.");
    }

    
    // 일정 삭제 함수
    public static void deleteSchedule(String[][] schedule, Scanner sc) {
        System.out.print("월요일부터 일요일까지 1~7의 숫자로 일정을 삭제할 날짜를 입력하세요: ");
        int dayIndex = sc.nextInt() - 1;

        int count = getScheduleCount(schedule[dayIndex]);

        System.out.println("삭제할 일정의 번호를 입력하세요:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + schedule[dayIndex][i]);
        }

        int scheduleIndex = sc.nextInt() - 1;

        for (int i = scheduleIndex; i < count - 1; i++) {
            schedule[dayIndex][i] = schedule[dayIndex][i + 1];
        }
        schedule[dayIndex][count - 1] = null; // 마지막 일정 삭제
        System.err.println("일정이 삭제되었습니다.");
    }
}
