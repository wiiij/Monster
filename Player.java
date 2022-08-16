package test;

class me {

	String name;
	int hp = 100; // 플레이어 체력

	//생성자
	public me(String i) {
		name = i;
	}

	public void atk(Monster s) { 

		System.out.println(name + "는 " + s.name + "를 공격했다");
		s.hp = s.hp - 16; // 플레어이가 몬스터를 공격

		if (s.hp < 1) {
			System.out.println(s.name + "는 쓰러졌다!\n"); // 몬스터가 쓰러졌을때
		} else {
			System.out.println("현재 " + s.name + "의 체력은 " + s.hp + "이다\n"); // 몬스터의 체력 현황
		}

	}

}
