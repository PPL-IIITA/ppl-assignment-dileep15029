
public class Boy {
	
	String name;
	int  attractiveness;
	int maintenanceBudget;
	int intelligenceLevel;
	int gfid=-1;
	String status="Single";
	Boy(String name,int  attractiveness,int maintenanceBudget,int intelligenceLevel,String status)
	{
		this.name=name;
		this.status=status;
		this.attractiveness=attractiveness;
		this.maintenanceBudget=maintenanceBudget;
		this.intelligenceLevel=intelligenceLevel;
	}
	void printer(){
		System.out.println("Name"+this.name);
		System.out.println("Attaractiveness"+this.attractiveness);
		System.out.println("Intelligence"+this.intelligenceLevel);
		System.out.println("GFID"+this.gfid);
		System.out.println("Status"+this.status);
	}
	void matcher()
	{
		System.out.println(this.name);
		System.out.println(this.gfid);
		System.out.println(this.status);
	}
	

}
