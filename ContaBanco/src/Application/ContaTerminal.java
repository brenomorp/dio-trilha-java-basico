package Application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter the bank branch: ");
		String branch = sc.nextLine();
		System.out.print("Enter the account holder's name: ");
		String name = sc.nextLine();
		System.out.print("Enter the account balance: ");
		double balance = sc.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", name, branch, account, balance);
		
		sc.close();
	}

}
