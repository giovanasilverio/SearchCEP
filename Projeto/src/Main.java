import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchCep searchCep = new SearchCep();

        System.out.println("Digite o número do CEP: ");
        var cep = scanner.nextLine();
        try {
            Adress newAdress = searchCep.searchAdress(cep);
            System.out.println(newAdress);
            FileGenerator generator = new FileGenerator();
            generator.saveJson(newAdress);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (RuntimeException | IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
