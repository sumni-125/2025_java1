package day09.짝궁실습;

public class students {
	String name;
	String gender;
	int age;
	String favorite;
	String reluctant;
	String hobby;
	
	public void porfile(String name, String gender, int age, String favorite, String reluctant, String hobby)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.favorite = favorite;
		this.reluctant = reluctant;
		this.hobby = hobby;
	}
	
	public void print()
	{
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);
		System.out.println("나이: " + age);
		System.out.println("좋아하는 것: " + favorite);
		System.out.println("싫어하는 것: " + reluctant);
		System.out.println("취미: " + hobby);
	}
}