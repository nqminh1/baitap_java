package baitap;

import java.util.Arrays;

public class B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
      int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
 
       System.out.println("Mang1 : "+Arrays.toString(array1));
       System.out.println("Mang2 : "+Arrays.toString(array2));
 
      
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                 System.out.println("So chung l� : "+(array1[i]));
                 }
            }
        }
 
    }
}
