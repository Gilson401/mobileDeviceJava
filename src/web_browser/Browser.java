package web_browser;

import Device.Gadget;

public interface Browser extends Gadget {
    
    public void exibirPagina(String url);
    public void adicionarNovaAba();
    public void atualizarPagina();
   
     
}
