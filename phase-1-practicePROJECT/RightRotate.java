package right_rotate;
public class RotateRight {
	public static void main(String[] args) {       
	        int [] arr = new int [] {8,7,6,5,4,3,2};     
	        int n = 3;    
	        System.out.println("Original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");     
	        }       
	        for(int i = 0; i < n; i++){    
	            int j, last;    
	            last = arr[arr.length-1];   
	            for(j = arr.length-1; j > 0; j--){    
	                arr[j] = arr[j-1];    
	            }    
	            arr[0] = last;    
	        }
	        System.out.println();      
	        System.out.println("Array after right rotation: ");    
	        for(int i = 0; i< arr.length; i++){    
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	}
