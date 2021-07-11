public class Calculator {
public static void main(String x[]) {

String[][][] demn=new String[12][5][2];
for (int i=0;i<12;i++) {
	for (int j=0;j<5;j++) {
		for (int k=0;k<2;k++) {
			
		demn[i][j][k]="{"+i+" "+j+"}";
		}
	}
}

for (int i=0;i<12;i++) {
		
		System.out.print(i+" ");
		System.out.print("| ");
	for (int j=0;j<5;j++) {
		for (int k=0;k<2;k++) {
			System.out.print(demn[i][j][k]);
		}
		
	}
		System.out.println("|");

		
}
		System.out.println(" ");

			System.out.print(demn[1][0].length);
}



}