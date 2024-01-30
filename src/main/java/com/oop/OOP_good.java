package com.oop;
// 생성자 Injection을 이용한 낮은 결합도 예시
public class OOP_good {

	public class Car {
	    private Engine engine;

	    public Car(Engine engine) {
	        this.engine = engine;
	    }

	    public void start() {
	        engine.startEngine();
	    }

	    public void stop() {
	        engine.stopEngine();
	    }
	}

	public interface Engine {
	    void startEngine();

	    void stopEngine();
	}

	public class GasolineEngine implements Engine {
	    @Override
	    public void startEngine() {
	        System.out.println("Gasoline engine starts.");
	    }

	    @Override
	    public void stopEngine() {
	        System.out.println("Gasoline engine stops.");
	    }
	}

	public class DieselEngine implements Engine {
	    @Override
	    public void startEngine() {
	        System.out.println("Diesel engine starts.");
	    }

	    @Override
	    public void stopEngine() {
	        System.out.println("Diesel engine stops.");
	    }
	}

	/* 위 코드에서는 Car 클래스가 Engine 인터페이스에 의존하고 있으며, 
	 * 생성자 Injection을 이용하여 Engine의 구현체를 주입합니다. 
	 * 이를 통해 Car 클래스와 Engine 구현체간의 결합도를 낮출 수 있습니다.*/
	public class Main {
	    public void main(String[] args) {
	        Engine gasolineEngine = new GasolineEngine();
	        Car gasolineCar = new Car(gasolineEngine);
	        gasolineCar.start();
	        gasolineCar.stop();

	        Engine dieselEngine = new DieselEngine();
	        Car dieselCar = new Car(dieselEngine);
	        dieselCar.start();
	        dieselCar.stop();
	    }
	}

}
