package practiceproject1;

public class StaticExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticExample3.add(15,20);
StaticExample3.add(10,20,39);
	}
public static void add(int a,int b)
{
	int x=a+b;
	System.out.println(x);
}
public static void add(int a,int b,int c)
{
	int z=a+b+c;
	System.out.println(z);
}
}
