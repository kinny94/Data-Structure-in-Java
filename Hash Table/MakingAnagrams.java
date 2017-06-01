public class MakingAnagrams{
	public static void main(String args[]){	 

		String x = "abc";
		String y = "cde";

		int[] charCountX = new int[26];
		int[] charCountY = new int[26];

		charCountX = charCount(x);
		charCountY = charCount(y);

		System.out.prin(compareArrays(charCountX, charCountY));

	}

	public static int[] charCount(String x){
		int[] charCountX = new int[26];
		for(int i=0; i<x.length(); i++){
			char c = x.charAt(i);
			int offset = (int) 'a';
			int delta = c - offset;
			charCountX[delta]++;
		}
		return charCountX;
	}

	public static void print(int a[]){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static int compareArrays(int a[], int b[]){

		int delta = 0;
		for(int i=0; i<a.length; i++){
			delta += Math.abs(a[i] - b[i]);
		}
		return delta;
	}
}