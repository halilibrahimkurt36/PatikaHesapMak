import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double number1 = 0,number2 = 0;
		double result;
		
		String sing = null;
		Scanner giris=new Scanner(System.in);
		
			System.out.print("Lütfen 1.Sayıyı Giriniz  ");
		number1=giris.nextDouble();
		System.out.print("Lütfen 2.Sayıyı Giriniz  ");
		number2=giris.nextDouble();
		
		System.out.print("Lütfen Hesap Makinası için bir işlem seçiniz = (+) (-) (*) (/)  ");
		sing=giris.next();
		if(sing.equals("+")||sing.equals("-")||sing.equals("*")||sing.equals("/")) {
			switch(sing) {
			case "+":
			result=number1+number2;
			System.out.println(result);
			break;
			case "-":
			
			result=number1-number2;
			System.out.println(result);
			
				break;
			case "*":
				result=number1*number2;
				System.out.println(result);
				break;
			case "/":
				if(number1!=0 && number2!=0 || number2!=0) {
					result=number1/number2;
					System.out.println(result);
				}
				else {
					System.out.println("Hatalı Giriş Yaptınız");
				}
				break;
			}	
		}
		else {
			System.out.println("Hatalı Seçim Yaptınız!!!");
			
		}
	
		
		
	}
	}

