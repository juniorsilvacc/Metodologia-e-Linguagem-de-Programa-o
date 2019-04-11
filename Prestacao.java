package  exer1 ;

import  java.util.Scanner ;

 classe  pública Prestacao {
	public  static  void  main ( String [] args ) {
		float salario, emprestimo;
		Digitalização do scanner =  novo  Scanner ( System . In);
		Sistema . fora . println ( " Informe o salário e o valor da prestação a ser solicitada: " );
		salario = scan . nextFloat ();
		emprestimo = digitalizar . nextFloat ();
		if (emprestimo <= ( 0.3  * salario)) {
			Sistema . fora . println ( " empréstimo pode ser concedido " );
		} mais {
			Sistema . fora . println ( " não pode ser concedido " );
		}
	}
}
