package kombinasyon;

import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m,i=1,top=1,n,sonuc=0,x=1,c=1;

		System.out.println(" fakteriyel sayýyý giriniz : " );
        m = input.nextInt();
        
        while(i<m) {
        	
        	i++;
        	top*=i;
        
        }
        System.out.println(" faktöriyel : " +top);
        System.out.println(" kaç elemanlý olucak: " );
        n = input.nextInt();
        
        while(i<n) {
        	
        	i++;
        	x*=i;
        
        }
        System.out.println(" faktöriyel : " +c);
        
        sonuc=top/(x*(top-x));
        
        System.out.println("kombinasyon: " + sonuc);
	}

}
