package Do_it.chapter10.scheduler;

// ������� ���� ������ ��⿭���� ������ ���� �ɷ��� ���� ���� �켱���� ����մϴ�.
public class PriorityAllocation implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill ���� ���� �������� �켱������ ����մϴ�.");
		
	}
}
