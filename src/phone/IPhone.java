package phone;

import java.util.Scanner;

public class IPhone implements Phone {

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Executando audio do correio de voz");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Efetuando ligação para " + numero);
    }

    @Override
    public void startGadget() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma ação: 1-ligar, 2-Atender Ligação, 3-Ouvir Correio de voz");

        Integer userInput = scanner.nextInt();

        if (userInput == 1) {
            Scanner scannerLigacao = new Scanner(System.in);
            System.out.println("Digite o número para ligar");
            String numeroParaLigar = scannerLigacao.next();
            ligar(numeroParaLigar);
            scannerLigacao.close();
        } else if (userInput == 2) {
            atender();
        } else if (userInput == 3) {
            iniciarCorrerioVoz();
        } else {
            scanner.close();
            throw new RuntimeException("É necessário digitar um número com tamanho mínimo");
        }

        scanner.close();
    }

}
