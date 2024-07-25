package practiceproject1;

public class ConstructorExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConstructorExample3 obj=new ConstructorExample3();
ConstructorExample3.add();
	}
public ConstructorExample3()
{
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
public static void add()
{
	int a[]= {2,4,6,8,10};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
	sum=sum+a[i];
	}
	System.out.println(sum);
}
}
