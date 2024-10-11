// 예제 5-3 : instanceof 연산자 활용
// instanceof 연산자를 이용하여 [그림 5-15]의 상속 관계에 따라
// 레퍼런스가 가리키는 객체의 타입을 알아본다. 실행 결과는 무엇인가?

package 예제0503;

class Person{}
class Student extends Person{}
class Researcher extends Person{}
class Professor extends Researcher{}

public class InstanceOfEx {
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student" );
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.print("new Student() -> ");
		print(new Student());
		System.out.print("new Researcher() -> ");
		print(new Researcher());
		System.out.print("new Professor() -> ");
		print(new Professor());
	}

}
