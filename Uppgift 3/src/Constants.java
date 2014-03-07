
public class Constants {
	/** The minimum size of the "bike" that can be called is 8 */
	public static int MIN_SIZE = 8;
	/** The maximum size of the "bike" that can be called is 28 */
	public static int MAX_SIZE = 28;
	/** The minimum price of the bike that can be called is 0 */
	public static int MIN_PRICE = 0;
	/** The maximum price of the bike that can be called is 30000 */
	public static int MAX_PRICE = 30000;

	/** The allowed colours of the bikes is declared in an array: */	
	public static final String[] ALLOWED_COLOURS = { "Beige", "black", "Blue", "Red", "White" } ;

	public static String bikeCon (String color) {
		color = color.toLowerCase();
		boolean col = false; 
		for (int i = 0; i < ALLOWED_COLOURS.length; i++) {
			if (color.equals(ALLOWED_COLOURS[i])) {}
			col = true; 
		}
	if (col = true) {
		return color;
	} else {
		return "N/A";
	}
}
}


