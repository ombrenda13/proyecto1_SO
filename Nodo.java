public class Nodo {
    
    
    int id;
    int tamaño;
    int tiempo;
    int tiempo_ejecucion;
    int nuevo_tiempo;
    Nodo nodo;
    Nodo anterior;
    Nodo siguiente; //enlaza los nodos (simplemente enlazados)
    Nodo cabeza; //(apunta al final de la lista para ir agregando los nodos) 
    
   public Nodo(int id,int tiempo,int tamano, Nodo n, int tiempo_ejecucion){
		this.id= id;
		this.tiempo=tiempo;
		this.tamaño=tamano;
                this.tiempo_ejecucion=tiempo_ejecucion;
		siguiente=n;
		}
    
//   public  void setIdproceso(int id_proceso){
//		this.id_proceso=id_proceso;
//                this.siguiente=null; //cuando regrese nulo es que no hay otro nodo enlazado 
//    }
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
    
    
    
}}