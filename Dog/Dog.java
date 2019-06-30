/*
* @Author: Jun Luo
* @Date:   2019-06-28 17:30:58
* @Last Modified by:   Jun Luo
* @Last Modified time: 2019-06-28 19:20:38
*/

public class Dog {
	public static String binomen = "Canis familiaris";
	public int weightInPounds;

	/** One integer constructor for dogs. */
	public Dog(int w) {
		weightInPounds = w;
	}

	public void makeNoise() {
		if (weightInPounds < 10) {
			System.out.println("Yip!");
		} else if (weightInPounds < 30) {
			System.out.println("Bark!");
		} else {
			System.out.println("Wooooof!");
		}
	}

	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.weightInPounds > d2.weightInPounds) {
			return d1;
		}
		return d2;
	}

	public Dog maxDog(Dog d2) {
		if (this.weightInPounds > d2.weightInPounds) {
			return this;
		}
		return d2;
	}
}