/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulardoble_201612517;

/**
 *
 * @author coac_96
 */
public class ListaCircularDobleEjemplo_201612517 {
    Nodo primero;
    Nodo ultimo;

    public ListaCircularDobleEjemplo_201612517() {
        primero = null;
        ultimo = null;
    }
    
    public void insertar(Object x){
        Nodo nuevo = new Nodo();
        nuevo.objeto = x;
        if(primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.atras = ultimo; 
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.atras = ultimo;
            ultimo = nuevo;
            primero.atras = ultimo;
        }
    }
    
    
}
