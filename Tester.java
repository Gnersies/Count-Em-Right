import java.util.Scanner;
public class Tester
{
	public static void main(String [ ] args )
	{
		Scanner b = new Scanner(System.in);
		String a = "";
		String []sp;
		while (!a.equals("EXIT")){
			System.out.print("Type a sentence and press ENTER. ");
			a = b.nextLine();
			a = a.toUpperCase();
			sp = a.split("S\\s+A|SA");
			System.out.println("There are " + (sp.length-1) + " occurrences.");
		}
	}
}