/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brenda
 */
public class Nodo2 {
    
    int id;
    int tamaño;
    int tiempo;
    int tiempo_ejecucion;
    Nodo2 siguiente;
    
    public Nodo2 (int id,int tiempo,int tamano, Nodo2 n,int tiempo_ejecucion){
		this.id= id;
		this.tiempo=tiempo;
		this.tamaño=tamano;
                this.tiempo_ejecucion=tiempo_ejecucion;
		siguiente=n;
		}

  
}
