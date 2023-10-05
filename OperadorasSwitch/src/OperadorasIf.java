public class OperadorasIf {
    public static void main(String[] args) throws Exception {
        
        String plano = "T";

        if (plano.equals("B"))
        {
            System.out.println("Seu Plano possui: \n" +
                               "100 minutos de ligação");
        }
        else if (plano.equals("M"))
        {
            System.out.println("Seu Plano possui: \n" +
                               "100 minutos de ligação\n" +
                               "Whats e Instagram grátis");
        }
        else if (plano.equals("T"))
        {
            System.out.println("Seu Plano possui: \n" +
                               "100 minutos de ligação\n" +
                               "Whats e Instagram grátis\n" +
                               "5Gb de Youtube");
        }
        else
        {
            System.out.println("Plano não identificado");
        }
    }
}
