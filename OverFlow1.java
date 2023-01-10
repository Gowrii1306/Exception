package exceptionsHandling;

public class OverFlow1 {
	
	public void findA() {
			findB();
		}
		public void findB() {
			findA();
		}
		public static void main(String[] args) {
			OverFlow1 or = new OverFlow1();
			or.findA();
		}

}
