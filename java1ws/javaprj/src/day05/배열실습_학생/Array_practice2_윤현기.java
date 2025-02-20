package day05.배열실습_학생;
// 1차원 배열로 로또번호 에상번호 만들어서 저장하기

//⭐️랜덤 기능 임포트
import java.util.Random;

public class Array_practice2_윤현기 {
    public static void main(String[] args) {

        // ⭐️ 예상 로또번호 후보군 14개 지정하기
        int[] expectationLottoNo = {3,9,27,28,38,39,7,
                                    21,25,27,32,37,38,20};

        // ⭐ 랜덤 수 지정
        Random rand = new Random();

        // ⭐️ 가능성이 높은 로또번호 배열 크기 지정
        int[] likelyLottoNO = new int[7];

        // ⭐ 가능성높은 로또번호의 크기 만큼 순환하여 반복한다 ️
        for (int i = 0; i < likelyLottoNO.length; i++) {
            // ⭐ 로또번호에 i만큼 반복, 랜덤수도 7번 나오게 지정한다
            likelyLottoNO[i] = rand.nextInt(7);
            // ⭐️ 출력 시 예상 로또번호 후보 14개에서 가능성 높은 로또번호(7개)가 랜덤으로 나오게 출력한다
            System.out.println(expectationLottoNo[likelyLottoNO[i]]);
        }

        //System.out.println(expectationLottoNo[rand.nextInt(7)]);





    }
}
