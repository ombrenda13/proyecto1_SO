

    public class Lista{
protected Nodo inicio,fin;

	public Lista(){
		inicio=null;
		fin=null;
                
	}
     
         public boolean estaVacia(){
    
    if(inicio==null){
        return true;
    
    }else {return false;}
    
    }
        
         public void agregarFinal(int id,int tiempo,int tamano,int tiempo_ejecucion){
		if(!estaVacia()){
     
                    fin.siguiente=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
                    fin=fin.siguiente;
                
                }else{
                            inicio=fin=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
                
                }
                
	}
    
         public void agregarInicio(int id,int tiempo,int tamano,int tiempo_ejecucion){
             inicio=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
             if(fin==null){
             
             fin.anterior=inicio;
             
             }
         }
         
	public void mostrarLista(Lista ram, Lista2 cpu, int memoria,int quantum){
	Nodo recorrer=inicio;
	while(recorrer!=null){
		System.out.print("\t[ID PROCESO:"+recorrer.id+"\tTIEMPO DE LLEGADA:"+recorrer.tiempo+"[ms]\t"+"TAMAÑO:"+recorrer.tamaño+"[MB]"+recorrer.tiempo_ejecucion+"[ms]]--->\n");
		      
                recorrer=recorrer.siguiente;
                
	}
        
            
        
	}
        
        
        
        
        
        
        
        public void CorrerProceso(Lista ram, Lista2 cpu, int memoria,int quantum,Lista3 listos){
        Nodo recorre_ram= inicio;
        
                cpu.agregarFinal(ram, recorre_ram.id, recorre_ram.tiempo, recorre_ram.tamaño, recorre_ram.tiempo_ejecucion,memoria,quantum,listos);
                cpu.mostrarLista2();
                ram.borrarProceso();
                
                listos.Recorrer(ram, memoria, listos, cpu, quantum); 
              
              
        }
        
        public int SumaMemoria(Lista ram, int memoria,int tamaño){
        //este es un metodo que permite ir sumando la memoria después de que un proceso fue borrado
              memoria=memoria+tamaño;
             
        return memoria;
        }
        
        
        
        

       public Nodo borrarProceso(){
           Nodo aux = inicio;
	//int tem=fin.tamaño;
	if(inicio==fin){
		inicio=null;
		fin=null;
	}else{
		inicio=inicio.siguiente;
                
	}
       return aux;
       }
        
}