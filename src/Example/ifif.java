package Example;

import java.util.Scanner;

public class ifif {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		System.out.println("정수 입력");
		i = sc.nextInt();
		if(i==0) {
			System.out.println("0은 입력 안됌");
		}	else if(i%3==0 && i%4==0){
			System.out.println("3의 배수, 4의 배수");
		}	else if(i%3==0)
			System.out.println("3의 배수 ");
		else if(i%4==0) {
		System.out.println("4의 배수");
	} else {
		System.out.println("둘다 해당 안됌");
	}

}
}
