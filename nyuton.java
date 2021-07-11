import java.util.Scanner; 

public class Nyuton{
 
public static void main(String[] args) {
// Scanner input=new Scanner(System.in);

final int ALISTS=5;
final int BEGIN=1;

int[][] nyuton=new int[5][6];
int sum=0;
                for (int i=0;i<5;i++) {
                        // nyuton[0][0]=1;
                   
                    for(int j=0;j<i+1;j++){
                        nyuton[i][j]=1;
                      }
                   
                }

                for (int a=0;a<nyuton.length;a++) {
                  for (int b=0;b<nyuton[a].length;b++) {
                    System.out.print(nyuton[a][b]);
                    }
                    System.out.println();
                }
      
           }
}
