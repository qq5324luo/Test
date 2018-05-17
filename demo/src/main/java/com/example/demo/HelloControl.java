package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl { 

	int a = 9;
	@GetMapping("/hello")
	private String helloWord() {
		
//		HelloWorldInterfaceImpl helloWorldImpl = new HelloWorldInterfaceImpl();
//		Scanner scanner = new Scanner(System.in);
//		int arg = Integer.parseInt(scanner.nextLine());
//		helloWorldImpl.sayHello(arg);
		
		this.cyclCompare();
		return "OK";
	}
	
	private void count1 () {
		int a = 10;
		System.out.println(a);
	}
	private void count2 () {
		
		System.out.println(a);
	}
	private void count3 () {
		System.out.println(getNum());
	}
	private int getNum() {
		
		return ++a;
	}
	
	private void test() {
		this.count1();
		this.count2();
		this.count3();
		this.count2();
	}
	
	private void cyclCompare() {
		
		for(int i = 0; i<3; i++) {
			for(int j =3; j>=0 ;j--) {
				
				if(i==j) 
					continue;
				System.err.println( i );
				System.err.println( j );
			}
		}
	}
	
	private void bufferReplace(StringBuffer text) {
		
		text.append("C");
		text = new StringBuffer("Hello");
	}
	private int fun() {
		
		int result = 5;
		try {
			result = result / 0;
			return result;
 		} catch (Exception e) {
			System.out.println("Exception");
			result = -1;
			return result;
		} finally {
			result = 10;
			System.out.println("i am in finally");
			return result;
		}
	}
	private void demo1(){
		
		System.out.println("This is my demo!")
	}
} 


