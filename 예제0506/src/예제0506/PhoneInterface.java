package 예제0506;

interface PhoneInterface {
	
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}

}
