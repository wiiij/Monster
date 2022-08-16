package test;

import javax.swing.JOptionPane;

public class Result {

	public static void main(String[] args) {

		Monster // 몬스터 변수
		 s = null;

		// 몬스터, 주인공 객체 생성
		Monster m1 = new Monster("파란 달팽이");
		Monster m2 = new Monster("빨간 달팽이");
		me y = new me("주인공");

		System.out.println( m1.name + "와 " + m2.name + "가 나타났다! 당신의 이름은 " + y.name + "이다\n");

		while (true) {

			// 인풋
			String sTarget = JOptionPane.showInputDialog("어느 몬스터를 공격하겠습니까? 1은 " + m1.name + " 2는 " + m2.name);

			// 널값 또는 빈값 입력 시 종료
			if (sTarget == null || sTarget.equals("")) {
				System.exit(0);
			}

			// 형변환
			int target = Integer.parseInt(sTarget);

			// 입력된 숫자에 따라 타격할 몬스터 정하기
			if (target == 1) {

				s = m1;

			} else if (target == 2) {

				s = m2;

			} else {

				System.out.println("올바른 숫자를 입력하세요");
				break;

			}

			// 슬라임이 살아있을때만 공격
			if (s.hp < 1) {


				System.out.println(s.name + "는 이미 죽었다!\n");
				

			} else {

				y.atk(s);
				s.atk(y);

			}
			
			

			// 슬라임이 모두 처리하면 게임 승리
			if (m1.hp < 1 && m2.hp < 1) {
				
				JOptionPane.showMessageDialog( null, "승리!");
				System.exit(0);
			}

		} // while 끝
	}

}
