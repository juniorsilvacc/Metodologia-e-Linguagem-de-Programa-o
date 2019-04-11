package  exer1 ;

import  java.util.Scanner ;

 classe  pública ReajusteDeSalario {
	public  static  void  main ( String [] args ) {
		Digitalização do scanner =  novo  Scanner ( System . In);
		sal flutuante ;
		String funcionario =  " a " ;
		while ( ! funcionario . equals ( " fim " )) {
			Sistema . fora . ( " Informe o seu nome " );
			funcionario = scan . Próximo();
			if (funcionario . equals ( " fim " )) {
				pausa ;
			}
			sal = scan . nextFloat ();
			se (sal <  500 ) {
				Sistema . fora . println ( " salário reajustado, novo salario: "  + (sal *  1.2 ));
			} mais {
				Sistema . fora . println ( " nao tem direito a reajuste no salário " );
			}
		}
	}
}
