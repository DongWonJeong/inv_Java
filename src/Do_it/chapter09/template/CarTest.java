package Do_it.chapter09.template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("=== �������� �ϴ� �ڵ��� ===");
		Car myCar = new AICar();
		myCar.run();
		
		System.out.println("=== ����� �����ϴ� �ڵ��� ===");
		Car hisCar = new ManualCar();
		hisCar.run();
	}

}
