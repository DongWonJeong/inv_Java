package Do_it.chapter08.inheritance;
   
public class CustomerTest3 {
	 public static void main(String[] args) {
		  VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		  customerKim.bonusPoint = 10000;
		  System.out.println(customerKim.showCustomerInfo());
	 }
}
