package ch03_UnaryOperartors;

public class UnaryOperatorApp2 {

	public static void main(String[] args) {
		int i = 0;
		// increment by 1 
		i++;
		// increment by 1 
		i = i+1;
		i += 1;
		// I should = 3
		System.out.println(i);
		// increment i by 3
		i = i +3;
		i += 3;
		// i should by 9?
		System.out.println(i);
		
		//reduce i by 1
		i--;
		// should be 8
		System.out.println(i);

	}

}
