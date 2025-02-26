package day09.샘플.클래스샘플;

public class player {

	 private String name;
	 private String color;
	 boolean power;
	 private int index; //현재곡
	 
	 
	 private int volume;
	 private String[] list= {"After LIKE","Pink Venom","새삥","Shut down","Attentin","Hype BOY","LOVE DIVE","FROEVER 1",
			 "그때 그순간 그대로","Cookie","사랑은 늘 도망가","보고싶었어","우리들의 블루스","그랑데이션","다시 만날 수 있을까","TOMBOY",
			 "LAW","사랑인가 봐 "};
	 
	 
	 
	  public void power(){ power = !power; };//on off
	  public void volumeUp() {++volume;} //볼륨증가
	  public void volumeDown() {--volume;} //볼륨감소
	  
	  
	  	
//	 public void ListUP() {index ++ };
//	 public void ListDown() {index -- };
	  
	  
	  public void ListUP() {
		  if(index < list.length-1 )
			  index++;
		  else
			   index=0;    
	  } //다음곡
	  
	  public void ListDown() {
		  if(index > 0 )
			  index--;
		  else
			   index=list.length-1;
	  } //이전곡
	  
	  
	  public void top10list() {
		  System.out.println("Melon Top10");
		  for(int i =0;  i<10;i++) {
			  System.out.println(list[i]);
			  
		  } //top10
	  }//
	
	  public String 랜덤재생하기() {
		  int index = (int)(Math.random()*20); // 0 ~19
		  this. index =index;
		  String result = list[index];
		  return result;				  		   
	  }// 랜덤재생하기
	  
		 
	 
	  
}



