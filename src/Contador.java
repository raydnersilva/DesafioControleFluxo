import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = scanner.nextInt();

            try {
                contar(parametroUm, parametroDois);
            }catch (ParemetrosInvalidosException exception){
                System.err.println(exception.getMessage());
            }
        } catch (InputMismatchException e) {
            System.err.println("Os parâmetros devem ser numeoros inteiros!");
        }
    }


    static void contar(int parametroUm, int parametroDois) throws ParemetrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw  new ParemetrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        int contagem = parametroDois - parametroUm;

        for(int count = 1; count <= contagem; count++){
            System.out.printf("Imprimindo o numero %d %n", count);
        }
    }
}