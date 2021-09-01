public class Lab6Test{
    public static void main(String[] args){
		int i = 5;
		while(i == 5){
			break; 
		}	
		int j = 0;
		// Skip even numbers between 0 and 10, print odds
		while(j <= 10){
			if (j % 2 == 0){
                System.out.println("Skip the even number: " + j);
                j++;
                continue;
			}
			System.out.println("Print the odd number: " + j);	
		}
		//Computing the first odd number between 0 and 10.
		while(true){
			for(int m = 0; m < 10; m++){
				if(m % 2 == 1){
					break;
				}
			}
		}
	}
}