package ex02_variable;

public class Ex01_variable {

	public static void main(String[] args) {
		
		// 한 줄 삭제 : 커서를 두고, Ctrl + D
		
		/*
		 * 변수 (variable)
		 * 1. 기본 자료형과 참조 자료형으로 구분한다.
		 * 2. 타입(자료형)에 따라 값을 저장할 메모리 공간을 확보해 둔 것이다.
		 * 3. 변수명 규칙
		 *     1) 숫자, 영문, 한글, 특수문자(_)를 혼합해서 사용할 수 있다.
		 *     2) 공백 문자를 사용할 수 없다.
		 *     3) 숫자로 시작할 수 없다. (예 : 1month 불가)
		 *     4) 변수의 선언(변수 사용을 알림)은 코드 어디서든 할 수 있다.
		 *     5) camel case
		 *        - 첫 글자는 소문자로 한다.
		 *        - 이후 단어의 첫 글자만 대문자로 하고 나머지는 소문자로 한다.
		 *        - 예 : MyAge, myAge
		 *        - 자바 주의 점 : 첫 글자가 대문자이면 모든 개발자는 클래스인 줄 안다.
		 */
		
		int a;    // 정수를 저장할 수 있는 변수 a의 선언
		
		a = 100;  // 변수 a에 100을 저장
		
		System.out.println(a);
		
	}

}