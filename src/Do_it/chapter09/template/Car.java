package Do_it.chapter09.template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public void startCar()
	{
		System.out.println("�õ��� �մϴ�");
	}
	
	public  void turnOff()
	{
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run()
	{
		startCar();
		drive();
		stop();
		turnOff();
	}
}
