// 예제 5-7 : 인터페이스 구현과 동시에 슈퍼 클래스 상속

package 예제0507;

interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}

class Calc {
	public int calculate(int x , int y) {
		return x+y;
	}
}
