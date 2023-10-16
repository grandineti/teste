/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
* Classe com os métodos de teste
*/
public class TesteCalculadora {
  
    @Test
    public void testeSoma1() {
      Calculadora calc = new Calculadora();
      int resultadoEsperado = 5;
      int resultadoRetornado = calc.soma(2,3);
      assertEquals (resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testeSoma2() {
      Calculadora calc = new Calculadora();
      assertEquals (10, calc.soma(4,6));
    }

}