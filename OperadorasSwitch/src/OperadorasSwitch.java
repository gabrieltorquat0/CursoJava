public class OperadorasSwitch {

    public static void main(String[] args) {
        String operadora = "T";

        switch (operadora)
        {
            case "B":
            System.out.println("Seu plano possui 100 minutos de ligação");
            break;

            case "M":
            System.out.println("Seu plano possui 100 minutos de ligação + Whats e Instagram grátis");
            break;

            case "T":
            System.out.println("Seu plano possui 100 minutos de ligação + Whats e Instagram grátis + 5Gb de Youtube");
            break;

            default:
            System.out.println("Plano não identificado.");
            break;
        }
    }
    
}
