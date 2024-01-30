package com.oop.goodExam;

public class DI_goodExam {
    private final UserService userService;

    public DI_goodExam(UserService userService) {
        this.userService = userService;
    }

    public void doSomething() {
        // userService를 사용하는 로직
    }
}
/*위의 코드 예시는 DI를 사용하여 GoodCodeExample 클래스가 UserService를 의존하도록 했습니다. 
 * GoodCodeExample 클래스가 UserService 구현체에 의존하는 대신, 
 * UserService 인터페이스에 의존하므로 코드가 유연하고 확장성이 높아집니다. 
 * 또한 의존성을 주입받는 생성자를 사용하여 코드가 더욱 명확해집니다.*/