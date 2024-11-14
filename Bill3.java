// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
	    String name2 = args [1];
		String name3 = args[2];
		int sum = Integer.parseInt(args[3]);
		double money = Math.round((sum/3.0) +0.49);//add 0.49 so it will round up in the case of sum/3 is not a whole number (instead of rounding down)
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " + money + " Shekels each.");
	}
}
