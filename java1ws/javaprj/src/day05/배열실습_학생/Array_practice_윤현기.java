package day05.배열실습_학생;

import java.util.Arrays;

// 좋아하는 음식 5개 저장하고 출력하기 1차원 배열 사용
// 좋아하는 음식에서 오늘 먹을 음식  후보군 3개 뽑아서 출력 하기
public class Array_practice_윤현기 {
    public static void main(String[] args) {
        String[] favoriteFood = {"삼겹살","카레","쭈꾸미","대방어","소곱창"};

        // ⭐️favoriteFood 배열의 길이만큼 todayEatFood에 길이 만들어줌
        String[] todaytEatFood = new String[favoriteFood.length];

        // ⭐️copyOfRange 메서드 :  원하는 값 만큼 지정해서 값을 뽑아내기
        todaytEatFood = Arrays.copyOfRange(favoriteFood,0,3);

        System.out.println("좋아하는 음식은"+ Arrays.toString(favoriteFood) + " 입니다");
        System.out.println("오늘은 먹을 음식의 후보군은 "+Arrays.toString(todaytEatFood)+ " 에요");
    }
}
