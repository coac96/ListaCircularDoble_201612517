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
    int tamaño;
    Nodo primero;
    Nodo ultimo;

    public ListaCircularDobleEjemplo_201612517() {
        primero = null;
        ultimo = null;
    }
    
    public void insertar(Persona_201612517 x){
        Nodo nuevo = new Nodo();
        Nodo aux = new Nodo();
        aux = primero;
        Boolean verificador = false;
        nuevo.objeto = x;
        if(primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.atras = ultimo;
            ultimo = nuevo;
        }else{
            do{
                if(x.id == aux.objeto.id){
                    System.out.println("ID EXISTE");
                    verificador = true;
                    break;
                }
                aux = aux.siguiente;
            }while(aux != primero);
            if(!verificador){
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.atras = ultimo;
            ultimo = nuevo;
            primero.atras = ultimo;
            }
        }
    }
    
    public void modificar(int id, String modificacion){
        Nodo buscador;
        buscador = primero;
        if(primero != null){
            do{
                if(buscador.objeto.id == id){
                    buscador.objeto.nombre = modificacion;
                }
                buscador = buscador.siguiente;
            }while(buscador != primero);
        }
        System.out.println("-----");
        mostrar();
    }
    
    
    public void eliminar(int id){
       Nodo buscador;
        buscador = primero;
        if(primero != null){
            do{
                if(buscador.objeto.id == id){
                    buscador.siguiente = buscador.atras;
                    
                }
            }while(buscador != primero);
        }
        
    }
    
    
    
    public void mostrar(){
        Nodo aux = new Nodo(); 
        aux = primero;
        do{
            System.out.println(aux.objeto.nombre);
            aux = aux.siguiente;
            tamaño++;
        }while(aux != primero);
    }
    
    
    
    
    public int Tamaño(){
        return tamaño;
    }
    
}