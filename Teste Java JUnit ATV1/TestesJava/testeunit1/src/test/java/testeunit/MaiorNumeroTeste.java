package testeunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MaiorNumeroTeste {

    MaiorNumero maiorNumero = new MaiorNumero();

    @Test
    @DisplayName("Testar valores")
        void deveriaSerMaior(){

            // Números Positivos
            int resultado = maiorNumero.verificaMaior(3, 10);
            assertEquals(10, resultado);
            System.out.println("O maior número é: " + resultado);

            // Números Negativos 
            resultado = maiorNumero.verificaMaior(-5, -4);
            assertEquals(-4, resultado);
            System.out.println("O maior número é: " + resultado);

            // Testar um número positivo e um negativo
            resultado = maiorNumero.verificaMaior(8, -1);
            assertEquals(8, resultado);
            System.out.println("O maior número é: " + resultado);

            // Testar números iguais
            resultado = maiorNumero.verificaMaior(15, 15);
            assertEquals(15, resultado);
            System.out.println("O maior número é: " + resultado);

            // Testar zero e positivo
            resultado = maiorNumero.verificaMaior(0, 9);
            assertEquals(9, resultado);
            System.out.println("O maior número é: " + resultado);

            // Testar zero e negativo
            resultado = maiorNumero.verificaMaior(0, -9);
            assertEquals(0, resultado);
            System.out.println("O maior número é: " + resultado);

            // Testar valore grandes
            resultado = maiorNumero.verificaMaior(1000000, 999999);
            assertEquals(1000000, resultado);
            System.out.println("O maior número é: " + resultado);

        }



}
