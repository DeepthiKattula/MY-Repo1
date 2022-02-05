package constructors;

public class ParameterConst {
	int id;
	String name;

	ParameterConst(int i,String n)//Student id, name
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

