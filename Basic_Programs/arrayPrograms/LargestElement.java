package arrayPrograms;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[] = {1,4,5,6,9,10,9,3,17,45,6};
    int len = arr.length;
    int lar=0;
    
    for(int i=0;i<len-1;i++)
    {
    	if(arr[i]>arr[i+1])
    		lar = arr[i];
    	if(arr[i]<arr[i+1])
    		lar = arr[i+1];
    }
    System.out.println(lar);
	}

}
