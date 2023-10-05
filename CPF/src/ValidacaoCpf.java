
public class ValidacaoCpf {
	
	public static boolean isValid(String value) {

        value = value.replace(".", "");
        value = value.replace("-", "");
        String auxx = "";
        boolean continua = false;
        for (String caracter : value.split("")) {
            if (auxx.equals("")) {
                auxx = caracter;
            } else if (!auxx.equals(caracter)) {
                continua = true;
                break;
            }
        }
        if (!continua) {
            return false;
        }
        if (value.length() == 11) {
            int d1;
            int d2;
            int digito1;
            int digito2;
            int resto;
            int digitoCPF;
            String nDigResult;
            d1 = d2 = 0;
            for (int nCount = 1; nCount < value.length() - 1; nCount++) {
                digitoCPF = Integer.parseInt(value.substring(nCount - 1, nCount));
                d1 = d1 + (11 - nCount) * digitoCPF;
                d2 = d2 + (12 - nCount) * digitoCPF;
            }
            resto = (d1 % 11);
            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }
            d2 += 2 * digito1;
            resto = (d2 % 11);
            if (resto < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
            }
            String nDigVerific = value.substring(value.length() - 2, value.length());
            nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
            return nDigVerific.equals(nDigResult);
        }
        return false;
    }

}