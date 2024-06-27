package Do_it.chapter10.scheduler;

//���� �Ѹ� ���ư��� �����ϰ� �������� ����մϴ�.
public class RoundRobin implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭���� �����ɴϴ�");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
		
	}

}
