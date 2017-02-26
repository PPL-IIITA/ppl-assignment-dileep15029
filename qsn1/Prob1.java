import java.io.BufferedReader;
import java.io.FileReader;
public class Prob1 {
	public static void main(String args[]) throws Exception
	{
        String thisLine = null;
        int b,g,i;
        String name;         
    	int  attractiveness;
    	int maintenanceBudget;
    	int intelligenceLevel;
    	String crit;
    	int waste;
        try {
            
            // open input stream test1.txt for reading purpose.
            BufferedReader br = new BufferedReader(new FileReader("INPUT.txt"));
            while ((thisLine = br.readLine()) != null) {
               //System.out.println(thisLine);
            	 br.close();
            }
        }
            catch(Exception e) {
                e.printStackTrace();
             }
       
            String prop[]=thisLine.split(",");
                b=Integer.valueOf(prop[0]);
                g=Integer.valueOf(prop[1]);
                
               Boy[] boys =new Boy[b];
               Girl[] girls =new Girl[g];
               
                int [][] arr=new int[b][3];
            	String status="single";
            	int count=2;
            	for(  i=0;i<b;i++)
            	{
            		 //name=valueOf(prop[count]);
            		name=prop[count];
            		 count++;
            		 for( int j=0;j<3;j++)
            		 {
            			waste=Integer.valueOf(prop[count]); 
            			 arr[i][j]=waste;
            			 count++;
            			 
            		 }
            		//attractiveness=scanf.nextInt();
        			 //maintenanceBudget=scanf.nextInt();
            		//intelligenceLevel=scanf.nextInt();
            		boys[i]=new Boy(name,arr[i][0],arr[i][1],arr[i][2],status);
            	}
            //end of for
            	
            	for(  i=0;i<g;i++)
            	{
            		 name=prop[count];
            		 count++;
            		 attractiveness=Integer.valueOf(prop[count]);
            		 count++;
            		 maintenanceBudget=Integer.valueOf(prop[count]);
            		 count++;
            		intelligenceLevel=Integer.valueOf(prop[count]);
            		count++;
            		crit=prop[count];
            		count++;
            		girls[i]=new Girl(name,attractiveness,maintenanceBudget,intelligenceLevel,crit,status);
            	}
                  
         
        
      
        
        
       
    	
    	for(i=0;i<g;i++)
    	{
			int temp=girls[i].criteria;
    		//System.out.println("Criteria:"+temp);
    		//waste=scanf.nextInt();
    		
    		int max=0;
    		boolean flag=false;
    		int maxIndex=0;
    		
    			//System.out.println("THREE CHECK");
    			max=0;
    			for(int j = 0;j<b;j++)
    			{
    				//System.out.println("CHecking for boy"+j);
    				if(arr[j][temp]>max)
    				{
    					//System.out.println(arr[j][temp] +"is greater than" +max);
    					if( boys[j].status.equals("single")  )
    						{
    						//System.out.println("The boy was single");
    						if(boys[j].maintenanceBudget>=girls[i].maintenanceBudget)
    						{
    							//System.out.println("MAntetca budget was ok");
    							flag=true;
            					max=arr[j][temp];
            					maxIndex=j;
            					
    						}
    						
    					}
    				}
    				/*
    				if( (arr[j][temp]>max)  &&  !(boys[j].status.equals("single")) )
    				{
    					if(boys[j].maintenanceBudget>=girls[i].maintenanceBudget)
    					{
    						flag=true;
        					max=arr[j][temp];
        					maxIndex=j;
        					
        					//System.out.println("TWO CHECK"+temp);
        					
    					}
    				}*/
    			}
    			
    			
    			//System.out.println("FOUR CHECK");
    			if(flag)
    			{
    				girls[i].bfid=maxIndex;
    				boys[maxIndex].gfid=i;
    				boys[maxIndex].status="committed";
    				girls[i].status="committed";
    				//System.out.println("ONe pair was found");
    				//waste=scanf.nextInt();
    			
    				
    				//System.out.println(girls[i].bfid);
    			//System.out.println(boys[maxIndex].gfid);
    			//System.out.println(boys[maxIndex].status);
    			//System.out.println(girls[i].status);
    			}
    			
    			
    			
    		
    		//System.out.println("Completed Girl"+i);
    		//waste=scanf.nextInt();
    		
    	}
    	
        System.out.println("Here it is:");
        for(i=0;i<b;i++)
        {
        	//boys[i].printer();
        	
        	if(boys[i].gfid!= -1)
        	{
        		System.out.println(boys[i].name+ "-->" +girls[boys[i].gfid].name);
        	}
        	else
        	{
        		//System.out.println(boys[i].name+ " Was single");
        	}
        	
        }
        
        
	
	}

}
