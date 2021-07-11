import java.util.Scanner; 

public class DeckOfCards {
 
public static void main(String[] args) {
Scanner input=new Scanner(System.in);
 System.out.print("ko'pburchak tomonini kiritng: ");
      int a;
          a=input.nextInt(); 
          MuntazamKopburchak(a); 
  }

public static void MuntazamKopburchak(int n){
  int result;
  result=n*(3*n-1)/2;
  System.out.printf("%7d",result);
}


}
