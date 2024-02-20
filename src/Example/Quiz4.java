package Example;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id=null,pwd=null,newid=null,newpwd=null;
		
		while(true) {
			System.out.println("----로그인 화면----");
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.탈퇴");
			System.out.println("4.종료");
			System.out.println("----로그인 화면----");
			int num = sc.nextInt();
			if(num==4) {
				System.exit(0);
				System.out.println("종료");
			}
				
			switch(num) {
			case 1:
				System.out.println("아이디 :");
				id=sc.next();
				System.out.println("비밀번호 :");
				pwd=sc.next();
				if(id.equals(newid)&& pwd.equals(newpwd)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("회원 계정이 없음");
				}	
			break;
			case 2:
					System.out.println("아이디 :");
					newid=sc.next();
					System.out.println("비밀번호 :");
					newpwd=sc.next();
					if(newid==id) {
					System.out.println("이미 존재");
					}else {
					System.out.println("회원 가입 성공");
						}
				
			break;
			case 3:
				if(id == null) {
					System.out.println("탈퇴할 계정이 없습니다");
				}else {
					System.out.println("탈퇴 완료");
				}
					
				break;
			}
		}
	}
}
