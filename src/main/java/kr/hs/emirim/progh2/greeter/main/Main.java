package kr.hs.emirim.progh2.greeter.main;

import kr.hs.emirim.progh2.greeter.greeter.Greeter;

public class Main {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.setFormat("%s, 안녕하세요!");
		String msg = greeter.greet("스프링"); //msg는 "스프링, 안녕하세요!"가 된다.
		System.out.println(msg);
	}

}
