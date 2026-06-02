import java.util.Arrays;
public class LevelOne {

	public static int[][] arraySplitter(int[] array){

		int countEven = 0;
		int countOdd = 0;
		

		for(int number : array){

			if(number % 2 == 0 ){
				 countEven++;
			
}

}

		int[] evenNumbers = new int[countEven];



		for(int number : array){

			if(number % 2 != 0){
				 countOdd++;

}

}
		int[] oddNumbers = new int[countOdd];



		int evenIndex = 0;
		int oddIndex = 0;


		for(int number : array){

			if(number % 2 == 0){ 

				evenNumbers[evenIndex] = number;
				evenIndex++;				
			
}

			else{
				oddNumbers[oddIndex] = number;
				oddIndex++;
} 

}

		return new int[][]{evenNumbers,oddNumbers};
}



	

	public static Boolean palindromicArray(int[] array){

		for(int count = 0; count < array.length / 2; count++){

			if(array[count] == array[array.length - 1 - count]){
					return true;

}



}
		return false;
}




	public static int[] getPerfectSquare(int[] array){

		int count = 0;
		
		for(int number : array){

			int root = (int) Math.sqrt(number);
			if(root * root == number){
				
				count++;

}

}


		int[] perfectSquare = new int[count];


		int countStore = 0;
		
		for(int number : array){

			int root = (int) Math.sqrt(number);
			if(root * root == number){
				
				perfectSquare[countStore] = number;
				countStore++;

}


}

			return perfectSquare;





}


	public static int[] replaceNonPerfectSquare(int[] array){

		
		int count = 0;

		for(int number : array){
	
			int root = (int) Math.sqrt(number);
			if(root * root == number){
				
				number = number;
}

			else{
		
				number = 1;
}

			count++;

}

		
		int[] nonPerfectSquare = new int[count];

		int countStore = 0;


		for(int number : array){

			int root = (int) Math.sqrt(number);
			if(root * root == number){

				number = number;
}


			else{
				
				number  = -1;
}

			nonPerfectSquare[countStore] = number;
			countStore++;
}


		return nonPerfectSquare;

}
	
	















































































}