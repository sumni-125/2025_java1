package teamproject.copy;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

	static ArrayList<User> users = new ArrayList<>();
	static User LoggedInUser = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> menuname = new ArrayList<>();
		ArrayList<Integer> menucost = new ArrayList<>();
		ArrayList<Integer> menuquantity = new ArrayList<>();

		loop: while (true) {
			if (LoggedInUser == null) {
				System.out.println("1. 회원가입 2. 로그인 3. 종료");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					signUp(sc);
					break;
				case 2:
					login(sc);
					break;
				case 3:
					System.out.println("프로그램 종료");
					System.exit(0);
				default:
					System.out.println("잘못된 입력입니다");
				}
			} else {
				System.out.println("1.커피 2.티 3.음료 4.주문완료");
				int category = Integer.parseInt(sc.nextLine());
				int qty;
				switch (category) {
				case 1:
					Order coffeeOrder = selectCoffee(sc);
					System.out.print("수량을 입력하세요: ");
					qty = Integer.parseInt(sc.nextLine());
					addOrder(menuname, menucost, menuquantity, coffeeOrder, qty);
					break;
				case 2:
					Order teaOrder = selectTea(sc);
					System.out.print("수량을 입력하세요: ");
					qty = Integer.parseInt(sc.nextLine());
					addOrder(menuname, menucost, menuquantity, teaOrder, qty);
					break;
				case 3:
					Order drinkOrder = selectDrink(sc);
					System.out.print("수량을 입력하세요: ");
					qty = Integer.parseInt(sc.nextLine());
					addOrder(menuname, menucost, menuquantity, drinkOrder, qty);
					break;
				case 4:
					print(menuname, menucost, menuquantity);
					break loop;
				default:
					System.out.println("잘못된 입력입니다");
					break;
				}
			}
		}
	}

	static Order selectCoffee(Scanner sc) {
		System.out.println("1.아메리카노 2.메가리카노 3.콜드브루 4.콜드브루라떼 5.카페라떼 6.카페모카 7.바닐라라떼");
		return setCoffee(sc);
	}

	static Order selectTea(Scanner sc) {
		System.out.println("1.복숭아아이스티 2.유자차 3.자몽차");
		return setTea(sc);
	}

	static Order selectDrink(Scanner sc) {
		System.out.println("1.청포도에이드 2.레모네이드 3.라임모히또 4.메가에이드 5.딸기요거트스무디 6.골드키위주스");
		return setDrink(sc);
	}

	public static Order setCoffee(Scanner sc) {
		int choice = Integer.parseInt(sc.nextLine());
		if (choice == 1) {
			return new Americano();
		} else if (choice == 2) {
			return new Megaricano();
		} else if (choice == 3) {
			return new ColdBrew();
		} else if (choice == 4) {
			return new ColdBrewLatte();
		} else if (choice == 5) {
			return new CafeLatte();
		} else if (choice == 6) {
			return new CafeMocha();
		} else if (choice == 7) {
			return new VanillaLatte();
		} else {
			System.out.println("잘못된 입력입니다");
			return null;
		}
	}

	public static Order setTea(Scanner sc) {
		int choice = Integer.parseInt(sc.nextLine());
		if (choice == 1) {
			return new PeachIcedTea();
		} else if (choice == 2) {
			return new CitronTea();
		} else if (choice == 3) {
			return new GrapefruitTea();
		} else {
			System.out.println("잘못된 입력입니다");
			return null;
		}
	}

	public static Order setDrink(Scanner sc) {
		int choice = Integer.parseInt(sc.nextLine());
		if (choice == 1) {
			return new GrapefruitAde();
		} else if (choice == 2) {
			return new LemonAde();
		} else if (choice == 3) {
			return new LimeMojito();
		} else if (choice == 4) {
			return new MegaAde();
		} else if (choice == 5) {
			return new StrawberryYogurtSmoothie();
		} else if (choice == 6) {
			return new GoldKiwiJuice();
		} else {
			System.out.println("잘못된 입력입니다");
			return null;
		}
	}

	static void addOrder(ArrayList<String> menuname, ArrayList<Integer> menucost, ArrayList<Integer> menuquantity,
			Order order, int qty) {
		String itemName = order.Order();
		int itemCost = order.cost();

		for (int i = 0; i < menuname.size(); i++) {
			if (menuname.get(i).equals(itemName)) {
				menuquantity.set(i, menuquantity.get(i) + qty);
				return;
			}
		}

		menuname.add(itemName);
		menucost.add(itemCost);
		menuquantity.add(qty);
	}

	static void signUp(Scanner sc) {
		System.out.println("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String password = sc.nextLine();

		for (User User : users) {
			if (User.id.equals(id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				return;
			}
		}
		users.add(new User(name, id, password));
		System.out.println("회원가입 성공!");
	}

	static void login(Scanner sc) {
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String password = sc.nextLine();

		for (User User : users) {
			if (User.id.equals(id) && User.password.equals(password)) {
				LoggedInUser = User;
				System.out.println(User.name + "님 반갑습니다!");
				return;
			}
		}
		System.out.println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다");
	}

	static void print(ArrayList<String> menu, ArrayList<Integer> cost, ArrayList<Integer> quantity) {
		System.out.println("=========주문내역=========");
		System.out.println("사용자 이름 : " + users.get(0).getName());
		System.out.println("사용자 ID : " + users.get(0).getId());

		int idx = 1;
		int sum = 0;

		System.out.println("-------------------------------------------------------");
		System.out.printf("%-3s %-20s %6s %10s %10s\n", "No", "메뉴", "수량", "단가", "합계");
		System.out.println("-------------------------------------------------------");

		for (int i = 0; i < menu.size(); i++) {
			int totalCost = cost.get(i) * quantity.get(i);
			System.out.printf("%-3d %-20s %6d %10d원 %10d원\n", idx, menu.get(i), quantity.get(i), cost.get(i),
					totalCost);
			sum += totalCost;
			idx++;
		}

		System.out.println("-------------------------------------------------------");
		System.out.printf("%-30s %20d원\n", "총 가격:", sum);
		System.out.println("주문시간 : " + gettingDate());
	}

	static String gettingDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return LocalDateTime.now().format(formatter);
	}
}
