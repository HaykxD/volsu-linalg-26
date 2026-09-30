package src.edu.volsu.pimm261.linear;

public class RationalUtils {
	public static Rational getRandom(Integer a, Integer b, Integer den_digits) {
		return null;
		// TODO Создать случайное рациональное число a <= q <= b,
		// имеющее не более den_digits десятичных знаков в знаменателе
	}

	public static Rational add(Rational s, Rational t) {
		return null; //TODO
	}

	public static Rational add(String s, String t) {
		return null; //TODO
	}

	public static Rational diff(Rational s, Rational t) {
		return null; //TODO
	}

	public static Rational mult(Rational s, Rational t) {
		return null; //TODO
	}

	public static Rational div(Rational s, Rational t) {
		return null; //TODO
	}

	public static Rational[] getRandomArray(int n) {
		Rational[] result = new Rational[n];
		//TODO создать массив случайных чисел
		return result;
	}
	
	public static Rational[] getConstantArray(int n, Rational c) {
		Rational[] result = new Rational[n];
		//TODO создать массив, где каждый элемент равен с
		return result;
	}

	public static Rational sum(Rational [] arr) {
		return null; //TODO сумма всех элементов массива
	}

	public static Rational min(Rational [] arr) {
		return null; //TODO наименьший элемент массива
	}

	public static Rational max(Rational [] arr) {
		return null; //TODO наибольшие элемент массива
	}

	public static Rational avg(Rational [] arr) {
		return null; //TODO среднее арифметическое всех элементов массива
	}

	public static void sort(Rational [] arr) {
		 //TODO сортировка массива на месте, не создавая нового массива
	}

	public static boolean isZero(Rational [] arr) {
		return false; //TODO проверить, что  массив состоит только из нулей
	}

	
}
