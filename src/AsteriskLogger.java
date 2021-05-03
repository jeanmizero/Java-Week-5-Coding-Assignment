// 3. a
public class AsteriskLogger implements Logger {
	@Override
	public void Log(String str) {
		// 4.
		System.out.println("***" + str + "***");
		System.out.println("");
	}

	@Override
	public void Error(String str) {
		String Error = "Error: " + str;
		
		int length = Error.length() + 6;
		StringBuilder asteriskWord = new StringBuilder();
		
		for (int i = 1; i <= length; i++) {
			asteriskWord.append('*');
		}
        // 5.       
		System.out.println(asteriskWord.toString());
		System.out.println("");
		Log(Error);
		System.out.println(asteriskWord.toString());
	}
}