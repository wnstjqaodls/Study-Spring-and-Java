package com.oop;
//의존성이 높은 코드 예시
public class OOP_bad {

	public class Car {
	    private GasolineEngine engine;

	    public Car() {
	        this.engine = new GasolineEngine();
	    }

	    public void start() {
	        engine.startEngine();
	    }

	    public void stop() {
	        engine.stopEngine();
	    }
	}

	public class GasolineEngine {
	    public void startEngine() {
	        System.out.println("Gasoline engine starts.");
	    }

	    public void stopEngine() {
	        System.out.println("Gasoline engine stops.");
	    }
	}

	/* 이코드에서는 Car 클래스가 GasolineEngine 클래스에 직접 의존하고 있습니다. 
	 * 이는 결합도를 높이고, 유지보수를 어렵게 만들 수 있습니다.
	 *  만약 다른 종류의 엔진을 사용하고자 할 때는 Car 클래스를 변경해야 합니다.*/
	public class Main {
	    public void main(String[] args) {
	        Car car = new Car();
	        car.start();
	        car.stop();
	    }
	}

}
