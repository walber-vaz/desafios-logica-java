/**
 * Terceiro desafio
 * 
 * Dado um array de inteiros e um valor alvo, determine o número de pares
 * entre os elementos do array em que diferença seja igual ao valor alvo.
 * 
 * Exemplo:
 * 
 * K = 1
 * 
 * arr = [1, 2, 3, 4]
 * 
 * Existem 3 valores cuja diferença é igual ao valor alvo K: 2 - 1 = 1,
 * 3 - 2 = 1, 4 - 3 = 1.
 * 
 * Descrição do problema:
 * Os pares têm os seguintes parâmetros:
 * int k: Um inteiro, valor alvo.
 * int arr[n]: Um array de inteiros.
 * 
 * Retorno:
 * 
 * int: O número de pares que satisfazem o critério.
 * 
 * Formato da entrada:
 * 
 * Seu código deve conter duas entradas n e k, que representam
 * o tamanho do array e o valor alvo.
 * 
 * Exemplo de entrada:
 * 
 * STDIN Function
 * ----- --------
 * 5 2 arr[] tamanho n = 5, k = 2
 * 1 5 3 4 2 arr = [1, 5, 3, 4, 2]
 * 
 * Exemplo de saída:
 * 3
 */

public class App {
    public static void main(String[] args) throws Exception {
        // criar um array de inteiros com os valores do exemplo
        int[] arr = { 1, 5, 3, 4, 2 };
        // criar uma variável para armazenar o valor alvo
        int k = 2;

        // chamar a função pares e imprimir o resultado
        System.out.println(pares(arr, k));
    }

    /**
     * Calculates the number of pairs in an array that have a difference of k.
     *
     * @param arr the input array of integers
     * @param k   the difference value
     * @return the number of pairs with a difference of k
     */
    public static int pares(int[] arr, int k) {
        // criar uma variável para armazenar o número de pares
        int pares = 0;
        // percorrer o array de inteiros até o penúltimo elemento
        for (int i = 0; i < arr.length - 1; i++) {
            // criar uma variável para armazenar o valor do elemento atual
            int valor = arr[i];
            // percorrer o array de inteiros a partir do elemento seguinte ao atual
            for (int j = i + 1; j < arr.length; j++) {
                // criar uma variável para armazenar o valor do elemento seguinte
                int valor2 = arr[j];
                // verificar se a diferença entre os valores é igual ao valor alvo
                if (Math.abs(valor - valor2) == k) {
                    // incrementar o número de pares
                    pares++;
                }
            }
        }
        // retornar o número de pares
        return pares;
    }
}
