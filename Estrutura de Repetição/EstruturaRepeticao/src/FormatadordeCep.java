public class FormatadordeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376504");
            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("O Cep não corresponde a 8 dígitos");
        }
        }
    static String formatarCep(String cep) throws CepInvalidException{
        if(cep.length() != 8)
            throw new CepInvalidException();
            
            //simulando um cep formatado
            return "23.765-064";
    }

}
