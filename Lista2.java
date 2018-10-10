/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brenda
 */
public class Lista2 {
   protected Nodo2 inicio2,fin2;
   
            public Lista2(){
            inicio2=null;
            fin2=null;  
            }
            
            public void agregar2(int id,int tiempo,int tamano,int tiempo_ejecucion){
		inicio2=new Nodo2(id,tiempo,tamano,inicio2,tiempo_ejecucion);
		if(inicio2==null){
			fin2=inicio2;
		}
	}
            
             
	public void mostrarLista2(){
	Nodo2 recorrer=inicio2;
	while(recorrer!=null){
		System.out.print("[ID PROCESO:"+recorrer.id+"\tTIEMPO DE LLEGADA:"+recorrer.tiempo+"[ms]\t"+"TAMAÑO:"+recorrer.tamaño+"[MB]"+"TIEMPO_EJECUCION"+recorrer.tiempo_ejecucion+"[ms]]--->\n");
		recorrer=recorrer.siguiente;
	}
        
        
        
        
        
        
	}

            
            
}
