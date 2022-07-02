import java.math.BigInteger;
import java.util.stream.IntStream;

public class main {
  public static void main(String[] args) {
    System.out.println(String.valueOf(getFactorial(100))
        .chars()
        .map(Character::getNumericValue)
        .sum());
  }

  public static BigInteger getFactorial(int f) {
    if (f < 2) {
      return BigInteger.valueOf(1);
    }
    else {
      return IntStream.rangeClosed(2, f).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }
  }
}

