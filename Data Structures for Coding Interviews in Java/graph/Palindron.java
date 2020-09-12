public class Palindron {

  public static void main(String [] args){
    String s = "muzm";
    System.out.println(isPalindrone(s));

  }

  public static boolean isPalindrone(String s) {
    int mid = s.length() / 2;

//    System.out.println( "mid : " + mid);
    int tl = s.length() -1;
    for (int i = 0; i < mid; i++){

//      System.out.println( "statt : " + s.charAt(i));
//      System.out.println( "end: " + s.charAt(tl-i));
      if(s.charAt(i) != s.charAt(tl -i)){
        return false;
      }

    }

    return true;
  }
}
