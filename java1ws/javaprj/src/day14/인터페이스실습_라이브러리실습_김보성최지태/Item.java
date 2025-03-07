package day14.인터페이스실습_라이브러리실습_김보성최지태;

public class Item {
	private String name; 	// 상품명
	private int cnt; 		// 개수
	private int price;		// 가격
	private int totalPrice;	// 합계

	// 생성자
	public Item(String name, int cnt, int price) {
		super();
		this.name = name;
		this.cnt = cnt;
		this.price = price;
		calcTotalPrice();
	}

	// 합계 가격 계산후 저장하는 메서드
	private void calcTotalPrice() {
		this.totalPrice = this.cnt * this.price;
	}

	public String getName() {
		return this.name;
	}

	public int getCnt() {
		return this.cnt;
	}

	public int getPrice() {
		return this.price;
	}

	public int getTotalPrice() {
		return this.totalPrice;
	}

	// 개수 수정 하는 메서드 수정되면 바로 합계 가격 계산한다.
	public void updateCnt(int cnt) {
		this.cnt += cnt;
		calcTotalPrice();
	}

	// 전체 삭제를 하는지 확인하는 메서드 삭제할 개수가 크거나 같으면 true반환, 더 적으면 개수 만큼 삭제 후 false 반환
	public boolean isRemoveAll(int cnt) {
		if (this.cnt <= cnt) {
			return true;
		} else {
			this.cnt -= cnt;
			calcTotalPrice();
			return false;
		}
	}

	@Override
	public String toString() {
		return "[상품 명 : " + name + ", 수량 : " + cnt + ", 가격 : " + price + ", 총 금액 : " + totalPrice + "]";
	}

}
