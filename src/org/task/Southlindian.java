package org.task;

public class Southlindian extends Indian {
	
	@Override
	public void breakfast() {
		System.out.println("idly or dosai");
	}
	public static void main(String[] args) {
		Southlindian s = new Southlindian();
		s.breakfast();
		s.pancard();
		s.voterId();
	}

}
