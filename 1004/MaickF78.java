import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int C, f, c;
		C= in.nextInt();
		for(int k = 0; k < C; k++)
		{
			f=in.nextInt();
			c=in.nextInt();
			if (f == 1)
				System.out.println("R");
			else
			{
				if(f == c) {
					if(f % 2 == 0)
						System.out.println("L");
					else
						System.out.println("R");
				}
				else {
					if (f > c) {
						if (f == 2)
							System.out.println("D");
						else
						{
							if (c % 2 == 0)
								System.out.println("U");
							else
								System.out.println("D");
						}
					}
					else {
						if (f == 2)
							System.out.println("L");
						else
						{
							if (f % 2 == 0)
								System.out.println("L");
							else
								System.out.println("R");
						}
					}
				}
			}
	  	}
		in.close();
	}
}
