package datastuctures;

public class ArrayDemoClassOne {

	public static void main(String[] args) {
		
		int numberOne = 1;
		int numberTwo = 2;
		int numberThree = 3;
		int numberFour = 4;
		int numberFive = 5;
		int numberSix = 6;
		int numberSeven = 7;
		int numberEight = 8;
		int numberNine = 9;
		int numberTen = 10;
		
		//using arrays
		//the syntax to declare and initialize the array of 10 integers  ----- type[] variableName = new type[10];
		
		int[] arrayOfInt = new int[10];
		
		arrayOfInt = new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
		
		//printing array values --- if we want to print the value of element 9
		System.out.println("Element 9 " + arrayOfInt[8]);
		
		//modify element 9 to 333
		arrayOfInt[8] = 333;
		System.out.println("Element 9 after modifying " + arrayOfInt[8]);
		
		System.out.println("What is the length of my erray ? - " + arrayOfInt.length);
		
		
		
		
		/*
		 * for(int i = 0; i < arrayOfInt.length; i++) { System.out.println("Element : "
		 * + arrayOfInt[i] + " index is : " + i); }
		 */
		
		//alternative way of doing the same above
		
		System.out.println("********************************************************");
		
		int[] arrayOfFiveInt = new int[] {100, 200, 300, 400, 500};
		
		for(int index = 0; index < arrayOfFiveInt.length; index++) {
			System.out.println("Element : " + arrayOfFiveInt[index]);
			if(arrayOfFiveInt[index] == 255) {
				System.out.println("You won 500 bucks");
			}
		}
		
		System.out.println("What is the length of my erray ? - " + arrayOfFiveInt.length);
		
		
		int[] copyOfArray = arrayOfFiveInt;
		
		for(int index = 0; index < copyOfArray.length; index++) {
			System.out.println("Elements cloned from above array : " + copyOfArray[index]);
		}
		
		
		int[] anotherClone = new int[7];
		
		for(int index = 0; index < anotherClone.length; index++) {
			System.out.println("Elements of anotherClone : " + anotherClone[index] + " under index " + index);
		}
		
		anotherClone = arrayOfFiveInt;
		
		for(int index = 0; index < anotherClone.length; index++) {
			System.out.println("Elements of anotherClone : " + anotherClone[index] + " under index " + index);
		}
		
		
		
		int[] withThreeSpots = new int[3];
		
		for(int index = 0; index < withThreeSpots.length; index++) {
			System.out.println("Elements of withThreeSpots : " + withThreeSpots[index] + " under index " + index);
		}
		
		withThreeSpots = arrayOfFiveInt;
		
		for(int index = 0; index < withThreeSpots.length; index++) {
			System.out.println("Elements of withThreeSpots : " + withThreeSpots[index] + " under index " + index);
		}
		
		
		withThreeSpots = arrayOfInt;
		for(int index = 0; index < withThreeSpots.length; index++) {
			System.out.println("Elements of withThreeSpots : " + withThreeSpots[index] + " under index " + index);
		}
		
	}

}
