
public class SpacedLogger implements Logger{

	@Override
	
	
	public void log(String log) {
		//log.charAt()
		// go through length of the log and add a space btwn each char
		for (int i =0; i < log.length(); i++) {
			
			System.out.print(log.charAt(i)+ " ");
			
			
		}
		
		System.out.println("***");
		System.out.println("**********************");
		
		
	}

	@Override
	public void error(String error) {
		
		//String log = null;
			
		System.out.println("*******************");
		System.out.print("***ERROR:" + error );
			
			
		
	}
	
}
