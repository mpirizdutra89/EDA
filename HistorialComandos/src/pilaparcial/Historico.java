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
public class Historico {
    private Pila pila;
    private int MAX_COMANDOS = 100;

    public Historico() {
        this.pila = new Pila(MAX_COMANDOS);
        pila.push("control z");
        pila.push("cd ..");
        pila.push("ls -l");
        pila.push("rm -r *");
        pila.push("cd /");
        pila.push("netstat");
        
    }
    
    public void mostrarPosteriorYAnterior(String comando){
        Pila aux = new Pila(MAX_COMANDOS);
        String posterior = ""; 
        String anterior = "";
        while(!pila.pilaVacia() &&
               !comando.equals(pila.verElemento())
                ){
            aux.push(pila.pop());
        }
        if(pila.pilaVacia()){
            System.out.println("No se encontro el comando");
        }else{
            if(aux.pilaVacia()){
                System.out.println("No tiene comando posterior");
            }else{
                posterior = aux.pop();
            }
            pila.pop(); // ignorar el comando recibido por param
            if(!pila.pilaVacia()){
                anterior = pila.pop();
            }else{
                System.out.println("No tiene comando anterior");
            }
            if(!anterior.equals("")){
                System.out.println("Comando anterior: " + anterior);
            }
            if(!posterior.equals("")){
                System.out.println("Comando posterior: " + posterior);
               
            }
        }
    }
    
    
}
