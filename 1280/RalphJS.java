import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int ans = 0;
		while(true) 
		{
			num = Integer.parseInt(br.readLine());
			ans = 1;
			if(num > 0)
			{
				for(int i = 0; i < num; i++) 
				{
					ans += i*2;
				}
				System.out.printf("%d => %d\n", num, ans);
			}
			else 
			{
				break;
			}
		}
	}
}