package SmartTv;
public class SmartTv {
    private boolean ligada = false;
    private int canal = 10;
    private int volume = 50;

    public void ligar (){
        if (this.ligada)
        {
            System.out.println("A TV já se encontra ligada.");
        } 
        else 
        {
            this.ligada = true;
            System.out.println("A TV ligou!");
        }
    }

    public void desligar() {
         if (this.ligada)
        {
            this.ligada = false;
            System.out.println("A TV desligou!");
        } 
        else 
        {
            System.out.println("A TV já se encontra desligada!");
        }
    }

    public void aumentarVolume(){
        if (this.ligada)
        {
            this.volume += 1;
            System.out.println("Volume aumentado para: " + this.volume);
        }
        else
        {
            System.out.println("A TV está deslisgada, não é possível aumentar o volume.");
        }
    }

    public void abaixarVolume() {
        if (this.ligada)
        {
            this.volume -= 1;
            System.out.println("Volume abaixado para: " + this.volume);
        }
        else
        {
            System.out.println("A TV está desligada, não é possível abaixar o volume.");
        }
    }

    public void avancarCanal(){
        if (this.ligada)
        {
            this.canal += 1;
            System.out.println("Canal alterado para: " + this.canal);
        }
        else
        {
            System.out.println("A TV está desligada não é possível avançar de canal");
        }
    }

    public void voltarCanal() {
        if (this.ligada)
        { 
            this.canal -= 1;
            System.out.println("Canal alterado para: " + this.canal);
        }
        else 
        {
            System.out.println("A TV está desligada não é possível voltar de canal.");
        }
    }

    public void alterarCanal(int canal) {
        if (this.ligada)
        {
            this.canal = canal;
            System.out.println("Canal alterado para: " + this.canal);
        }
        else
        {
            System.out.println("A TV está desligada não é possível trocar de canal");
        }
    }

}
