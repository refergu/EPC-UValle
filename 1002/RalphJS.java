import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class mainClass 
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new	BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int T = Integer.parseInt(in);
		for (int i = 0; i < T; i++) 
		{
			in = br.readLine();
			int N = Integer.parseInt(in);
			int[][] house = new int[N][N];
			for (int j = 0; j < N; j++)
			{
				String s = br.readLine();
				char[] carr = s.toCharArray();
				for(int k = 0; k < N; k++) 
				{
					house[j][k] = carr[k] == '.' ? 1 : 0;
				}
			}
			arr.add(area(N, house));
		}
		for(int i = 0; i < arr.size(); i++)
		{
			System.out.println(arr.get(i));
		}
	}
	public static int area(int N, int[][] house) 
	{
		int[][] h_aux = new int[N][N];
		int aux = 0;
		int ans = 0;
		for(int i = 0; i < N; i++)
		{
			h_aux[i][0] = house[i][0];
		}
		for (int i = 0; i < N; i++)
		{
			for (int j = 1; j < N; j++)
			{
				h_aux[i][j] = house[i][j] == 1 ? h_aux[i][j - 1] + 1 : 0;
			}
		}
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(house[i][j]==1)
				{
					aux = get_area(i, j, house, h_aux);
					if(aux > ans)
						ans = aux;
				}
			}
		}
		return ans;
	}
	public static int get_area(int i, int j, int[][] house, int[][] h_aux)
	{
		int ans = 0;
		int side = h_aux[i][j];
		for(int k = 0; k < side && i - k >= 0; k++) 
		{
			if(house[i - k][j] != 1)
				break;
			if (i - k - 1 >= 0 && side > h_aux[i - k - 1][j])
                side = h_aux[i - k - 1][j];
            ans++;
		}
		return ans;
	}
}