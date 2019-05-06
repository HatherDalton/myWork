package AfterSpringBreak;

import java.util.ArrayList;

public class Quadratic implements Polynomial {

	private ArrayList<Monomial> shape;

	public Quadratic(double coef, int deg) {
		shape.add(new Monomial(coef, deg));
	}

	public int getDegree() {
		return 2;
	}

	public int getNumTerms() {
		return shape.size();
	}

	public String getName() {
		if (shape.size() == 3)
			return "Quadratic Trinomial";
		if (shape.size() == 2)
			return "Quadratic Binomial";
		return "Quadratic Monomial";
	}

	// B
	public boolean hasRoots(double a, double b, double c) {
		double answer = Math.pow(b, 2) - 4 * a * c;
		if (answer >= 0)
			return true;
		else
			return false;
	}
	
	//C
	public double[] getRoots() {
		double[] coeff=new double[3];
		double[] roots= new double[2];
		for (int i=0; i< shape.size(); i++) {
			int index= 2-shape.get(i).getDegree();
			coeff[index]= shape.get(i).getCoefficient();
		}
		
		double a=coeff[0]; double b=coeff[0]; double c=coeff[0];
		
		if (!hasRoots(a,b,c)) {
			return null;
		}
		roots[0]=(-b+ (Math.pow(b, 2) - 4 * a * c))/(2*a);
		roots[1]=(-b- (Math.pow(b, 2) - 4 * a * c))/(2*a);
		return roots;
		
	}
}
