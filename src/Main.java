import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Bem-vindo ao jogo do Sushi Pet!");

        do {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1. Alimentar");
            System.out.println("2. Brincar");
            System.out.println("3. Dormir");
            System.out.println("4. Dar banho");
            System.out.println("5. Verificar status");
            System.out.println("6. Sair");
            System.out.print("Digite o número da ação: ");
            command = scanner.nextLine();

            switch (command) {
                case "1" -> System.out.println(pet.eat());
                case "2" -> System.out.println(pet.play());
                case "3" -> System.out.println(pet.sleep());
                case "4" -> System.out.println(pet.shower());
                case "5" -> System.out.println(pet.verifyStatus());
                case "6" -> System.out.println("Saindo do jogo. Até a próxima!");
                default -> System.out.println("Comando inválido. Tente novamente.");
            }
        } while (!command.equals("6"));

        scanner.close();
    }
}
