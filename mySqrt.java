public class mySqrt{
  public static int mySquareRoot(int x) {
    double guess = x / 2.0;
    double epsilon = 0.000001;
		while(Math.abs(guess * guess - x) > epsilon) {
      guess = (guess + x / guess) / 2.0;
    }
		int roundedInt = (int) Math.floor(guess);
		return roundedInt;
		}
}
