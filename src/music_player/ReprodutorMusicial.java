package music_player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Device.Gadget;

public class ReprodutorMusicial implements MusicPlayers, Gadget {

    List<String> musicasJovemGuarda = new ArrayList<>();

    void loadMusicas() {

        musicasJovemGuarda.add("Banho de Lua");
        musicasJovemGuarda.add("Festa de Arromba");
        musicasJovemGuarda.add("O Calhambeque");
        musicasJovemGuarda.add("Pare o Casamento");
        musicasJovemGuarda.add("Prova de Fogo");
    }

    String musicaSelecionada = null;
    Boolean estaTocandoMusica = false;

    public ReprodutorMusicial() {
        this.loadMusicas();
    }

    @Override
    public void tocar() {
        if (musicaSelecionada == null) {
            return;
        } else {
            estaTocandoMusica = true;
            System.out.println("Tocando música " + musicaSelecionada);
        }
    }

    @Override
    public void pausar() {
        if (musicaSelecionada != null && estaTocandoMusica == true) {
            estaTocandoMusica = false;
            System.out.println("Música pausada " + musicaSelecionada);
        }
    }

    @Override
    public void selecionarMusica() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Músicas disponíveis no aparelho: ");

        Integer indice = 0;
        for (String musica : musicasJovemGuarda) {
            System.out.println(indice + " : " + musica);
            indice++;
        }

        System.out.println("Selecione a Música digitando um número: ");

        Integer userInput = scanner.nextInt();

        System.out.println("Você escolheu: " + userInput);

        try {
            this.musicaSelecionada = musicasJovemGuarda.get(userInput);
            tocar();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("A opção escolhida não é válida");
        }

        scanner.close();
    }

    @Override
    public void startGadget() {
        selecionarMusica();
    }

}
