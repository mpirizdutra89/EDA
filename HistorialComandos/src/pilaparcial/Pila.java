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
public class Pila {
    
    private String[] pila;
    private int tamanio;
    private int tope;

    public Pila(int tamanio) {
        pila = new String[tamanio];
        this.tamanio = tamanio;
        tope = -1;
    }
    
    public boolean pilaLlena(){
       return tope == tamanio-1;
    }
    
    public boolean pilaVacia(){
        return tope == -1;
    }
    
    public void push(String comando){
        if(pilaLlena()){
            System.out.println("La pila esta llena.");
        }else{
            pila[++tope]=comando;
        }
    }
    public String pop(){
        if(pilaVacia()){
            System.out.println("La pila esta vacia");
        }else{
            String aux = pila[tope];
            tope--;
            return aux;
        }
        return "";
    }
    public String verElemento(){
        if(!pilaVacia()){
            return pila[tope];
        }
        return "";
    }

}
