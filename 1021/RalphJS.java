import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainClass 
{
	public static void main(String[] args)throws IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = 0;
		int m = 0;
		int course = 0;
		int cat = 0;
		int kp = 0;
		boolean can;
		while(true)
		{
			ArrayList<Integer> arr = new ArrayList<Integer>();
			String[] s=br.readLine().split(" ");
			k = Integer.parseInt(s[0]);
			if(k != 0)
			{
				m = Integer.parseInt(s[1]);
				String[] c= br.readLine().split(" ");
				for(int i = 0; i < c.length; i++) 
					arr.add(Integer.parseInt(c[i]));
				can = true;
				for(int i = 0; i < m; i++) 
				{
					String[] r = br.readLine().split(" ");
					kp = Integer.parseInt(r[0]);
					cat = Integer.parseInt(r[1]);
					int cont = 0 ;
					for(int j = 0;  j < kp; j++) 
					{
						course = Integer.parseInt(r[j+2]);
						for (int l = 0; l < k; l++ ) 
						{
							if (course == arr.get(l))
							{
								cont++;
								break;
							}
						}
					}
					if(cont < cat)
						can = false;
				}
				if(can) 
					System.out.println("yes");						
				else
					System.out.println("no");
			}
			else 
			{
				break;
			}	
		}
	}
}
