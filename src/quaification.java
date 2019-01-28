
class Qualification
{
	String qualName, university, institute;
	double cgpa;

	Qualification(String q, String u, String i, double cgpa)
	{
		this.qualName=q;
		this.university=u;
		this.institute=i;
		this.cgpa=cgpa;
	}

	void DisplayQualification()
	{
		System.out.print(qualName+" "+university+" "+institute+" "+cgpa+" ");
	}
}
