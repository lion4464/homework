import java.util.Scanner; 

public class Palidrone{
 
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
 System.out.print("Parolni kiritng: ");
      String pass;
          pass=input.nextLine(); 
            boolean valid=IsValidate(pass);
              System.out.println("Your password is "+valid);
              System.out.println("Because: ");
              System.out.println("Is IsEnoughChar:"+IsEnoughChar(pass));
              System.out.println("Is IsEnoughDigits:"+IsThreeDigit(pass));
          }
// password is valid?

  public static boolean IsValidate(String b){
     boolean isVal=false;
     boolean result=IsEnoughChar(b);
    return result;
  }
// Password is enough?

public static boolean IsEnoughChar(String a){
  boolean isEnough=false;
     if (a.length()>9) {
       isEnough=IsThreeDigit(a);
     }
    return isEnough;

}

// there is three digits in password? 

public static boolean IsThreeDigit(String c){
  boolean isThree=false;
  int sum=0;
     for (int i=0;i<c.length();i++) {
       char threeDigit=c.charAt(i);
       if (Character.isDigit(threeDigit)) {
         sum++;
         if (sum>3) {
           isThree=true;
           break;
         }
       }
     }
    return isThree;
}


}
