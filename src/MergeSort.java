import java.util.Arrays;

public class MergeSort {
	public static void main (String [] args){
		int a = 0;
		int b = 0;
		int c = 0;
		int [] arrayA = {2,3,7,8, 10, 13, 16};
		int [] arrayB = {4,5,9};
		int [] arrayC = new int[10];
		
		while (a < arrayA.length && b < arrayB.length){
			if (arrayA[a] < arrayB[b]){
				arrayC[c] = arrayA[a];
				c++;
				a++; 
			}
			else{
				arrayC[c] = arrayB[b];
				c++;
				b++;
			}
		}
			if(a == arrayA.length){
				for(int i = b; i < arrayB.length; i++){
					arrayC[c] = arrayB[i];
					c++;
				}
			}
				
			
			if(b == arrayB.length){
				for(int i = a; i < arrayA.length; i++){
					arrayC[c] = arrayA[i];
					c++;
				}
			}
			System.out.print(Arrays.toString(arrayC));
		}
	}

