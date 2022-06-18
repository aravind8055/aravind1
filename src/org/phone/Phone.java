package org.phone;

public class Phone {
   private void phoneInfo(int a , int b) {
	 System.out.println(a+b);

}
   private void phoneInfo() {
	System.out.println("one plus-6");
}
   public static void main(String[] args) {
	Phone c = new Phone();
	c.phoneInfo(5, 4);
	c.phoneInfo();
}
}
