package Example;

import java.util.Scanner;

public class test04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 입력");
	int i = sc.nextInt();
	if ( i ==0) {
		System.out.println("0이다");
	}
	else if(i%3==0 && i%4==0) {
		System.out.println("3의 배수 또는 4의 배수");
	} else if(i%3==0) {
		System.out.println("3의 배수");
	}else if(i%4==0) {
		System.out.println("4의 배수");
	}else if (i%3 !=0 && i%4 != 0) {
		System.out.println(" 둘다 아님");
	}	else {
	System.out.println("0은 잘못 입력했습니다");
}
}
}
