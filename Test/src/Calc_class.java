import java.util.Scanner;

abstract class Calc {
	double op1, op2;
	void set(double op1, double op2) {
		this.op1 = op1;
		this.op2 = op2;
	}
	abstract double calculate();
}
class Add extends Calc {
//	void set(double op1, double op2) {
//		this.op1 = op1;
//		this.op2 = op2;
//	}
	double calculate() {
		return op1 + op2;
	}
}
class Sub extends Calc {
//	void set(double op1, double op2) {
//		this.op1 = op1;
//		this.op2 = op2;
//	}
	double calculate() {	
		return op1 - op2;
	}
}
class Mul extends Calc {
//	void set(double op1, double op2) {
//		this.op1 = op1;
//		this.op2 = op2;
//	}
	double calculate() {	
		return op1 * op2;
	}
}
class Div extends Calc {
//	void set(double op1, double op2) {
//		this.op1 = op1;
//		this.op2 = op2;
//	}
	double calculate() {	
		return op1 / op2;
	}
}
public class Calc_class {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ют╥б : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		char c = sc.next().charAt(0);
		
		switch(c) {
		case '+':
			Add d1 = new Add();
			d1.set(a, b);
			System.out.println(d1.calculate());
			break;
		case '-':
			Sub d2 = new Sub();
			d2.set(a, b);
			System.out.println(d2.calculate());
			break;
		case '*':
			Mul d3 = new Mul();
			d3.set(a, b);
			System.out.println(d3.calculate());
			break;
		case '/':
			Div d4 = new Div();
			d4.set(a, b);
			System.out.println(d4.calculate());
			break;
		}
	}
}