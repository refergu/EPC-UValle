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
			
			Integer N = Integer.parseInt(dato[0]);
			Integer M = Integer.parseInt(dato[1]);
			if(N==M)
			{
				if(N%2==0)
				{
					System.out.println("L");
				}
				if(N%2==1)
				{
					System.out.println("R");
				}
				
			}
			if(N>M)
			{
				if(M%2==0)
				{
					System.out.println("U");
				}
				if(M%2==1)
				{
					System.out.println("D");
				}
				
			}
			if(M>N)
			{
				if(N%2==0)
				{
					System.out.println("L");
				}
				if(N%2==1)
				{
					System.out.println("R");
				}
				
			}

			
	    }

      }
}
