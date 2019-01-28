class Date
{
	int dy, mon,yr;

	Date(int d, int m, int y)
	{
		this.dy=d;
	    this.mon=m;
	    this.yr=y;
	}

	void DisplayDate()
	{
		System.out.print(dy+" "+mon+" "+yr+" ");
	}
}