package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
  // Bài 9.1: Viết chương trình nhập vào một số nguyên. Kiểm tra số đó nguyên dương hay nguyên âm. In ra màn hình kết quả
		      
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen k");
		int k = sc.nextInt();
		if(k>=0) {
			System.out.println(" k la so nguyen duong ");
		}else {
			System.out.println(" k la so nguyen am ");
		}
		   
  //Bài 9.2: Viết chương trình nhập vào một số nguyên n. Kiểm tra n chia hết cho 3 hay 5. In kết quả ra màn hình
		
	    System.out.println(" Nhap vao so nguyen n ");
	    
	    int p = sc.nextInt();
	    if(p % 3 == 0) {
	    	System.out.println(" p chia het cho 3");
	    }else {
	    	System.out.println(" p khong chia het cho 3 ");
	    }
	    if(p % 5 ==0) {
	    	System.out.println(" p chia het cho 5 ");
	    }else {
	    	System.out.println(" p khong chia het cho 5");
	    }
	    
  //Bài 9.3: Viết chương trình nhập vào tháng trong năm.In ra số ngày của tháng đó
	    
	    System.out.println(" Nhap vao thang ");
	    int thang = sc.nextInt();
	    
	    if( thang == 2) {
	    	System.out.println(" Thang co 28 ngay, thang nhuan co 29 ngay ");
	    }
	    if(thang == 4 ||thang == 6||thang ==9||thang ==11) {
	    	System.out.println(" Thang co 30 ngay ");
	   
	    }

	    if(thang != 4 ||thang != 6||thang !=9||thang !=11) {
	    	System.out.println(" Thang co 31 ngay ");
	    

	}
	    
	    
  //Bài 9.4: Viết chương trình giải phương trình bậc 2
		
	    
	    System.out.println(" Nhap vao a ");
	    float a = sc.nextFloat();
	    
	    System.out.println(" Nhap vao b");
	    float b = sc.nextFloat();
	    
	    System.out.println(" Nhap vao c");
	    float c = sc.nextFloat();
	    
	    if(a==0) {
	    	if(b==0) {
	    		System.out.println(" Phuong trinh vo nghiem ");
	    	}else {
	    		System.out.println(" Phuong trinh co mot nghiem x = " + -c/b);
	    	}
	    }
	    
	    // Tính delta
	    
	    float delta = b*b - 4*a*c;
	    float x1, x2;
	    
	    // Tính nghiệm của phương trình
	    
	    if ( delta>0) {
        x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
        x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
        
            System.out.println(" Phuong trinh co 2 nghiem la x1 = " + x1 + " va x2 = " + x2);
	    } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println(" Phuong trinh co nghiem kep la x1 = x2 = " + x1);
	    } else {
	    	System.out.println(" Phuong trinh vo nghiem ");
	    }
	    
	    
  // Bài 9.5.Viết chương trình nhập vào 3 số m, n, q. Kiểm tra có phải là 3 cạnh của một tam giác không?
        
	    System.out.println(" Nhap m ");
	    float m = sc.nextFloat();
	    
	    System.out.println(" Nhap n ");
	    float n = sc.nextFloat();
	    
	    System.out.println(" Nhap q ");
	    float q = sc.nextFloat();
	    
	    if (m+n>p && m+p>n && n+p>m ) {
	    	System.out.println(" m, n, q la ba canh cua mot tam giac ");
	    }else {
	    	System.out.println(" m, n, q khong phai la ba canh cua mot tam giac ");
	    }
	    
	    
	    
	}
	
	
 
	
	    
	

}

