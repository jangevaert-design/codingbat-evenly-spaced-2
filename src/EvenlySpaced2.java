public class EvenlySpaced2 {
  public boolean evenlySpaced(int a, int b, int c) {
    return ((Math.abs(a - b) == Math.abs(b - c) && a != c)
        || (Math.abs(a - c) == Math.abs(b - c) && a != b)
        || (Math.abs(a - b) == Math.abs(a - c) && b != c)
        || (a == b && b == c));
  }
}
