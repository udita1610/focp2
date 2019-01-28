
class Project
{
	String name, role;
	String[] responsibilities;
	Date startDate,endDate;
	int z;

	Project(String n,String r, int ds, int ms, int ys, int dl, int ml, int yl, int z)
	{
		int i;
		Scanner input = new Scanner(System.in);
	    this.name=n;
	    this.role=r;
	    startDate= new Date(ds,ms,ys);
	    endDate= new Date(dl,ml,yl);
	    this.z=z;	
	    this.responsibilities=new String[z];
	    System.out.println("enter responsibilities");
	    for(i=0;i<z;i++)
	{
		this.responsibilities[i]=input.next();
	}
	}

	
	void DisplayProject(int z)
	{
		int i;
		System.out.print(name+" "+role+" ");
		startDate.DisplayDate();
		System.out.print(" ");
		endDate.DisplayDate();
		System.out.print(" ");
		for (i=0;i<z;i++)
		{
			System.out.print(responsibilities[i]+" ");
		}
	}

	int getz()
	{
		return z;
	}
}
