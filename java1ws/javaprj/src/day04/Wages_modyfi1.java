package day04;

import java.util.Scanner;

// 입력자료로 사원의 이름과 구분코드와 작업시간이 들어온다.
// 이때 구분코드가
// 1이면 시간당 2000원
// 2이면 시간당 2500원
// 3이면 시간당 3000원
// 4이면 시간당 4000원으로 계산하여 임금을 출력하는 순서를 구현하세요
public class Wages_modyfi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 0;

        System.out.println("이름을 입력하세요");
        String name = sc.next();

        System.out.println("시간을 입력하세요 : ");
            int hours = sc.nextInt();
            System.out.println("일한 시간 : "+hours);

            System.out.println("1 , 2 , 3 , 4 중에서 코드를 입력하세요 : ");
            int code = sc.nextInt();
            switch (code) {
                case 1:
                    money = 2000;
                    System.out.println("1년차 알바생 : " + money + "원");
                    break;
                case 2:
                    money = 2500;
                    System.out.println("2년차 알바생 : " + money + "원");
                    break;
                case 3:
                    money = 3000;
                    System.out.println("3년차 알바생 : " + money + "원");
                    break;
                case 4:
                    money = 4000;
                    System.out.println("4년차 알바생 : " + money + "원");
                    break;
            }
            System.out.println("\n이름 : " + name + "\n" + "일한시간 : " + hours + "\n" + "구분코드 : " + code);
            System.out.println("\n"+ name +" 님의" + " 임금은 " + (money*hours) + " 원 입니다");
        }
    }


