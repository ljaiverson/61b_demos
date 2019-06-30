/*
* @Author: Jun Luo
* @Date:   2019-06-28 17:34:41
* @Last Modified by:   Jun Luo
* @Last Modified time: 2019-06-28 19:25:19
*/

/** The DogLauncher class will 'test drive' the Dog class. */

public class DogLauncher {
	public static void main(String[] args){
		Dog d = new Dog(15);
		Dog d2 = new Dog(100);
		// d.makeNoise();

		// /** Array of Dogs */
		// Dog[] dogs = new Dog[2];
		// dogs[0] = new Dog(8);
		// dogs[1] = new Dog(20);
		// dogs[0].makeNoise();
		// System.out.println(dogs.length);

		
		// Dog bigger = Dog.maxDog(d, d2);
		Dog bigger = d.maxDog(d2);
		bigger.makeNoise();

		/** The next two lines are bad. */
		// System.out.println(d.binomen);
		// System.out.println(d2.binomen);
		System.out.println(Dog.binomen);


	}	
}