public class Lista2 {
   protected Nodo inicio,fin;
   
            public Lista2(){
            inicio=null;
            fin=null;  
            }
            
            public void agregar2(int id,int tiempo,int tamano,int tiempo_ejecucion){
		inicio=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
		if(inicio==null){
			fin=inicio;
		}
	}
            
             
	public void mostrarLista2(){
	Nodo recorrer=inicio;
	while(recorrer!=null){
		System.out.print("[ID PROCESO:"+recorrer.id+"\tTIEMPO DE LLEGADA:"+recorrer.tiempo+"[ms]\t"+"TAMAÑO:"+recorrer.tamaño+"[MB]"+"TIEMPO_EJECUCION"+recorrer.tiempo_ejecucion+"[ms]]--->\n");
		recorrer=recorrer.siguiente;
	}
        
        
        
        
        
        
	}

            
            
}