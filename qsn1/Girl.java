
public class Girl {
	String name;
	int   attractiveness;
	int maintenanceBudget;
	int intelligenceLevel;
	int  bfid=-1;
	int criteria;
	String status="Single";

	Girl(String name,int  attractiveness,int maintenanceBudget,int intelligenceLevel,String crit,String status)
	{
		this.name=name;
		this.attractiveness=attractiveness;
		this.maintenanceBudget=maintenanceBudget;
		this.intelligenceLevel=intelligenceLevel;
		this.status=status;
		if(crit.equals("attractiveness"))
		{
			this.criteria=0;
		}
		else if(crit.equals("rich"))
		{
			this.criteria=1;
		}
		else
		{
			this.criteria=2;
		}
		
		
	}
	void printer(){
		System.out.println("Name"+this.name);
		System.out.println("Attaratctiveness"+this.attractiveness);
		System.out.println("Intelligence"+this.intelligenceLevel);
		System.out.println("Status"+this.status);
		System.out.println("BFIF"+this.bfid);
	}
	void matcher()
	{
		System.out.println(this.name);
		System.out.println(this.bfid);
		System.out.println(this.status);
	}

}
