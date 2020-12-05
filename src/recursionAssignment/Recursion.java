package recursionAssignment;

/**
* A program Recursion.java that contains methods to solve
* certain problems using recursion.
* @author Matthew Morelli
*/
public class Recursion{

  public static void main(String[] args) {

  }

  /**
  * Given a string, return the number of "hi"s in the
  * string
  *
  * @param str  The string to be analyzed
  * @return The number of "hi"static
  * @author Matthew Morelli
  */
  public static int countHi(String str) {

    if (str.length() < 2) {

      return 0;

    } else if (str.substring(0, 2).equals("hi")) {

      return 1 + countHi(str.substring(2));

    }

    return countHi(str.substring(1));

  }

  /**
  * Given a string, return the same string but with a "*"
  * in between consecutive same characters
  *
  * @param str  The string to be analyzed
  * @return  The string but with the "*"s
  * @author Matthew Morelli
  */
  public static String pairStar(String str) {

    if (str.length() < 2) {

      return str;

    } else if (str.substring(0, 1).equals(str.substring(1, 2))) {

      return str.substring(0, 1) + "*" + pairStar(str.substring(1));

    }

    return str.substring(0, 1) + pairStar(str.substring(1));

  }

  /**
  * Given a string, return the same string but with
  * consecutive equal characters as only one character
  *
  * @param str  The string to be analyzed
  * @return  The string but with the consecutive equal
  * characters as only one character
  * @author Matthew Morelli
  */
  public static String stringClean(String str) {

    if (str.length() < 2) {

      return str;

    } else if (str.substring(0, 1).equals(str.substring(1, 2))) {

      return stringClean(str.substring(1));

    }

    return str.substring(0, 1) + stringClean(str.substring(1));

  }

}
