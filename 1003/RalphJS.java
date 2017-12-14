import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class mainClass 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		int T = Integer.parseInt(in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < T; i++)
		{
			String[] s = br.readLine().split(" ");
			int m = Integer.parseInt(s[1]);
			int n = Integer.parseInt(s[0]);
			int[] candidate = new int[n];
			for(int j = 0; j < m; j++)
			{
				s = br.readLine().split(" ");
				for(int k = 0; k < n; k++)
				{
					candidate[k] += Integer.parseInt(s[k]);
				}
			}
			int max = 0;
			int winner = 0;
			for(int j = 0; j < n; j++)
			{
				if(candidate[j] > max)
				{
					max = candidate[j];
					winner = j + 1;
				}
			}
			arr.add(winner);
		}
		for(int i = 0; i < arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
		br.close();
	}
}
