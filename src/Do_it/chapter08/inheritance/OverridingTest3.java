package Do_it.chapter08.inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		
		int price = 10000;
		Customer customerLee = new Customer(10010, "이순신");   //Customer �ν��Ͻ� ����
		System.out.println(customerLee.getCustomerName() +" 님이 지불해야하는 금액은 " + customerLee.calcPrice(price) + "원 입니다.");
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);  //VIPCustomer �ν��Ͻ� ����
		System.out.println(customerKim.getCustomerName() +" 님이 지불해야하는 금액은 " + customerKim.calcPrice(price) + "원 입니다.");
		
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);  // VIPCustomer �ν��Ͻ��� Customer Ÿ�Կ� ����
		System.out.println(vc.getCustomerName() +" 님이 지불해야하는 금액은 " + vc.calcPrice(10000) + "원 입니다.");
		
	}
}
