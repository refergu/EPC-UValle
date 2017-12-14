import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainClass
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int T = Integer.parseInt(in);
		for(int i = 0; i < T; i++)
		{
			int NG, NM, TG, TM;
			br.readLine();
			String[] s= br.readLine().split(" ");
			NG = Integer.parseInt(s[0]);
			NM = Integer.parseInt(s[1]);
			TG = TM = 0;
			s = br.readLine().split(" ");
			for(int j = 0; j < NG; j++)
			{
				TG = Math.max(TG,Integer.parseInt(s[j]));			
			}
			s = br.readLine().split(" ");
			for(int j = 0; j < NM; j++)
			{
				TM = Math.max(TM,Integer.parseInt(s[j]));				
			}
			System.out.println(TG >= TM ? "Godzilla" : "MechaGodzilla");
		}
	}

}