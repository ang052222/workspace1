package kosta.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {

		// 키보드로부터 아이디와 비밀번호를 입력받아서
		// 아이디와 비밀번호가 일치하면 -> 로그인 성공!
		// 아이디 불일치  -> 해당 아이디가 존재하지 않습니다.
		// 비밀번호 불일치 -> 비밀번호가 일치하지 않습니다.
		
		Scanner sc = new Scanner(System.in);
		
		/*
		
		String m_id = "kosta";
		String m_pass = "1234";
		
		System.out.print("아이디 입력 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력 : ");
		String pass = sc.nextLine();
		
		
		
		
		
		
		if(m_id.equals(id)) {
			if(m_pass.equals(pass)) {
				System.out.println("로그인 성공!");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}else {
			System.out.println("해당 아이디가 존재하지 않습니다. ");
		}
		
		
		
		System.out.println("/////////////선생님//////////////");
		
		if(id.equals(m_id) && pass.equals(m_pass) ) {
			System.out.println("로그인 성공!");
		}else {
			if(!id.equals(m_id)) {
				System.out.println("해당 아이디가 존재하지 않습니다. ");
			}else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
		
		*/
		
		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////");
		
		int score = 0;
		System.out.print("점수를 입력하세요 :");
		score = sc.nextInt();
		
		switch (score/10) {
		case 9 :
			System.out.println("A학점");
			break;
		case 8 :
			System.out.println("B학점");
			break;
		case 7 :
			System.out.println("C학점");
			break;
		case 6 :
			System.out.println("D학점");
			break;

		default:
			System.out.println("F학점");
			break;
		}
		
		
		
		
		
	}

}
