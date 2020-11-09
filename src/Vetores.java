import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		double aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10, total;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Por favor, digite o consumo do 1º aluno");
		aluno1 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 2º aluno");
		aluno2 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 3º aluno");
		aluno3 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 4º aluno");
		aluno4 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 5º aluno");
		aluno5 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 6º aluno");
		aluno6 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 7º aluno");
		aluno7 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 8º aluno");
		aluno8 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 9º aluno");
		aluno9 = leitor.nextDouble();
		System.out.println("Por favor, digite o consumo do 10º aluno");
		aluno10 = leitor.nextDouble();
		
		total = aluno1 + aluno2 + aluno3 + aluno4 + aluno5 + aluno6 + aluno7 + aluno8 + aluno9 + aluno10;
		
		System.out.println("O aluno 1 consumiu R$" + aluno1);
		System.out.println("O aluno 2 consumiu R$" + aluno2);
		System.out.println("O aluno 3 consumiu R$" + aluno3);
		System.out.println("O aluno 4 consumiu R$" + aluno4);
		System.out.println("O aluno 5 consumiu R$" + aluno5);
		System.out.println("O aluno 6 consumiu R$" + aluno6);
		System.out.println("O aluno 7 consumiu R$" + aluno7);
		System.out.println("O aluno 8 consumiu R$" + aluno8);
		System.out.println("O aluno 9 consumiu R$" + aluno9);
		System.out.println("O aluno 10 consumiu R$" + aluno10);

		System.out.println("O total de consumo foi de R$" + total);
		
		leitor.close();
		

	}

}
