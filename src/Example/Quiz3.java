package Example;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id, pwd, newid, newpwd;
		int a;
		while(true) {
			System.out.println("----로그인 화면 ------");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.println("4. 종료");
			System.out.println("----로그인 화면 -------");
			a = sc.nextInt();
			
				if(a==2) {
					System.out.println("아이디 :");
					newid = sc.next();
					System.out.println("비밀번호 :");
					newpwd = sc.next();
					System.out.println("회원 가입 완료");
				}else{
					System.out.println("이미 등록된 계정이 있음");
				}

				if(a==1) {
					if(id.equals(newid) && pwd.equals(newpwd)) {
						System.out.println("아이디 :" );
						id = sc.next();
						System.out.println("비밀번호 :");
						pwd = sc.next();
						System.out.println("로그인 성공");
					}else {
						System.out.println("계정이 없습니다.");
					}
					
					if(a==3) {
						id = null;
						pwd = null;
						System.out.println("탈퇴 되었습니다.");
					}
				}
			}
		}
	}

