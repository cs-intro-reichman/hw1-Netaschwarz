// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double percent = (Double.parseDouble(args[1]));
		int years = Integer.parseInt(args[2]);
		double rate = percent/100;
		double d = Math.pow((1+rate), years);
		double futureValue = currentValue * d;
		System.out.println("After " + years + " years, $" + currentValue + " saved at "+ percent + "% will yield $" +((int)futureValue));
	}
}