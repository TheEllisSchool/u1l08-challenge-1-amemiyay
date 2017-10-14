
public class challenge1 {

	public static void main(String[] args) {
		//set a list of numbers
		int [] array = {1, 4, 8, 3, 6, 9, 2, 6};
		//reverse order
		int sorted = array.length;
		for (int i =1; sorted / 2 > 0; i++) {
			int hold = array[array.length -i];
			array[array.length-i] = array[i-1];
			array[i-1] = hold;
			sorted-=2;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}

	}

}
