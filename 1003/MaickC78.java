import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int [] ganadores = new int [t];
		for (int i = 0; i < t; i++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int [] votos = new int [n];
			for (int j = 0; j < m; j++)
			{
				for (int k = 0; k < n; k++)
				{
					votos[k] += sc.nextInt();
				}
			}
			int max = 0;
			for (int c = 0; c < n; c++)
			{
				if (votos[c] > max)
				{
					max =  votos[c];
					ganadores[i] = c+1;
				}
			}
		}
		for (int f = 0; f < t; f++)
		{
			System.out.println(ganadores[f]);
		}
	}

}
