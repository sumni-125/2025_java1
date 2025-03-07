package day14.인터페이스실습_라이브러리실습_김보성최지태;

import java.util.ArrayList;

public class Homeplus implements Mart {
	ArrayList<Item> list = new ArrayList<>();

	public Homeplus() {
		System.out.println("홈플러스에 오신걸 환영합니다!");
	}

	// 상품을 찾는 메서드 없으면 -1 반환
	private int findItem(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public void addItem(String name, int cnt, int price) {
		int index = findItem(name);
		if (index != -1) {
			list.get(index).updateCnt(cnt);
			System.out.println(name + "을(를) " + cnt + "개 더 추가 했습니다!");
		} else {
			list.add(new Item(name, cnt, price));
			System.out.println(name + "을(를)" + cnt + "개 추가 했습니다!");
		}
	}

	@Override
	public void removeItem(String name, int cnt) {
		int index = findItem(name);
		if (index == -1 || list.size() == 0) {
			System.out.println("삭제할 상품이 업습니다!");
			return;

		} else {
			Item item = list.get(index);
			if (item.getName().equals(name)) {
				if (item.isRemoveAll(cnt)) {
					list.remove(item);
					System.out.println(name + " 을(를) 삭제 했습니다!");
				} else {
					System.out.println(name + " 을(를) " + cnt + "개 삭제 했습니다!");
				}
				return;
			}
			System.out.println("상품 이름을 확인해주세요!");
		}
	}

	@Override
	public void printItems(String pay) {
		int totalPrice = 0;
		System.out.println("===================Homeplus 영수증==================");
		System.out.println("상품명\t\t가격\t개수\t총가격");
		for (Item item : list) {
			System.out.println(item.getName() + "\t\t" + item.getPrice() + "원\t" + item.getCnt() + "개\t"
					+ item.getTotalPrice() + "원");
			totalPrice += item.getTotalPrice();
		}
		System.out.println("==================================================");
		System.out.println("\t\t\t\t" + "총 가격 : " + totalPrice + " " + pay);
		System.out.println("==================================================");
		System.out.println("\n감사합니다 또오세요.");
	}
}