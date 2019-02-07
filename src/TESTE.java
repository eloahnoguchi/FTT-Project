import java.util.ArrayList;
import java.util.Scanner;

public class TESTE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Eloah");
		System.out.println("Is the best");
		
		
		//System.out = standard output
		//System.in = standard input
		//System.err = standard error
		
		ArrayList<String> userMessages =new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int acumulador=0;
		
		while(sc.hasNext()) {
			
			String userText = sc.nextLine();
			
			if(userText.isEmpty())
				break;
			
			
			try{
				
			acumulador += Integer.valueOf(userText);
			
			}catch(Exception e){
				
				userMessages.add(userText);
				System.err.print("ops");
				e.printStackTrace();
		}
			System.out.println("Valor acumulado: " + acumulador);
	
		}
		sc.close();
		
		for(int x=0;x<userMessages.size();x++)
			System.out.println(userMessages.get(x));
	}
	
		

}
