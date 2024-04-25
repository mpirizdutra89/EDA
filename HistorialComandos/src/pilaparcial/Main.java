/*
Crea un programa que simule el historial de comandos en un sistema 
operativo utilizando una pila. Cada vez que el usuario ingrese un 
comando, agrega el comando a la pila. El algoritmo debe permitir 
encontrar cual fue el comando anterior y posterior a uno dado, sin 
violar las restricciones de la pila, puede usar solo una pila auxiliar
 */
package pilaparcial;

/**
 *
 * @author EDA Comision 2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Historico prueba = new Historico();
        String td = "control z";
        System.out.println("Datos de prueba: " + td);
        prueba.mostrarPosteriorYAnterior(td);
    }
    
}
