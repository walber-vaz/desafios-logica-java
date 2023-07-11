/**
 * Quarto desafio
 * 
 * A sua impressora foi infectada por um vírus e está imprimindo de forma
 * incorreta.
 * Depois de olhar para várias páginas impressas por um tempo, você percebe
 * que ele esta imprimindo cada linha de dentro para fora. Em outras palavras,
 * a metade esquerda de cada linha está sendo impressa a partir do meio da
 * página até a margem esquerda. Do mesmo modo, a metade direita de cada linha
 * está sendo impressa à partir da margem direita e prosseguindo em direção
 * ao centro da página.
 * 
 * Por exemplo a linha:
 * THIS LINE IS GIBBERISH
 * está sendo impressa como:
 * I ENIL SIHTHSIREBBIG S
 * 
 * Da mesma forma, a linha " MANGOS " está sendo impressa incorretamente como
 * "NAM SOG". Sua tarefa é desembaralhar (decifrar) a string a partir da forma
 * como ela foi impressa para a sua forma original. Você pode assumir que
 * cada linha conterá um número par de caracteres.
 * 
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha de entrada contém
 * um inteiro N que indica a quantidade de casos de teste. Seguem N linhas,
 * cada uma com uma frase com no mínimo 2 e no máximo 100 caracteres de
 * letras maiúsculas e espaços que deverá ser desembaralhada (decifrada)
 * à partir da forma impressa para a sua forma original, conforme
 * especificação acima.
 *
 * Saída
 * Para cada linha de entrada deverá ser impressa uma linha de saída com a
 * frase decifrada, conforme a especificação acima.
 * 
 * Exemplo de Entrada Exemplo de Saída
 * 5 THIS LINE IS GIBBERISH
 * I ENIL SIHTHSIREBBIG S LEVELKAYAK
 * LEVELKAYAK HAPPY HOLIDAYS
 * H YPPAHSYADILO MLKJIHGFEDCBAZYXWVUTSRQPON
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ FRENCH HENS TWO DOVES AND A PARTRIDGE
 * VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE
 */

public class App {
    public static void main(String[] args) throws Exception {
        String[] frases = {
                "I ENIL SIHTHSIREBBIG S",
                "LEVELKAYAK",
                "H YPPAHSYADILO",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE"
        };

        for (String frase : frases) {
            String fraseDecifrada = decifrar(frase);
            System.out.println(fraseDecifrada);
        }
    }

    public static String decifrar(String frase) {
        StringBuilder fraseDecifrada = new StringBuilder();
        int metade = frase.length() / 2;
        for (int i = metade - 1; i >= 0; i--) {
            fraseDecifrada.append(frase.charAt(i));
        }
        for (int i = frase.length() - 1; i >= metade; i--) {
            fraseDecifrada.append(frase.charAt(i));
        }
        return fraseDecifrada.toString();
    }
}
