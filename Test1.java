public class Test1{
// public static void main( String[] args ){
// 	int[] test1 = {1, 4, 7};	
// 	int[] test2 = {2, 5, 8};
// 	int[] test3 = {3, 6, 9};	
// 	A( test1, test2);
// 	B( test1, test2, test3);
// 	printArray(test1);
// 	printArray(test2);
// 	printArray(test3);
// }

///part 2b
public static void main(String[] args ){
	int[] test1 = {1, 4, 7};	
	int[] test2 = {2, 5, 8};
	int[] test3 = {3, 6, 9};	
	C( test1, test2, test3);
	printArray(test1);
	printArray(test2);
	printArray(test3);
}

public static void A( int[] a, int[] b ){
	int[] temp1 = new int[a.length];
	int[] temp2 = new int[b.length];	
	for( int i = 0; i < a.length; i++ ){
		temp1[i] = a[i];
		temp2[i] = b[i];
	}
}

public static int[] B( int[] a, int[] b, int[] c ){
int[] temp = new int[a.length];
for( int i = 0; i < a.length; i++ ){
temp[i] = a[i]; a[i] = b[i]; 
b[i] = c[i]; c[i] = temp[i];
}
return temp;
}
     
public static void C( int [] a, int[] b, int[] c ){
 for(int i = 0; i < a.length; i++)
   b[i] = a[i] + b[i] + c[i];
}
     
public static void printArray( int[] array ){
	System.out.print("[ ");
	for( int i = 0; i < array.length; i++ ){
		if ( i < array.length-1 ) {
			System.out.print( array[i] + ", "); 
		}
		else {
			System.out.print( array[i] ); 
		}
	}	
	System.out.println("]");
}
}