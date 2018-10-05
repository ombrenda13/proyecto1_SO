
public class Nodo {
    
    
    int id_proceso;
    int tamaño;
    int tiempo_ejecucion;
    Nodo siguiente; //enlaza los nodos (simplemente enlazados)
    Nodo cabeza; //(apunta al final de la lista para ir agregando los nodos) 
    
   
    public  void setIdproceso(int id_proceso){
		this.id_proceso=id_proceso;
                this.siguiente=null;
    }
    public void enlazarSig(Nodo n){
    
        siguiente=n;
    
    }
    
    public Nodo  obtenerSig(){
        return siguiente;
        
    }
    
    
}
