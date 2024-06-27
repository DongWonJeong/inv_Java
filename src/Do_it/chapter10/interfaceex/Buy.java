package Do_it.chapter10.interfaceex;

public interface Buy {

	void buy();
	
	default void order(){
		System.out.println("���� �ֹ�");
	}
}



