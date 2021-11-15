import java.util.Scanner;


public class Alphabetprog {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
	int vowels = 0;
	int constants = 0;
	
	for(int i=0; i < 10; i++)
	
		System.out.println("Enter a letter in the alphabet");
	char letter = sc.next().charAt(0); 
	if(letter == 'a' || letter =='e' || letter =='o' || letter == 'u')
		
	{
		vowels++;
	}
	else
	{
		constants++;
	}

	
	if(vowels > constants)
	{
		System.out.println("There are more Vowels than Constant");
	}
	else if(constants > vowels)
	{System.out.println("There are more Constants than Vowels");
	
	}
	else
		System.out.println("Both are equal"); 
	
	}
	
	}


