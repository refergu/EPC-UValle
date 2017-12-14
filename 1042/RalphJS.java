import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainClass 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int T = Integer.parseInt(in);
		double ans, H, D, acum = 0.0;
		for(int i = 0; i < T; i++)
		{
			in = br.readLine();
			H = Double.parseDouble(in.split(" ")[0]);
			D = Double.parseDouble(in.split(" ")[1]);
			ans = (H*H-D*D)/(2*H);
			System.out.printf("%.1f\n",ans);
			acum += ans;
		}
		System.out.printf("%.1f",acum/T);
	}

}