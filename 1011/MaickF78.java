import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String  [] ganadores = new String [t];
		int mayg = 0;
		int maygi = 0;
		for (int i = 0; i < t; i++)
		{
			int g = sc.nextInt();
			int gi = sc.nextInt();
			mayg = maygi = 0;
			for (int j = 0; j < g; j++)
			{
				int mg = sc.nextInt(); 
				if (mg > mayg)
				{
					mayg = mg;
				}
			}
			for (int k = 0; k < gi; k++)
			{
				int mgi = sc.nextInt(); 
				if (mgi > maygi)
				{
					maygi = mgi;
				}
			}
			if (mayg >= maygi)
				ganadores[i] = "Godzilla";
			else
				ganadores[i] = "MechaGodzilla";
		}
		sc.close();
		for (int f = 0; f < t; f++)
		{
			System.out.println(ganadores[f]);
		}
	}

}
