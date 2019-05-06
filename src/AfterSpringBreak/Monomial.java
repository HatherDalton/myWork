package AfterSpringBreak;

public class Monomial {

	private double coefficient;
	private int degree;

	public Monomial(double coef, int deg) {
		coefficient = coef;
		degree = deg;
	}

	public int getDegree() {
		return degree;
	}

	public double getCoefficient() {
		return coefficient;
	}
}
