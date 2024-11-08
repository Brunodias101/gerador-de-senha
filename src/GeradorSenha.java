import java.util.Random;
import java.util.Scanner;

public class GeradorSenha {
    // Conjuntos de caracteres
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Qual o tamanho da sua senha:");
        int length = scanner.nextInt();

        System.out.println("Incluir letra minuscula? (s/n)");
        boolean incluirMinuscula = scanner.next().equalsIgnoreCase("s");

        System.out.println("Incluir letra Maiuscula? (s/n)");
        boolean incluirMaiuscula = scanner.next().equalsIgnoreCase("s");

        System.out.println("Incluir numeros? (s/n)");
        boolean incluirNumero = scanner.next().equalsIgnoreCase("s");

        System.out.println("Incluir Caracteres? (s/n)");
        boolean incluirCaracteres = scanner.next().equalsIgnoreCase("s");

        // Construção do conjunto de caracteres
        String conjuntoCaracteres = "";
        if (incluirMinuscula) conjuntoCaracteres += LOWERCASE;
        if (incluirMaiuscula) conjuntoCaracteres += UPPERCASE;
        if (incluirNumero) conjuntoCaracteres += NUMBERS;
        if (incluirCaracteres) conjuntoCaracteres += SPECIAL_CHARACTERS;

        // Verificação de conjunto vazio
        if (conjuntoCaracteres.isEmpty()) {
            System.out.println("Nenhum conjunto de caracteres selecionado. Tente novamente.");
            return;
        }

        // Geração da senha
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(conjuntoCaracteres.length());
            password.append(conjuntoCaracteres.charAt(index));
        }

        // Exibindo a senha gerada
        System.out.println("Senha gerada: " + password);


    }
}