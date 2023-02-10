
public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		logger.error("Hello");
		logger.log("Hello");
		Logger logger1 = new SpacedLogger();
		logger1.error("");
		logger1.log("Hello");
		
	}

}
