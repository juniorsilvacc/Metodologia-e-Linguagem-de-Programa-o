package  exer1 ;

import  java.util.Scanner ;

 classe  pública Pousada {
	public  static  void  main ( String [] args ) {
		Digitalização do scanner =  novo  Scanner ( System . In);
		int controle =  1 , dias, conta, contaTotal =  0 ;
		Cliente da cadeia ;
		while (controle ==  1 ) {
			Sistema . fora . println (
					" Informe o nome do cliente, eo número total de dias passados ​​por ele na pousada, respectivamente: " );
			cliente = scan . Próximo();
			dias = scan . nextInt ();
			if (dias <  10 ) {
				conta =  40  * dias +  15  * dias;
				contaTotal + = conta;
			} mais {
				conta =  40  * dias +  15  *  9  +  8  * (dias -  9 );
				contaTotal + = conta;
			}
			Sistema . fora . println ( " Nome do cliente: "  + cliente);
			Sistema . fora . println ( " Conta: "  + conta);
			Sistema . Fora
					.println ( " Deseja Continuar Informando Mais Clientes (1 para sim, QUALQUÉR Outro Número Para sair)? " );
			controle = scan . nextInt ();
		}
		Sistema . fora . println ( " Valor total arrecadado: "  + contaTotal);
	}
}
