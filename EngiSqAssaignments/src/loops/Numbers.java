package loops;

public class Numbers {

	// printing numbers from 1 to 100

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		// for condition-fisbiz--read about it 
		
		for(i=1;i<=100;i++){
			if((i%3==0) && (i%5==0)) {
				System.out.println("Hare Hare"+ i);
			}

			else if (i%3==0) {
				System.out.println("Rama"+ i );
			}
			else if (i%5==0) {
				System.out.println("Krishna"+ i );
			}
			if ((i%3!=0) && (i%5!=0)) {
				System.out.println(i);
			}

		}
	}
}
