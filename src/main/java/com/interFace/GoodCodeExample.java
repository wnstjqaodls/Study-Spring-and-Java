package com.interFace;

// GoodCodeExample: 인터페이스를 사용한 예시
public class GoodCodeExample {
    private final UserService userService;

    public GoodCodeExample(UserService userService) {
        this.userService = userService;
    }

    public void addUser(User user) {
        userService.addUser(user); // 인터페이스 메소드 호출
    }
}
/*
 * GoodCodeExample에서는 UserService 인터페이스를 사용하여 UserServiceImpl 클래스를 주입받아 사용합니다.
 * 따라서, UserService 인터페이스를 구현한 다른 클래스를 주입하여 사용하는 경우,
 * 해당 클래스가 인터페이스를 구현하므로 GoodCodeExample 클래스는 변경할 필요가 없습니다.
 * 반면에, BadCodeExample에서는 UserServiceImpl 클래스에 직접 의존하므로,
 * 다른 구현체를 사용하려면 해당 클래스를 변경해야 합니다.
 * 이는 유지보수와 확장이 어려워질 수 있다는 것을 의미합니다.
 * */