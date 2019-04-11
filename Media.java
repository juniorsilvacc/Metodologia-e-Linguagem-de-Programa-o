package  exer1 ;

import  java.util.Scanner ;

public  class  Media {
	public  static  void  main ( String [] args ) {
		Digitalização do scanner =  novo  Scanner ( System . In);
		int i, bail =  0 , exame =  0 , reprovados =  0 ;
		float nota1, nota2, somaDasMedias =  0 , media;
		para (i =  1 ; i <=  6 ; i ++ ) {
			Sistema . fora . println ( " informe como 2 notas do aluno "  + i +  " : " );
			nota1 = digitalizar . nextFloat ();
			nota2 = digitalizar . nextFloat ();
			media = (nota1 + nota2) /  2 ;
			somaDasMedias + = media;
			Sistema . fora . println ( " Média: "  + mídia);
			if (media <  3 ) {
				Sistema . fora . println ( " Reprovado " );
				reprovados ++ ;
			} else  if (media >  7 ) {
				Sistema . fora . println ( " Aprovado " );
				aprovado ++ ;
			} mais {
				Sistema . fora . println ( " Exame " );
				exame ++ ;
			}
		}
		Sistema . fora . println ( " Total de alunos aprovados: "  + aprovado);
		Sistema . fora . println ( " Total de alunos reprovados: "  + reprovados);
		Sistema . fora . println ( " Total de alunos do exame: "  + exame);
		Sistema . fora . println ( " Média total da turma: "  + (somaDasMedias /  6 ));
	}
}
