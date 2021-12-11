import java.util.Scanner;

class multiplication {

   public static void main( String[] args ) {
      int a, b, c = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Veuillez introduire deux chiffres: ");
      a = s.nextInt();
      b = s.nextInt();
      c = a * b;
      System.out.println( "Le résultat de la multiplication entre  a et b est: " + c );
   }

}