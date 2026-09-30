package src.edu.volsu.pimm261.linear;

public class Test {

	public static void main (String[] args) {
		t4();			
	}
	public static void t1() {
		Rational r = new Rational(2);
		Rational s = new Rational(1,2);
		System.out.println(r.getInverse().getString());
	}
	
	public static Integer rnd(Integer a, Integer b) {
		return Math.round((float)(Math.random()*(b-a)+a));
	}
	
	public static void t2() {
		for (int i = 0; i < 20; i++) 
			System.out.println(rnd(-3,7));
	}
	public static void t3() {
		System.out.println(RationalUtils.getRandom(10, 100, 6).toFloat());
	}
	
	public static void t4() {
		Rational r = new Rational(1,2);
		Rational s = (Rational)r.clone();
		System.out.println(s.getString());
	}
}
