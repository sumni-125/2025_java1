package test;

import com.acorn.hyj.HYJ;
import com.acorn.jys.JYS;
import com.acorn.kmh.KMH;
import com.acorn.kym.KYM;
import com.acorn.lsm.LSM;
import com.acorn.oys.oys;
import com.acorn.psw.lib.PSW_lib;
import com.acorn.pyr.pyr;

import day08.KJU;
import day08.PSK;
import 실습.LJH;

public class 황예지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("최하은 짝수개수반환()");
		
		
		System.out.println("황예지 약수(9):"+ HYJ.약수개수(8));
		
		System.out.println("정연수 luck():");
		JYS.luck();
		
		//System.out.println("권지언 randomnum1():");
		//KJU.todaylucky(0, 0);
		
		System.out.println("김민환:");
		//KMH.입금();
		
		System.out.println("김유민:"+KYM.거듭제곱(8));
		
		System.out.println("이정호:"+LJH.Divisor(12));
		
		System.out.println("이수민:");
		LSM.printStar(23);
		
		System.out.println("오윤석");
		//oys.숫자맞추기();
		
		System.out.println("박수경");
		PSK.work("이수민", 89650);
		System.out.println();
		
		int nums[]= {1,8,6,9,5,11,23};
		System.out.println("박시우 :"+PSW_lib.maxNum(nums));
		System.out.println("박예린");
		pyr.date();
		
	}

}
