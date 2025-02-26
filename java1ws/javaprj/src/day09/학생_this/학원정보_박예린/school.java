package day09.학생_this.학원정보_박예린;
import java.util.Scanner;
public class school
{
	String Name;
	String schoolName;
	String Type;
	String Class;
	String Teacher;
	String Manager;
	
	public void setSchool()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		this.Name = sc.next();
		
		System.out.print("학원 이름: ");
		this.schoolName = sc.next();
		
		System.out.print("분야: ");
		this.Type = sc.next();
		
		System.out.print("수강 중인 수업: ");
		this.Class = sc.next();
		
		System.out.print("담당 교수: ");
		this.Teacher = sc.next();
		
		System.out.print("매니저: ");
		this.Manager = sc.next();
	}
	
	public void printSchool()
	{
		System.out.println("이름: " + this.Name);
		System.out.println("학원 이름: " + this.schoolName);
		System.out.println("분야: " + this.Type);
		System.out.println("수강 중인 수업: " + this.Class);
		System.out.println("담당 교수: " + this.Teacher);
		System.out.println("매니저: " + this.Manager);
	}
}
