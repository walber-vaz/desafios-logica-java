import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
* Considerando a entrada de valores inteiros não negativos, 
* ordene estes valores segundo o seguinte critério:
*  Primeiro os Pares
*  Depois os Ímpares
* 
* Sendo que deverão ser apresentados os pares em 
* ordem crescente e depois os ímpares em ordem decrescente.
* 
* Entrada
* 
* A primeira linha de entrada contém um único inteiro positivo 
* N (1 < N <= 105) Este é o número de linhas de entrada que vem logo 
* a seguir. As próximas N linhas conterão, cada uma delas, 
* um valor inteiro não negativo.
* 
* Saída
* 
* Apresente todos os valores lidos na entrada segundo a ordem 
* apresentada acima. Cada número deve ser impresso em uma linha, 
* conforme exemplo abaixo.
* 
* Exemplo de Entrada 	Exemplo de Saída
* 10                   4
* 4                    32
* 32                   34
* 34                   98
* 543                  654
* 3456                 3456
* 654                  6789
* 567                  567
* 87                   543
* 6789                 87
* 98
*/

public class App {
    /**
     * Sorts the given array of integers into even and odd numbers,
     * and prints them in ascending order for even numbers and descending
     * order for odd numbers.
     *
     * @param args the command line arguments
     * @return void
     */
    public static void main(String[] args) {
        // cria um array de inteiros
        int[] numeros = { 10, 4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98 };
        // cria uma lista para armazenar os números pares
        List<Integer> pares = new ArrayList<>();
        // cria uma lista para armazenar os números ímpares
        List<Integer> impares = new ArrayList<>();

        for (int numero : numeros) {
            // e faça verificar se for numero não e negativo
            if (numero < 0) {
                System.out.println("O número não pode ser negativo");
                break;
            }

            // faz a verificação se o número é par ou ímpar
            if (numero % 2 == 0 && numero > 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }

        // ordena os números pares
        Collections.sort(pares);
        // ordena os números ímpares em ordem decrescente
        Collections.sort(impares, Collections.reverseOrder());

        // imprime os números pares usando o método reference
        pares.forEach(System.out::println);
        // imprime os números ímpares usando o método reference
        impares.forEach(System.out::println);
    }
}
