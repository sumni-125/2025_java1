package day05.배열실습_학생.배열실습_이동우;

public class 배열3차원_만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		String[][][] tvShow = {
				{
					{"무엇이든 물어보세요", "걸어서 세계속으로 트래블홀릭", "TV 유치원", "생생정보 스페셜", "분일일드라마 신데렐라 게임"},
					{"생활의 발견 스페셜", "월드 24", "브레드와 윌크의 세계여행", "누가 누가 잘하나", "놓친예능 따라잡기"}
				},
				{
					{"생방송 투데이", "모닝와이드 (1부)", "맨 인 블랙박스 스페셜", "좋은아침", "SBS 10 뉴스"},
					{"뉴스브리핑", "2025 AFC U-20 아시안컵", "위시캣", "생활의 달인 스페셜", "분꼬리에 꼬리를 무는 그날 이야기"}
				},
				{
					{"오늘N", "MBC 뉴스투데이 1부", "생방송 오늘 아침", "친절한 선주씨(57회)", "930 MBC 뉴스"},
					{"한글용사 아이야", "2시 뉴스 외전", "기분 좋은 날", "5시 뉴스와 경제", "출발! 비디오 여행 스페셜"}
				}
		};
		
//		System.out.println(tvShow[0][0][0]);
//		System.out.println(tvShow[0][1][0]);
//		System.out.println(tvShow[1][0][0]);

		
		
		for(int k = 0; k < tvShow.length; k++) {
			
			
			for(int i = 0; i < tvShow[k].length; i++) {
				
				for(int j = 0; j < tvShow[k][i].length; j++) {
					System.out.println(tvShow[k][i][j]);
				}
			}
		}
	}

}
