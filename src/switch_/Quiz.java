package switch_;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a;
	while(true) {
		System.out.println("날짜를 입력하시오 : ");
		a=input.nextInt();
		int num = a&7;
			if(a==0) {
				System.out.println("일요일");
			}
			if(a==1) {
				System.out.println("월요일");
			}
			if(a==2) {
				System.out.println("화요일");
			}
			if(a==3) {
				System.out.println("수요일");
			}
			if(a==4) {
				System.out.println("목요일");
			}
			if(a==5) {
				System.out.println("금요일");
			}
			if(a==6) {
				System.out.println("토요일");
			}
		

	}
}
}
		/*
		*/
	
