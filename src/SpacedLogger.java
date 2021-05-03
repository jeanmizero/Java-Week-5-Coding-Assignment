// 3. b
public class SpacedLogger  implements Logger{
	
	@Override
	public void Log(String str) {
		// 7
		StringBuilder Log = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			Log.append(str.charAt(i) + " ");
		}
		System.out.println(Log);
	}
	
	@Override
	public void Error(String str) {
		System.out.println("ERROR:");
		Log(str);
	
	}	
}
