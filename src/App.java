public class App {
     // 9. 
	public static void main(String[] args) {
     // 10. 
		AsteriskLogger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
	
		asteriskLogger.Log("Hello");
		asteriskLogger.Error("Hello");
		// 7
		spacedLogger.Log("Hello");
		// 8. 
		spacedLogger.Error("Hello");
		
		//11. 
		asteriskLogger.Log("America");
		asteriskLogger.Error("America");
	
		spacedLogger.Log("Wordspacing");
		
		spacedLogger.Error("Wordspacing");

	}
}

