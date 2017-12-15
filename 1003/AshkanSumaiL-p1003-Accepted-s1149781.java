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
			String S = br.readLine();
			String[] dato= S.split(" ");
			
			int V = Integer.parseInt(dato[0]);
			int C = Integer.parseInt(dato[1]);
			 
			int[] L=new int[V];
			for(int j=0;j<C;j++)
			{
				String[] dato1= br.readLine().split(" ");
				
				for(int i=0;i<V;i++)
				{
                  L[i]=L[i]+Integer.parseInt(dato1[i]);
				}
			}
			int act=L[0];
			int pos=1;

			for(int j=0;j<V;j++)
			{
               if(L[j]>act)
               {
            	act=L[j];
            	pos=j+1;
               }
			}
			
			System.out.println(pos);

			
			
	     }
	}
}