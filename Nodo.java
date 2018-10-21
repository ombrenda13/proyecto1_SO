public class Nodo {
    
    
    int id;
    int tamaño;
    int tiempo;
    int tiempo_ejecucion;
    int nuevo_tiempo;
    Nodo nodo;
    Nodo anterior;
    Nodo siguiente,siguiente2; //enlaza los nodos (simplemente enlazados)
    Nodo cabeza; //(apunta al final de la lista para ir agregando los nodos) 
    
   public Nodo(int id,int tiempo,int tamano, Nodo n, int tiempo_ejecucion){
		this.id= id;
		this.tiempo=tiempo;
		this.tamaño=tamano;
                this.tiempo_ejecucion=tiempo_ejecucion;
		this.siguiente=null;
                this.siguiente2=null;
                this.anterior=null;
		}
    

   
    
    
    
}