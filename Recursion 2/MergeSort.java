/*
Given the starting 'l' and the ending 'r' positions of the array 'ARR', your task is sorting the elements between 'l' and 'r'.
Note:
Change in the input array itself. So no need to return or print anything.
Example:
Input: ‘N’ = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]

Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Input format :
The first line contains an integer 'N' representing the size of the array/list.

The second line contains 'N' single space-separated integers representing the elements in the array/list.
Output format :
You don't need to return anything. In the output, you will see the array after modification is done by you.
Constraints :
1 <= N <= 10^3
0 <= ARR[i] <= 10^9
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Explanation of Sample Output 1:
After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Explanation of Sample Output 2:
After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
*/




public class solution {

	public static void mergeSort(int[] input){
		// Write your code here
		if (input.length<=1)
        {
            return;
        }
        int[] b = new int[input.length/2];
        int[] c = new int[input.length-b.length];
        
        for (int i=0;i<input.length/2;i++)
        {
            b[i]=input[i];
        }
        for (int i=input.length/2;i<input.length;i++)
        {
            c[i-(input.length/2)]=input[i];
        }
        
        mergeSort(b);
        mergeSort(c);
        merge(b,c,input);
		
	}
    
    public static void merge(int[] b, int[] c, int[] a)
    {
        int i=0,j=0,k=0;
        while (i<b.length && j<c.length)
        {
            if (b[i]<=c[j])
            {
                a[k]=b[i];
                i++;
            }
            else
            {
                a[k]=c[j];
                j++;
            }
            k++;
        }
        
        while (i<b.length)
        {
            a[k]=b[i];
            i++;
            k++;
        }
        while(j<c.length)
        {
            a[k]=c[j];
            j++;
            k++;
        }
		
	}
}
