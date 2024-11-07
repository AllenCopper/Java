import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		int choice;
		Scanner in  = new Scanner(System.in);		
		do {
			int size;
			System.out.println("1. Integer Sort");
			System.out.println("2. String Sort");
			System.out.println("3. Exit");
			System.out.println("Enter your Choice :");
			choice = in.nextInt();
			
			switch(choice){
			case 1 :	
				System.out.println("How many numbers you want to sort ?");
				size = in.nextInt();
				int no[] = new int [size];
				for(int i = 0; i < size; ++i){
					System.out.println("Enter the no to sort :");
					no[i] = in.nextInt();
				}
				for( int i = 0; i < size; ++i){
					for ( int j= i+1; j < size; ++j){
						if ( no[i] > no[j]){
							int temp = no[i];
							no[i] = no[j];
							no[j] = temp;
						}
					}
				}
				
				System.out.println("Sorted array is ");
				for( int i =0; i< size; ++i ){
					System.out.println( no[i]);
				}
				break;
			case 2 :		
				System.out.println("How many Strings you want to sort ?");
				size = in.nextInt();
				String name[] = new String[size];
				for(int i = 0; i < size; ++i){
					System.out.println("Enter the name to sort :");
					name[i] = in.next();
				}
				for( int i = 0; i < size; ++i){
					for ( int j= i+1; j < size; ++j){
						String s1 = name[i];
						String s2 = name[j];
						if (s1.compareTo(s2)> 1 ){
							String temp = name[i];
							name[i] = name[j];
							name[j] = temp;
						}
					}
				}
				System.out.println("Sorted name list is ");
				for( int i =0; i< size; ++i ){
					System.out.println( name[i]);
				}
				break;
			case 3 :
				System.out.println( "Terminating Prg");
				break;
				
			default :
				System.out.println( "Wrong Choice");
				break;
			}
		}while ( choice != 3);
	}
}