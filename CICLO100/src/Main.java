import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int _A , _N , _I;
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
			System.out.println("ANO DE NASCIMENTO");
			_I = sc.nextInt();
			if (_I >= 1996) {
				
			}
			System.out.println("ANO ATUAL");
			_A = sc.nextInt();
		
		if (_A >= 2099 || _A < 1960) {
			
		}
		_N = _A - _I;
		System.out.println("SUA IDADE NO " + _N +" IDADE ATUAL NO ANO "+ _A);

			}
		}catch (InputMismatchException e) {
			e.fillInStackTrace();
		}
		}
		

}
