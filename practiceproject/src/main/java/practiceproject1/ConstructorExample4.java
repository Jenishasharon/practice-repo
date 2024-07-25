package practiceproject1;

public class ConstructorExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorExample4 obj=new ConstructorExample4(10,5);
obj.details("jenisha", 123);
	}
public ConstructorExample4(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
public void details(String name,int id)
{
	System.out.println(name);
	System.out.println(id);
}
}
