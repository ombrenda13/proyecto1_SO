
public class Proceso{
	private int  id_proceso;
	private String nombre;
	private int  tamaño;
	private int tiempo_ejecucion;
	private int prioridad;
	private int tiempo_es;
	private int tiempo_llegada;
        int numeroprocesos;
        Proceso siguiente;
        
        
	public   int getIdproceso(){
		return id_proceso;
	
					}
	public  int setIdproceso(int id_proceso){
		this.id_proceso=id_proceso;
                return id_proceso;
						}

        public   String getNombre(){
		return nombre;
	
					}
	public  void setNombre(String nombre){
		this.nombre=nombre;
						}
        
         public int getTamaño(){
		return tamaño;
	
					}
	public  void setTamaño(int tamaño){
		this.tamaño=tamaño;
						}
        
         public int getTiempoej(){
		return tiempo_ejecucion;
	
					}
	public  void setTiempoej(int tiempo_ejecucion){
		this.tiempo_ejecucion=tiempo_ejecucion;
						}
        
         public int getPrioridad(){
		return tiempo_ejecucion;
	
					}
	public  void setPrioridad(int prioridad){
		this.prioridad=prioridad;
						}
       
        
         public int getTiempoesp(){
		return tiempo_ejecucion;
	
					}
	public  void setTiempoesp(int tiempo_es){
		this.tiempo_es=tiempo_es;
						}
        
         public int getTiempolleg(){
		return tiempo_llegada;
	
					}
	public  int setTiempolleg(int tiempo_llegada){
		this.tiempo_llegada=tiempo_llegada;
                return tiempo_llegada;
						}
        
        
        
        
        
        
         public void enlazarSig(Proceso n){
    
        siguiente=n;
    
    }
    
    public Proceso  obtenerSig(){
        return siguiente;
        
    }
        
        
        

			}
		