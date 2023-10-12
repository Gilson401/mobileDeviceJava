package web_browser;

import java.util.Scanner;

import Device.Gadget;

public class Safari implements Browsers, Gadget {

    Integer abas = 0;

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        abas++;
        System.out.println("Nova aba adicionada. Total de " + abas + " abas");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void startGadget() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o endereço da página a visitar.");

        String userInput = scanner.nextLine();

        if (userInput.isBlank() || userInput.isEmpty()) {
            scanner.close();
            throw new RuntimeException("É necessário digitar uma url válida");
        } else if (userInput.length() < 5) {
            scanner.close();
            throw new RuntimeException("É necessário digitar uma url com tamanho mínimo");
        } else {
            exibirPagina(userInput);
        }

        scanner.close();

    }

}
