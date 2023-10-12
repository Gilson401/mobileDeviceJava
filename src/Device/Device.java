package Device;

import java.util.Scanner;

import music_player.ReprodutorMusicial;
import phone.IPhone;
import web_browser.Safari;

public class Device {
    IPhone iPhone = new IPhone();
    ReprodutorMusicial player = new ReprodutorMusicial();
    Safari browser = new Safari();

    private Boolean isOn = false;

    public Boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(Boolean isOn) {
        this.isOn = isOn;
    }

    public void escolhaGadget() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um gadget: ");
        System.out.println("1 - Telefone, 2 - Player de Música, 3 - Navegador");
        System.out.println("        ");

        Integer userInput = scanner.nextInt();

        if (userInput == 1) {
            System.out.println("Gadget Selecionado : Telepfone");
            iPhone.startGadget();
        } else if (userInput == 2) {
            System.out.println("Gadget Selecionado : Player de música");
            player.startGadget();
        } else if (userInput == 3) {
            System.out.println("Gadget Selecionado : Navegador");
            browser.startGadget();
        } else {
            scanner.close();
            throw new RuntimeException("Opção indisponível!");
        }

        scanner.close();

    }

}
