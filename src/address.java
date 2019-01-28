import java.util.*;

class Address
{
	String line1, line2, city, state;
	int pc;

	Address(String l1, String l2, String c, String s, int p)
	{
		this.line1=l1;
		this.line2=l2;
		this.city=c;
		this.state=s;
		this.pc=p;
	}

	void DisplayAddress()
	{
		System.out.print(line1+" "+line2+" "+city+" "+state+" "+pc+" ");
	}
}
