package  exer1 ;

import  java.util.Scanner ;

 classe  pública Pacientes {
	public  static  void  main ( String [] args ) {
		Digitalização do scanner =  novo  Scanner ( System . In);
		int a =  0 , idade, sexo, qntGeral =  0 , qntHomem =  0 , qntJovens =  0 , mulherGorda =  0 , maisVelho =  0 ,
				somaDasIdades =  0 ;
		float altura, peso, maisBaixa =  5 ;
		String nome, velho =  " nenhum " , baixa =  " nenhum " ;
		while (a ==  0 ) {
			Sistema . fora . println (
					" Sexo, mulher, peso e altura, como: " );
			nome = scan . Próximo();
			se (nome . equals ( " fim " )) {
				um ++ ;
				pausa ;
			}
			sexo = scan . nextInt ();
			idade = scan . nextInt ();
			if (sexo ==  1 ) {
				qntHomem ++ ;
				somaDasIdades + = idade;
			}
			if (idade > =  18  && idade <=  25 ) {
				qntJovens ++ ;
			}
			peso = scan . nextFloat ();
			altura = scan . nextFloat ();
			if (sexo ==  2  && altura > =  1,6  && altura <=  1,7  && peso >  70 ) {
				mulherGorda ++ ;
			}
			se (idade > maisVelho) {
				velho = nome;
				maisVelho = idade;
			}
			se (sexo ==  2  && altura < maisBaixa) {
				baixa = nome;
				maisBaixa = altura;
			}
			qntGeral ++ ;
		}
		Sistema . fora . println ( " RELATÓRIO: " );
		Sistema . fora . println ( " Quantidade de pacientes: "  + qntGeral);
		if (qntHomem ==  0 ) {
			Sistema . fora . println ( " Idade média dos homens: não há homens " );
		} mais {
			Sistema . fora . println ( " Idade média dos homens: "  + (somaDasIdades / qntHomem));
		}
		Sistema . fora . println ( " quantidade de mulheres entre 1.60 e 1.70 de altura e peso acima de 70: "  + mulherGorda);
		Sistema . fora . println ( " quantidade de pessoas entre 18 e 25 anos: "  + qntJovens);
		Sistema . fora . println ( " Nome do paciente mais velho: "  + velho);
		Sistema . fora . println ( " Nome da mulher mais baixa: "  + baixa);
	}
}
