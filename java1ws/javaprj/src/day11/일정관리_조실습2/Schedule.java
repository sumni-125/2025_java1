package day11.일정관리_조실습2;

public class Schedule {

	String name; //이름을 입력받고 이름을 입력화면 일정이 나오는
	String[] categories={"취미","공부","개인"}; 
	String dayMemo; //일정 입력
	String date = "3월1일"; //월 / 일 입력 => "3월1일"
	//String memo;
	String[][] schedules = new String[3][5];
	
	int[] indexs = {0,0,0};//카테고리별 일정 개수 저장
	
	//생성자
	public Schedule() {
		
	}
	public Schedule(String name) {
		this.name=name;
	}
	
	//일정등록
	public void addSchedule(String category, String dayMemo) {//카테고리, 일정 입력받기
		for(int i=0;i<categories.length;i++) {
			if(categories[i].equals(category)) {
				schedules[i][indexs[i]]=dayMemo;
				indexs[i]++;
			}
		}
	}
	
	//전체 일정 출력
	public void printAllSchedule() {
		System.out.println(date + name );
		
		for(int i=0;i<categories.length;i++) {
			System.out.println(categories[i]+" 일정을 출력합니다.");
			for(int j=0;j<indexs[i];j++) {
				System.out.println(schedules[i][j]);
			}
		}
	}
	
	//카테고리별 일정출력
	public void printSchedule(String category) {//카테고리 입력받으면 그 카테고리 일정만 출력
		int index = selectCategory(category);
		System.out.println(date + categories[index] + " 일정을 출력합니다.");
		for(int i=0;i<indexs[index];i++) {
			System.out.println(schedules[index][i]);
		}
	}
	
	//일정 수정
	public void setSchedule(String category, int index) {
		
	}
	
	// 삭제
	public void deleteSchedule(String category, int index) {
		
		
	}
	
	public int selectCategory(String category) {
		int index=0;
		for(int i=0;i<categories.length;i++) {
			if(categories[i].equals(category)) {
				index=i;
			}
		}
		return index;
	}
	
	
	/*이동우 3월1일
	취미 일정입니다.
	ㅏㄴ어리ㅏㄴ얼이나러이나ㅓ*/
	
	
	
	
	
	
	//
	
	
	//조회
	//1. 취미 일정
	// 일정추가한거
	
	//2. 공부
	//일정추가한거
	
	//3. 개인일정
	//일정 추가한거
	
	

	
	
	// 등록 => 할일목록 (카테고리별 일정 등록할 수 있게)
	// 날짜 출력
	// 카테고리 별로 일정 출력할 수 있게
	// 카테고리 선택해서 일정 추가한거 선택하면 변경하거나 삭제할 수 있게
	// 종료
	
	//완료?
	
	
	
}
