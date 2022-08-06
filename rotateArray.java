import java.util.Arrays;
import java.util.Scanner;
class RotateArray
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=scan.nextInt();
		int[]arr=new int[size];
		System.out.println("enter elements in array");
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("contents of array:"+Arrays.toString(arr));
		int temp=arr[size-1];
		for(int i=size-1;i<0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		System.out.println("Contents of the cycled array:"+Arrays.toString(arr));
	}
}
