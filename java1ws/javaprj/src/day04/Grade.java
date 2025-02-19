package day04;

import java.util.Scanner;

// 이름과 국어, 영어, 수학 3과목 점수가 입력된다.
// 개인평균을 구하고 90점 이상이면 "EXCELLENT", 60점 미만이면 "FAIL"을
// 입력자료 및 개인 평균과 함께 출력하고 마지막으로 각 과목별 평균점수를 프린트하는
// 순서도를 작성하시오
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hap = 0;
        double avg = 0;

        System.out.println("이름을 입력하세요");
        String name = sc.next();

        System.out.println("국어점수를 입력하세요");
        int kor = sc.nextInt();
        System.out.println(kor + " 점");

        System.out.println("영어점수를 입력하세요");
        int eng = sc.nextInt();
        System.out.println(eng + " 점");

        System.out.println("수학점수를 입력하세요");
        int math = sc.nextInt();
        System.out.println(math + " 점");

            hap += kor + eng + math;
            System.out.println("\n합계는 " + hap + " 점 입니다.");

            avg = hap/3.0;
            System.out.println("평균은" + avg + " 입니다.");

            if (avg >= 90) {
                System.out.println("합격입니다");
            } else if (avg < 60){
                System.out.println("불합격입니다.");
            }
        }
    }
