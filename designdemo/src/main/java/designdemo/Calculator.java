package designdemo;
import java.util.Scanner;
public class Calculator {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int x;
		int y,c;
		System.out.println("Enter a number");
		x=Integer.parseInt(s.nextLine());
		System.out.println("Enter other number");
		y=Integer.parseInt(s.nextLine());
		System.out.println("Enter operation");
		c=Integer.parseInt(s.nextLine());
		switch(c) {
		case 1:add(x,y);
				break;
			
		case 2:sub(x,y);
				break;
		case 3:mul(x,y);
				break;
		case 4:div(x,y);
				break;
		}
	}
	static void add(int x,int y) {
		System.out.println("addition="+(x+y));
	}
	static void sub(int x,int y) {
		System.out.println("subtraction="+(x-y));
	}
	static void mul(int x,int y) {
		System.out.println("product="+(x*y));
	}
	static void div(int x,int y) {
		System.out.println("division="+(x/y));
	}

}
