public class Lista2 {
   protected Nodo inicio,fin;
   
            public Lista2(){
            inicio=null;
            fin=null;  
            }
            
             
         public boolean estaVacia(){
    
    if(inicio==null){
        return true;
    
    }else {return false;}
    
    }
        
         public void agregarFinal(Lista ram,int id,int tiempo,int tamano,int tiempo_ejecucion,int memoria,int quantum,Lista3 listos){  
             
		if(!estaVacia()){
                     System.out.println("soy la lista de cpu:");
                    fin.siguiente=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
                    
                 
                     for (int a=1; a<=quantum; a++){ 
                        
                        if(fin.siguiente.tiempo_ejecucion>0)
                        {
                        fin.siguiente.tiempo_ejecucion=fin.siguiente.tiempo_ejecucion-1;    
                        }
                    }
                     
                     if (fin.siguiente.tiempo_ejecucion==0){
                       
                        
                        }     else{
          
                               listos.agregarFinal(fin.siguiente.id,fin.siguiente.tiempo,fin.siguiente.tamaño,fin.siguiente.tiempo_ejecucion);}
                    
                   
                    fin=fin.siguiente;
                   
                }else{
                    
                           System.out.println("soy la lista de cpu: ");
                           inicio=fin=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion); 
                        
                           for (int b=1; b<=quantum; b++){ 
                        if(inicio.tiempo_ejecucion>0)
                        {
                        inicio.tiempo_ejecucion=inicio.tiempo_ejecucion-1;
                        }               
                    }
                           
                           
                           if (inicio.tiempo_ejecucion==0){
                      
                        }     else{
                               
                               listos.agregarFinal(inicio.id,inicio.tiempo, inicio.tamaño,inicio.tiempo_ejecucion);}
                         
                           
                    
                }
                
                
                
	}
            
         
         
         
//      public int Tiempo(int quantum,Nodo inicio,Lista3 listos ){
//           
//           for (int a=1; a<=quantum; a++){ 
//                        
//                        if(inicio.tiempo_ejecucion>0)
//                        {
//                        inicio.tiempo_ejecucion=inicio.tiempo_ejecucion-1;
//                          
//                        }
//                                      
//                    }
//          if (inicio.tiempo_ejecucion==0){
//                        listos.borrarProceso();
//                        
//                        }     else{
//          
//                               listos.agregarFinal(inicio.id,inicio.tiempo, inicio.tamaño,inicio.tiempo_ejecucion);
////                               System.out.println("AQUI ALV PTM ESTOY HASTA EL CULO:");
////                               listos.mostrarLista3();
//                               
//                               // System.out.println("LISTOSSSSSS:"+ listos.mostrarLista3());
//          
//          }
//      return inicio.tiempo_ejecucion;
//      }   
      
      
      
      
      
      
      
      
      
      public void borrarProceso() {
        //int tem=fin.tamaño;
        if (inicio == fin) {
            inicio = null;
            fin = null;
        } else {
            
            System.out.println("id:"+inicio.id);
            inicio = inicio.siguiente;

        }
    }
      
     
	public void mostrarLista2(){
	Nodo recorrer=inicio;
	
		System.out.print("\t[ID PROCESO:"+recorrer.id+"\tTIEMPO DE LLEGADA:"+recorrer.tiempo+"[ms]\t"+"TAMAÑO:"+recorrer.tamaño+"[MB]"+"TIEMPO_EJECUCION"+recorrer.tiempo_ejecucion+"[ms]]--->\n");
                
		recorrer=recorrer.siguiente;inicio=recorrer;
	
        
	

}}