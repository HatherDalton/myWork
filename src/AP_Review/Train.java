package AP_Review;

import java.util.ArrayList;

public class Train {
	private Engine engine;
	private ArrayList<TrainCar> trainCars;
	
	public Train(Engine e, ArrayList<TrainCar> tc) {
		engine=e;
		trainCars= tc;
	}
/**
	public ArrayList<TrainCar> removeExcessTrainCars(){
		int weight= engine + trainCars.getBaseWeight);
		while(weight>4750000) {
			trainCars.remove(trainCars.size);
		}
		return trainCars;
	}
**/
	
}
