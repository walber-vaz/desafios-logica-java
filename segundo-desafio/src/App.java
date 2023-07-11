import java.util.Locale;

/**
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor
 * representa um valor monetário. A seguir, calcule o menor número de notas e
 * moedas possíveis no qual o valor pode ser decomposto. As notas consideradas
 * são de 100, 50, 20, 10, 5, 2. As moedas possíveis
 * são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
 * A seguir mostre a relação de notas necessárias.
 * 
 * Entrada
 * 
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤
 * 1000000.00).
 * 
 * Saída
 * 
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor
 * 
 * Exemplo de Entrada Exemplo de Saída
 * 576.73 NOTAS:
 * 5 nota(s) de R$ 100.00
 * 1 nota(s) de R$ 50.00
 * 1 nota(s) de R$ 20.00
 * 0 nota(s) de R$ 10.00
 * 1 nota(s) de R$ 5.00
 * 0 nota(s) de R$ 2.00
 * MOEDAS:
 * 1 moeda(s) de R$ 1.00
 * 1 moeda(s) de R$ 0.50
 * 0 moeda(s) de R$ 0.25
 * 2 moeda(s) de R$ 0.10
 * 0 moeda(s) de R$ 0.05
 * 3 moeda(s) de R$ 0.01
 */

public class App {
    /**
     * A description of the entire Java function.
     *
     * @param args an array of strings representing command line arguments
     * @throws Exception if an error occurs
     */
    public static void main(String[] args) throws Exception {
        // seta o locale para usar o padrão americano
        Locale.setDefault(Locale.US);
        // cria um array de inteiros para armazenar as notas
        int[] notas = { 100, 50, 20, 10, 5, 2 };
        // cria um array de doubles para armazenar as moedas
        double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };

        // cria uma variável para armazenar o valor
        double valor = 576.73;

        System.out.println("NOTAS:");
        // percorre o array de notas
        // e armazena o valor atual na variável nota
        for (int nota : notas) {
            // faz a divisão inteira do valor pela nota atual
            // e armazena o resultado na variável quantidadeNotas
            // o cast (int) é necessário para converter o resultado
            // da divisão para inteiro
            int quantidadeNotas = (int) (valor / nota);
            System.out.printf("%d nota(s) de R$ %.2f\n",
                    quantidadeNotas,
                    (double) nota);
            // subtrai o valor total pelo valor da nota atual
            valor -= quantidadeNotas * nota;
        }

        System.out.println("MOEDAS:");
        // percorre o array de moedas
        // e armazena o valor atual na variável moeda
        for (double moeda : moedas) {
            // faz a divisão inteira do valor pela moeda atual
            // e armazena o resultado na variável quantidadeMoedas
            // o cast (int) é necessário para converter o resultado
            // da divisão para inteiro
            int quantidadeMoedas = (int) (valor / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f\n",
                    quantidadeMoedas,
                    moeda);
            // subtrai o valor total pelo valor da moeda atual
            valor -= quantidadeMoedas * moeda;
        }
    }
}
