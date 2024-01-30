package com.oop.badExam;

import com.oop.goodExam.UserService;

public class DI_badExam {
    public void doSomething() {
        UserService userService = (UserService) new UserServiceImplement();
        // userService를 사용하는 로직
    }
}
/* 위의 코드 예시는 DI를 사용하지 않고 BadCodeExample 클래스에서 UserServiceImpl을 직접 생성합니다.
 * 이는 나쁜 코드 예시입니다. 클래스 간의 결합도가 높아지며 코드가 수정되어야 할 경우 해당 클래스의 모든 인스턴스에서 수정이 필요하게 됩니다.
 * 또한 단위 테스트를 작성하기도 어려워집니다.
 * 이러한 이유로 DI를 사용하여 코드를 개선해야 합니다.*/
