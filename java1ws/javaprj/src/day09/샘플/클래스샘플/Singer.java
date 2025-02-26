package day09.샘플.클래스샘플;

public class Singer {    
	
	 String name;
	 String album;
	 int release;
	 String track;
	 String GPA;
	
	// 입력
	public void input(String name, String album, int release, String track, String GPA) {
		this.name = name;
		this.album = album;
		this.release = release;
		this.track = track;
		this.GPA = GPA;
	}
	
	// 출력
	public void printInfo() {
		System.out.println(name);
		System.out.println(album);
		System.out.println(release);
		System.out.println(track);
		System.out.println(GPA);
	}
	
}
