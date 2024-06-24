package Do_it.chapter08.polymorphism;

import java.util.ArrayList;



public class AnimalTest2 {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();

	public static void main(String[] args) {
		AnimalTest2 aTest = new AnimalTest2();
		aTest.addAnimal();
		System.out.println("���� Ÿ������ �ٿ� ĳ���� ");
		aTest.testCasting();

	}
	
	public void addAnimal()
	{
		aniList.add(new Human());    //ArrayList�� �߰��Ǹ鼭 Animal������ �� ��ȯ
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani : aniList){     // �迭�� ��ҵ��� Animal������ ������ move ȣ���ϸ�
			ani.move();              // �������̵��� �Լ��� ȣ�� ��
		}
	}

	
	public void testCasting()
	{
		for(int i=0; i<aniList.size(); i++){  //��� �迭 �׸���� �ϳ��� ���鼭
			
			Animal ani = aniList.get(i);        // �ϴ� Shape Ÿ������ ������
			if(ani instanceof Human){       //Circle�̸�
				Human h = (Human)ani;      //Circle������ �ٿ� ĳ����
				h.readBook();
			}
			else if(ani instanceof Tiger){  
				Tiger t = (Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle){
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else{
				System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			}
		}
	}
}



