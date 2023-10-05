package Usuario;

import SmartTv.SmartTv;

public class Usuario {
    String nome;

    public static void main (String[] args){
        SmartTv tv = new SmartTv();

        tv.desligar();
        tv.ligar();
        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.abaixarVolume();
        tv.avancarCanal();
        tv.voltarCanal();
        tv.alterarCanal(70);
        tv.desligar();
    }
    
}
