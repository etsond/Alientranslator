import java.util.Scanner;

//Etson Dorival


public class AlienTranslator { 

 

 private static final boolean CharT = false;




	public static void main(String[] args) { 

		AlienTranslator a = new AlienTranslator(); 

		Scanner s = new Scanner(System.in); 

		a.translateInput(s); 

 } 

	public String translateInput(Scanner in) {
		System.out.println("What planet?");
		int planet = in.nextInt(); 
		
		// User input validation
		if (planet==1){;
		}
		else if (planet==2){;
		}
		else {
			System.out.println("Not a valid planet.");
			return"";
		}
		
		// Tell the user to enter a message
		System.out.println("What is the message?");
		in.nextLine();
		String message = in.nextLine();


	  String result = ""; 

	 

	  for (int i=0; i < message.length(); i++) { 

	   char charToTranslate = message.charAt(i); 

	   int tmp = (int)charToTranslate;
	   if (planet == 1 && (tmp >= 65 && tmp <= 90)){
		   		result = result + (char)(((tmp-65-2+26)%26)+65);
	   }
	   else if(planet == 1 && (tmp >=97 && tmp <= 122)){
		   		result = result + (char)(((tmp-97-2+26)%26)+97);
	   }
	   else if (planet == 2 && (tmp >= 65 && tmp <= 90 )){
		   result = result + (char)((((tmp+2)-65)%26)+65);  
	   }
	   else if (planet == 2 && (tmp >= 97 && tmp <= 122)){
		   result = result + (char)((((tmp+2)-97)%26)+97);   
	   }
	   else {
		   // Any other character does not need to be translated
		   result = result + (char)tmp;
	   }

	  }
		  
	if (planet == 1){
		System.out.println("Original Message in Beaumondian: " + message);
	}
	else if ( planet == 2 ){
		System.out.println ("Original message in Reginian: " + message);
	}
	System.out.println("Translation in Earth English: " + result);

	  return result; 


	 }

	}