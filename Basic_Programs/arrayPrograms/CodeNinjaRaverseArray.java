package arrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CodeNinjaRaverseArray {
public static void reverse(ArrayList<Integer>arr,int m)
{

	int n = arr.size();

	// Declare and initialize ArrayList brr
	ArrayList<Integer> brr = new ArrayList<Integer>();

	for (int i = 0; i < arr.size(); i++) {
		brr.add(0);
	}

	// Declare a varibale p
	int p = 0;

	// First fill the brr in the same order as the original array upto Mth postion.
	for (int i = 0; i <= m; i++) {
		brr.set(p++, arr.get(i));
	}

	// Now fill the brr in the reverse order till (m+1)th postion.
	for (int j = n - 1; j > m; j--) {
		brr.set(p++, arr.get(j));
	}

	// Now copy back the array brr into array arr
	for (int i = 0; i < n; i++) {
		arr.set(i, brr.get(i));
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> a = new ArrayList<Integer>();
    reverse(a,4);
	}

}
