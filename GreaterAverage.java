import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int T = sc.nextInt(); 
            while (T-- > 0) {
                double A = sc.nextDouble();
                double B = sc.nextDouble();
                double C = sc.nextDouble();
                if ((A + B) / 2.0 > C) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}