import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class mainclass {
	
	public static void main(String args[])throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String in = br.readLine();
		int T =Integer.parseInt(in);
		double tot=0;
		
		for(int r=0;r<T;r++)
		{

			String S = br.readLine();
			String[] dato= S.split(" ");
			
			double H = Double.parseDouble(dato[0]);
			double D = Double.parseDouble(dato[1]);

			
			
			double Res=(Math.pow(H, 2)-Math.pow(D, 2))/(2*H);
			System.out.printf("%.1f\n",Res);
			tot=tot+Res;
			
	    }
		System.out.printf("%.1f\n",tot/T);
      }
}