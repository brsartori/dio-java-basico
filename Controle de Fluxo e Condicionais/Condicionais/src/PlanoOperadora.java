public class PlanoOperadora {
    /*Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
    O sistema terá 03 planos: BASIC, MIDIA , TURBO
BASIC: 100 minutos de ligação
MIDIA: 100 minutos de ligação + Whats e Intagram grátis
TURBO: 100 minutos de ligação + Whats e Intagram grátis + 5Gb Youtube
*/

	public static void main(String[] args) {
		String plano = "M"; //M / T
		
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
			System.out.println("5Gb Youtube");	
		}

}
}