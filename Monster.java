package test;

import javax.swing.JOptionPane;

class Monster {

	String name;
	int hp = 70;  //몬스터 체력

	// 생성자
	public Monster(String j) {

		name = j;

	}

	
	public void atk(me y) {// 공격

		if (hp > 0) { // 몬스터가 플레이어를 공격
			System.out.println(name + "는 " + y.name + "를 공격했다");
			y.hp = y.hp - 10;

			if (y.hp < 1) { // 주인공이 졌을때 결과
				JOptionPane.showMessageDialog(null, "패배...");
				System.exit(0);
			}

			System.out.println("현재 " + y.name + "의 체력은 " + y.hp + "이다\n"); // 플레어이의 체력 현황 
		}

	}

}
