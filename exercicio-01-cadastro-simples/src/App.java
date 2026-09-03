import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        // ENTRADA
        System.out.print("Digite o nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite a cidade: ");
        String cidade = entrada.nextLine();

        // PROCESSAMENTO E SAÍDA
        System.out.println("\n--- RESUMO DO CADASTRO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Cidade: " + cidade);

        entrada.close();
    }
}
