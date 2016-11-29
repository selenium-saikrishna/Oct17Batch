package day20;

public class Softq {

	int fee;
	String course;
	public  Softq()
	{
		System.out.println("This is a s/w training institute");
	}
	public Softq(int p)
	{
		fee=p;
	}
	public Softq(int p,String c)
	{
		fee=p;
		course=c;
	}
	
	public static void main(String[] args) {
		Softq s1=new Softq();
		System.out.println(s1.fee+"---"+s1.course);
		Softq s2=new Softq(20000);
		System.out.println(s2.fee+"---"+s2.course);
		Softq s3=new Softq(4000,"Selenium");
		System.out.println(s3.fee+"---"+s3.course);

	}

}


