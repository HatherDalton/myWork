package AfterSpringBreak;

public class Machine {

	private PaperRoll paper;

	public Machine(PaperRoll roll) {
		paper = roll;
	}

	public PaperRoll getPaperRoll() {
		return paper;
	}

//A
	public PaperRoll replacePaper(PaperRoll pRoll) {
		PaperRoll r = paper;
		paper = pRoll;
		return r;
	}
}
