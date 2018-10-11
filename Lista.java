
    public class Lista{
protected Nodo inicio,fin;

	public Lista(){
		inicio=null;
		fin=null;
                
	}

	public void agregar(int id,int tiempo,int tamano,int tiempo_ejecucion){
		inicio=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
		if(fin==null){
			fin=inicio;
		}
	}
        
      
        
        
	public void mostrarLista(){
	Nodo recorrer=inicio;
	while(recorrer!=null){
		System.out.print("[ID PROCESO:"+recorrer.id+"\tTIEMPO DE LLEGADA:"+recorrer.tiempo+"[ms]\t"+"TAMAÑO:"+recorrer.tamaño+"[MB]"+recorrer.tiempo_ejecucion+"[ms]]--->\n");
		recorrer=recorrer.siguiente;
	}
        
        
        
        
        
        
	}

        
        
        
        
        public void borrarProceso(){
	//int tem=fin.tamaño;
	if(inicio==fin){
		inicio=null;
		fin=null;
                
	}else{
		Nodo auxiliar=inicio;
		while(auxiliar.siguiente!=fin){
			auxiliar=auxiliar.siguiente;
                       
		}fin=auxiliar;
		fin.siguiente=null;
	}
	
	
	}

}