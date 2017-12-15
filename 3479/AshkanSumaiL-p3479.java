import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
	public static void main(String args[])throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String in = br.readLine();
			int N =Integer.parseInt(in);
			double C=0;
			C=(1-Math.cos(2*N))/(2*Math.sin(1));
			System.out.printf("%.6f\n",C);
	}
}
