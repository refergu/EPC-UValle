import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class mainclass {
	
	public static void main(String args[])throws IOException
	{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	    String in = br.readLine();
	    int T =Integer.parseInt(in);
	    for(int r=0;r<T;r++)
	     {
	    	br.readLine();
			String S = br.readLine();
			String[] dato= S.split(" ");
			int G = Integer.parseInt(dato[0]);
			int M = Integer.parseInt(dato[1]);
			int G_may=0;
			int M_may=0;
			String[] dato1= br.readLine().split(" ");
			String[] dato2= br.readLine().split(" ");
			for(int j=0;j<G;j++)
			{
			
				if(Integer.parseInt(dato1[j])>G_may)
				{
					G_may=Integer.parseInt(dato1[j]);
				}
				
			}
			for(int j=0;j<M;j++)
			{
				if(Integer.parseInt(dato2[j])>M_may)
				{
					M_may=Integer.parseInt(dato2[j]);
				}
			}
			
			if(G_may>=M_may)
			{
				System.out.println("Godzilla");
			}
			else
			{
				System.out.println("MechaGodzilla");
			}
			 
			
			
	     }
	}
}