
public class Nodo {
    
    
    int id_proceso;
    int tamaño;
    int tiempo_ejecucion;
    Nodo anterior;
    Nodo siguiente; //enlaza los nodos (simplemente enlazados)
    Nodo cabeza; //(apunta al final de la lista para ir agregando los nodos) 
    
   
    public  void setIdproceso(int id_proceso){
		this.id_proceso=id_proceso;
                this.siguiente=null; //cuando regrese nulo es que no hay otro nodo enlazado 
    }
    public void enlazarSig(Nodo n){
    
        siguiente=n;
    
    }
    public void enlazarAnt(Nodo n){
    
    anterior=n;
    
    }
    
    public Nodo  obtenerSig(){
        return siguiente;
        
    }
    
    public Nodo obtenerAnt(){
    
    return anterior;
    
    }
    
    
}
