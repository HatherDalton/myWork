package AfterSpringBreak;

import java.util.ArrayList;

public class PrintingFactory {

	private Machine[] machines;
	private ArrayList<PaperRoll> usedRolls = new ArrayList<PaperRoll>();

	public PrintingFactory(int numMachines) {
		machines = new Machine[numMachines];
	}

//B
	public void replacePaperRolls(PaperRoll roll) {
		for (Machine x : machines) {
			if (x.getPaperRoll().getMeters() < 4.0) {
				ArrayList<PaperRoll> newRolls = null;
				usedRolls.add(x.replacePaper(newRolls.remove(0)));
			}
		}
	}

//C
	public double getPaperUsed() {
		double sum = 0.0;
		for (PaperRoll y : usedRolls)
			sum += (1000 - y.getMeters());
		for (Machine z : machines) {
			sum += (1000 - (z.getPaperRoll().getMeters()));
		}
		return sum;
	}
}
