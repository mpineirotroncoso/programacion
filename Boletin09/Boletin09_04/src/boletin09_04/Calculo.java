
package boletin09_04;

/**
 *
 * @author dam1
 */
public class Calculo {
    /**
     * Se pasa un numero, se multiplica de 0 a 100 y se muestra en la consola
     * @param num numero que se pasa al bucle de multiplicar
     */
    public void Calculo(int num) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(num+"*"+i+"="+(num*i));
        }            
    }
}
