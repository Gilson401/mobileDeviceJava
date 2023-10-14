package phone;

import Device.Gadget;

public interface Phone extends Gadget {
    public void atender(); 
    public void ligar(String nummero); 
    public void iniciarCorrerioVoz(); 
}
