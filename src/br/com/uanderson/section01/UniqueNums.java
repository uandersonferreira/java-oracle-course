package br.com.uanderson.section01;;

import java.util.Scanner;
public class UniqueNums {
    public static void main(String[] args) {
        // Declara um array de inteiros com tamanho 5
        int[] numbers = new int[5];

        // Variável para armazenar o número inserido pelo usuário
        int num = 0;

        // Contador para o número de valores únicos inseridos
        int numValues = 0;

        // Variável para controlar se o número inserido é válido (ou seja, único)
        boolean valid = true;

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner in = new Scanner(System.in);

        // Loop principal que executa enquanto o array não estiver cheio
        while (numValues < numbers.length) {
            // Loop que executa até que um número válido seja inserido
            do {
                // Assume que o número é válido
                valid = true;
                System.out.println("Please enter a unique number: ");
                num = in.nextInt();// Lê o número inserido pelo usuário

                // Verifica se o número já foi inserido anteriormente
                for (int i = 0; i < numValues; i++) {
                    if (numbers[i] == num) {
                        // Se o número já existe, define valid como falso e exibe uma mensagem
                        System.out.println("Number already exists");
                        valid = false;
                        break;
                    }
                }
            } while (!valid); // Repete enquanto o número não for válido

            numbers[numValues] = num;// Adiciona o número válido ao array
            numValues++;// Incrementa o contador de valores únicos
        }//while loop
        in.close();// Fecha o Scanner (boa prática para liberar recursos)

        for (int number : numbers) {
            System.out.println(number);
        }
    }//main
}//class


/*
 * Claro! Aqui está a lista resumida com a sintaxe de cada uma das declarações de arrays em Java:

1. **Declaração com Tamanho Específico sem Inicialização**:
    ```java
    String[] myBouquet = new String[6];
    int[] numbers = new int[5];
    ```

2. **Declaração com Inicialização de Elementos**:
    ```java
    int[] numbers = {7, 24, 352, 2, 37};
    String[] flowers = {"Rose", "Lily", "Tulip", "Daisy"};
    ```

3. **Declaração e Inicialização com Tamanho Específico e Elementos**:
    ```java
    int[] numbers = new int[]{7, 24, 352, 2, 37};
    String[] flowers = new String[]{"Rose", "Lily", "Tulip", "Daisy"};
    ```

4. **Declaração de Arrays Multidimensionais**:
    - **Array Bidimensional (Matriz)**:
        ```java
        int[][] matrix = new int[3][3];
        int[][] predefinedMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        ```
    - **Array Tridimensional**:
        ```java
        int[][][] threeDArray = new int[3][3][3];
        int[][][] predefinedThreeDArray = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };
        ```

5. **Declaração e Inicialização em Linhas Separadas**:
    ```java
    int[] numbers;
    numbers = new int[]{7, 24, 352, 2, 37};
    ```
 */