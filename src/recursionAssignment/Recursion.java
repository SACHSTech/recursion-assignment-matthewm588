package recursionAssignment;

public class Recursion{

  public static void main(String[] args) {

  }

  public static int countHi(String str) {

    if (str.length() < 2) {

      return 0;

    } else if (str.substring(0, 2).equals("hi")) {

      return 1 + countHi(str.substring(2));

    }

    return countHi(str.substring(1));

  }

  public static String pairStar(String str) {

    return "hel*lo";

  }

}
