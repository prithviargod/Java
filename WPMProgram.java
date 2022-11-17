import java.time.LocalTime;
import java.util.Scanner; 

public class WPMProgram { 
	   
	public static void main(String[] args) { 

		System.out.println("Start typing");
		
//		this is to get Nanos time of the day
		double start = LocalTime.now().toNanoOfDay();
		
		Scanner scan = new Scanner(System.in); 
		String typeWords = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay(); 
		
		double elapsedTime = end - start; 
		double seconds = elapsedTime / 1000000000.0;
		
		int numChars = typeWords.length(); 
		
//		Count all typed characters and divide by five to get the number of words typed.
		
//		To give an example, if you typed 200 characters in 1 minute, 
//		your net wpm typing speed would be (200 characters / 5) / 1 min = 40 WPM. 
		
//		If you typed 200 characters in 30 seconds 
//		your net speed would be (200/5) / 0.5 = 80 WPM.
		
//		(number of Characters / 5) / 1 minutes
		
		int WPM = (int)( ( ( (double) numChars / 5)/ seconds)* 60  );
//		here seconds is our time elapsed which is in seconds.
//		if multiply by 60 we get word per minutes.
		
		System.out.println("Your typing  speed is " + WPM + " WPM.");
		
	}

}
