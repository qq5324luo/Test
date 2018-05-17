package com.example.demo.textInterface;

public class HelloWorldInterfaceImpl implements IHelloWorldInterface{

	@Override
	public void sayHello(int arg) {
		
		int a = 1;
		int b = 0;
		int n = 0;
		
		for(int i = -1 ; i <= arg - 2 ; i++) {
			
			b = a + i +1;
			a = b;
			n++;


			System.out.println("第" + n  + "位的值是" + b);
		}
	}
}
