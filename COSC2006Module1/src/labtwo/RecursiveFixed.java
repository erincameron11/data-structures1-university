package labtwo;

public class RecursiveFixed {

	public static void downToZeroByThree(int value) { 
		if (value <= 1) {                    
			return;
		} else {
			System.out.println(value);
			downToZeroByThree(value - 1); 
		}
	}
	
	public static void main(String[] args) {
		
		downToZeroByThree(9);

	}

}
