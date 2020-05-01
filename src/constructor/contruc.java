package constructor;

public class contruc extends sample {

	public contruc()
	{
		super(200);
		
System.out.println("default constructor");
System.out.println();

	}
public contruc(int id)
{
	super ("karthik");
	System.out.println("int para constructor" + id);
}

public static void main(String[] args) {
	
	contruc c = new contruc();
	contruc c1 = new contruc(10);
}

}
