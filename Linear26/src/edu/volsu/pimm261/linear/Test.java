package src.edu.volsu.pimm261.linear;

public class Test {

	public static void main (String[] args) {
		t1();
	}
	public static void t1() {
		Rational r = new Rational(2);
		Rational s = new Rational(1,2);
		System.out.println(r.getInverse().getString());
	}
}
