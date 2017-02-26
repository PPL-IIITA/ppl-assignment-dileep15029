import java.io.*;
public class Ranfun {
	public static void main(String args[]) throws FileNotFoundException
	{
		int g = (int )(Math.random() * 50 + 1);
		 int b = (int )(Math.random() * g + g*10);
		System.out.println("Boys:" + b + "Girls" + g);
		int i;
		String name;
		String criteria;
		int  attractiveness,intelligenceLevel,maintenanceBudget ;
		
		String[] list = {"attractiveness", "rich", "intelligent"};
		
		try {
			File file = new File("INPUT.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(new Integer(b).toString());
			fileWriter.write(",");
			//fileWriter.append('\n');
			fileWriter.write(new Integer(g).toString());
			fileWriter.write(",");
			//fileWriter.append('\n');

			for(i=0;i<b;i++)
			{
				name="Boy"+Integer.toString(i);
				attractiveness=(int )(Math.random() * 50 + 50);
				intelligenceLevel=(int )(Math.random() * 50 + 50);
				maintenanceBudget=(int )(Math.random() * 10000 + 50);
				//fos.write(name);
				//fos.write(attractiveness);
				//System.out.println( attractiveness + "+ " + intelligenceLevel +"+"+ maintenanceBudget);
				fileWriter.write(name);
				fileWriter.write(",");
				fileWriter.write(new Integer(attractiveness).toString());
				fileWriter.write(",");
				fileWriter.write(new Integer(intelligenceLevel).toString());
				fileWriter.write(",");
				fileWriter.write(new Integer(maintenanceBudget).toString());
				fileWriter.write(",");
				
			}
			//girls
			for(i=0;i<g;i++)
			{
				name="Girl"+Integer.toString(i);
				attractiveness=(int )(Math.random() * 50 + 50);
				intelligenceLevel=(int )(Math.random() * 50 + 50);
				maintenanceBudget=(int )(Math.random() * 10000 + 50);
				//fos.write(name);
				//fos.write(attractiveness);
				//System.out.println( attractiveness + "+ " + intelligenceLevel +"+"+ maintenanceBudget);
				fileWriter.write(name);
				fileWriter.write(",");
				fileWriter.write(new Integer(attractiveness).toString());
				fileWriter.write(",");
				fileWriter.write(new Integer(intelligenceLevel).toString());
				fileWriter.write(",");
				fileWriter.write(new Integer(maintenanceBudget).toString());
				fileWriter.write(",");
				int r=(int )(Math.random()*100  + 0);
				r=r%3;
				criteria=list[r];;
				fileWriter.write(criteria);
				fileWriter.write(",");
				
			}
			
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	


}


//

