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
			double x=0;
			double y=0;
			double angle=0;
			
			in=br.readLine();
			int N=Integer.parseInt(in);
			
			
			for(int i=0 ;i<N;i++)
			{
				in=br.readLine();
				String[] dato= in.split(" ");
				
				String command = dato[0];
				Integer data = Integer.parseInt(dato[1]);
				//System.out.println(Math.cos(Math.toRadians(120)));
				
				
				if(command.equals("fd"))
				{
                    x=x+data*Math.cos(Math.toRadians(angle));
                    y=y+data*Math.sin(Math.toRadians(angle));
                    //System.out.println(x+"  "+y);
				}
				else if(command.equals("bk"))
				{
                    x=x-data*Math.cos(Math.toRadians(angle));
                    y=y-data*Math.sin(Math.toRadians(angle));
                   // System.out.println(x+"  "+y);
				}
				else if(command.equals("rt"))
				{
					angle=angle-data;//aumentar aungulo
					
					//System.out.println(angle+"grados");
				}
				else if(command.equals("lt"))
				{
					angle=angle+data;//reducir aungulo
					
					//System.out.println(angle+"grados");
				}


				
			}
			System.out.println((int)Math.round(Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2))));
			
		}
	}
}