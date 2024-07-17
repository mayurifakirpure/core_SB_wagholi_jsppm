
public class Addition {
	
	/*
	 * public void add(int a,int b)
	 *  { 
	 *  //int sum = a+b;
	 * System.out.println("Additon = "+(a+b));
	 *  }
	 * 
	 * public int add(int a,int b,int c) { return (a+b+c); }
	 */
	
	
	public int add(String s,int... a)
	{
		System.out.println("Length = "+a.length);
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
			//sum+=a[i];
		}	
		return sum;
	}
	
	public static void main(String[] args) {	
		Addition a = new Addition();
		int s = a.add("abc",10, 20);
		System.out.println("Addition = "+s);
		System.out.println("Sum = "+a.add("mno",1, 2, 3));
	}
}

/*
 * //varArgs Variable Args
 * 
 * ... elipses
 * 
 * access_Modifier return_type method_Name(dataType... var_Nm) {
 * 
 * }
 */




