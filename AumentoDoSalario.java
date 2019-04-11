package  exer1 ;

import  java.util.Scanner ;

 classe  pública AumentoDoSalario {
	public  static  void  main ( String [] args ) {
		Digitalização do scanner =  novo  Scanner ( System . In);
		float salario, percentual, novosal;
		Sistema . fora . println ( " Informar o seu salário atual, e o percentual de aumento, respectivamente: " );
		salario = scan . nextFloat ();
		percentual = digitalizar . nextFloat ();
		novosal = salario * ((percentual +  100 ) /  100 );
		Sistema . fora . println ( " seu novo salário é: "  + novosal);
		Sistema . fora . println ( " foi aumentado "  + (novosal - salario) +  " do seu salário " );
	}
}
