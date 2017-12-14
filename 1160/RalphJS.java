import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main 
{

	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) 
		{
			String[] s = br.readLine().split(" ");
			int x,y;
			x = Integer.parseInt(s[0]);
			y = Integer.parseInt(s[1]);
			int ans = x == y ? (x % 2 == 0) && (y % 2 == 0) ? x + y : x + y -1: x == y + 2 ? (x % 2 == 0) && (y % 2 == 0) ?  x + y : x + y - 1 : -1; 
			if(x == 1 && y == 1)
			{
				System.out.println(1);
			}
			else if (ans >= 0)
			{
				System.out.println(ans);
			}
			else
			{
				System.out.println("No Number");
			}
		}
	}
}