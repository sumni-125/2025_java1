package day14.인터페이스실습_라이브러리실습_김보성최지태;

import java.util.ArrayList;

class EMart implements Mart {
	ArrayList<Item> list = new ArrayList<>();

	@Override
	public void addItem(String name, int cnt, int price) {
		for (Item item : list) {
			if (item.getName().equals(name)) {
				item.updateCnt(cnt);
				System.out.println((name + " " + cnt + "개 추가. (총 수량 : " + item.getCnt() + ")"));
				return;
			}
		}
		list.add(new Item(name, cnt, price));
		System.out.println(name + " 아이템이 추가됨");
	}

	@Override
	public void removeItem(String name, int cnt) {
		for (int i = 0; i < list.size(); i++) {
			Item item = list.get(i);
			if (item.getName().equals(name)) {
				if (item.getCnt() > cnt) {
					item.updateCnt(-cnt);
					System.out.println((name + " " + cnt + "개 감소. (총 수량 : " + item.getCnt() + ")"));
					
				} else {
					list.remove(i);
					System.out.println(name + " (이)가 전부 삭제되었습니다.");
				}
				return;
			}
		}
		System.out.println(name + "(를)을 찾을 수 없습니다.");
	}

	@Override
	public void printItems(String pay) {
		int totalPrice = 0;
		System.out.println("\nEMart 영수증");
		if (list.isEmpty()) {
			System.out.println("구매하신 물건이 없습니다.");
		} else {
			for (Item item : list) {
				System.out.println(item);
				totalPrice += item.getTotalPrice();
			}
			System.out.println("총 결제 금액 " + totalPrice + " 원 " + pay);
		}
	}
}
