import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shotgun s1 = new Shotgun();
        Scanner sc = new Scanner(System.in);
        System.out.println("o que deseja fazer?");

        System.out.println("1 - Atirar");
        System.out.println("2 - Preparar");
        System.out.println("3 - Recarregar");
        System.out.println("4 - Verificar estado");
        System.out.println("5 - Verificar munição");
        System.out.println("0 - fechar");
        System.out.println("");

        int escolha;

        do {
            System.out.println("Digite a opção desejada: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    s1.atirar();
                    break;
                case 2:
                    s1.preparar();
                    break;
                case 3:
                    s1.recarregar();
                    break;
                case 4:
                    s1.estado();
                    break;
                case 5:
                    s1.verMunição();
                    break;
                case 0:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }
}