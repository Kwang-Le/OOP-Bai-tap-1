package game;

import java.util.Random;


public class Dice {
	private int[] facesValues = {1,2,3,4};
	private double[] facesProbabilities;
	private final int NUMBER_OF_FACES = 4;
	
	public Dice(double[] facesProbabilities) {
		super();
		this.facesProbabilities = facesProbabilities;
	}

	public double[] getFacesProbabilities() {
		return facesProbabilities;
	}

	public void setFacesProbabilities(double[] facesProbabilities) {
		this.facesProbabilities = facesProbabilities;
	}

	public int[] getFacesValues() {
		return facesValues;
	}

	public void setFacesValues(int[] facesValues) {
		this.facesValues = facesValues;
	}
	
	public double probabilitiesDistribution() {
		double distribution = 0;
		for(int i = 0; i<NUMBER_OF_FACES;i++) {
			distribution += this.facesProbabilities[i];
		}
		return distribution;
	}
	
	public int getRandomFace() {
		int faceObtained = 0;
		Random rand = new Random();
		// Obtain a number between the distribution.
		double randomNumber = rand.nextDouble(this.probabilitiesDistribution());
		
		for(int i = 0;i<NUMBER_OF_FACES;i++) {
			randomNumber = randomNumber - this.facesProbabilities[i];
			if(randomNumber <= 0) {
				faceObtained = i;
				break;
			}
		}
		return faceObtained + 1;
	}
	
	public static void main(String args[]) {
		double[] array = {20,16,16,16};
		Dice dice = new Dice(array);
		int output = dice.getRandomFace();
		System.out.println(output);
	}
}
