package  exer1 ;

import  java.util.Scanner ;

public  class  Par {
	public  static  void  main ( String [] args ) {
		Sistema . fora . println ( " informe 10 números inteiros na tela; será informado se são par ou ímpar " );
		Digitalização do scanner =  novo  Scanner ( System . In);
		int i, num;
		para (i =  0 ; i <  10 ; i ++ ) {
			num = scan . nextInt ();
			if (num %  2  ==  0 ) {
				Sistema . fora . println ( " Par " );
			} mais {
				Sistema . fora . println ( " Ímpar " );
			}
		}
	}
}
