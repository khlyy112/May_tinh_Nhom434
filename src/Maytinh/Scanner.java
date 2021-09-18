import java.util.Scanner;

public class So_nt {
	 public static void main(String args[]){
		 int n;
		  Scanner s = new Scanner(System.in);
		  System.out.printf("Nhap so n: \n");
		  n = s.nextInt();
		  if(n>0) {
			  if(SoNguyeTo(n)==1)
				  System.out.println(n+" la so nguyen to");
			  else 
				  System.out.println(n+" khong phai la so nguyen to");
		  }
	 }

	 public static int SoNguyeTo (int n){
		int dem=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				dem++;
		}
		if(dem==2) {
			return 1;
		}else return 0;
	 }
}