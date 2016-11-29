package day8;

public class MethodsorFunctions {

	
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		int r=sumAll(a,b,c);
		System.out.println(r);
		r=sumAll(100,200,300);
		System.out.println(r);

	}
	
	public static  int sumAll(int i,int j,int k)
	{
		int result=i+j+k;
		return result;
	}

}





