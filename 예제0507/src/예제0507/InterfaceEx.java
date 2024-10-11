// 예제 5-7 : 인터페이스 구현과 동시에 슈퍼 클래스 상속

package 예제0507;

class SmartPhone extends Calc implements PhoneInterface {
	// PhoneInterface의 추상 메소드 구현
	@Override
	public void sendCall() { System.out.println("따르릉따르릉~~"); }

	@Override
	public void receiveCall() { System.out.println("전화 왔어요."); }

	// 추가로 작성한 메소드
	public void schedule() { System.out.println("일정 관리합니다."); }
}

public class InterfaceEx {
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		System.out.println("3과 5를 더하면 " + phone.calculate(3, 5));
		phone.schedule();
	}

}
