import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainClass 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int t = Integer.parseInt(in);
		for(int i = 0; i < t; i++)
		{
			in = br.readLine();
			System.out.println(tranverseGrid(Integer.parseInt(in.split(" ")[0]),Integer.parseInt(in.split(" ")[1])));
		}
		br.close();
	}
	public static String tranverseGrid(int n, int m)
	{
		return n <= m ? n % 2 == 1 ? "R" : "L" : m % 2 == 1 ? "D" : "U";
	}
}