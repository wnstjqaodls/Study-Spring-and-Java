package com.interFace;

public class RunExample {

	public static void main(String[] args) {
		 UserService userService = new UserServiceImpl(); // 인터페이스를 구현한 객체 생성
		 User user = new User();
	     userService.addUser(user); // 인터페이스 메소드 사용
	     
	     /* UserServiceImpl 클래스는 UserService 인터페이스를 구현하므로,
	      * UserService 인터페이스 타입으로 객체를 생성할 수 있습니다.
	      * 이후 UserService 인터페이스의 메소드인 addUser()를 호출하여
	      * UserServiceImpl 클래스의 addUser() 메소드를 실행합니다.
	      * 자바에서 인터페이스 객체를 직접 생성하는 것은 불가능합니다. 
	      * 하지만, 인터페이스를 구현한 클래스의 객체를 생성하여 인터페이스 타입으로 참조할 수 있습니다.
	      * 인터페이스를 사용하면 객체 생성과 관련된 구체적인 구현 내용은 감추고,
	      * 인터페이스에 정의된 메소드만을 사용하므로, 코드의 유연성과 확장성이 높아집니다.*/
	}

}
