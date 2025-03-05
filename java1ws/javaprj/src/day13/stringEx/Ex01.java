package day13.stringEx;

public class Ex01 {

	public static void main(String[] args) {
		
		//문자열 : 문자집합, 문자배열 (문자를 연속적으로 여러개 사용)
		//문자 : 문자 한개
		
		char ch = 'A';
		char a = 'h';
		char b = 'e';
		char c = 'l';
		char d = 'l';
		char e = 'o';
		
		System.out.print(a);
		
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		System.out.print(e);
		
		
		char[]word = new char[5];
		word[0]='h';
		word[1]='e';
		word[2]='l';
		word[3]='l';
		word[4]='o';
		
		System.out.println();
		
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]);
		}
		
		char[] word2 = {'h','e','l','l','o'};
		System.out.println();
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]);
		};
	}

}
