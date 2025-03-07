package day14.인터페이스실습_라이브러리실습_김보성최지태;

public interface Mart {
	// 상품 추가하는 메서드
	void addItem(String name, int cnt, int price);

	// 상품 삭제하는 메서드
	void removeItem(String name, int cnt);

	// 상품 전체를 출력하는 메서드 (결제 방식을 받는다)
	void printItems(String pay);
}