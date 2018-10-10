/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brenda
 */

    public class Lista{
protected Nodo inicio,fin;

	public Lista(){
		inicio=null;
		fin=null;
                
	}

	public void agregar(int id,int tiempo,int tamano,int tiempo_ejecucion){
		inicio=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
		if(inicio==null){
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


}

