package exercicio_valores_pares_vitoriafelix;

//Apresentar todos os valores pares na faixa de 1000 a 1500. (não tem entrada de dados).

public class Exercicio_valores_pares_VitoriaFelix 
{

    public static void main(String[] args)
    {
        
        for (int num = 1000; num <= 1500; num++)
        {
            if (num % 2 == 0)
            {
                System.out.println(num);
            }
        }
    }
    
}
