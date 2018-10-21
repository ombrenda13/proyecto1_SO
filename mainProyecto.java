import java.io.*; 
import java.util.*;
public class mainProyecto {
		
 	public static void main(String args[]){
				Lista ram= new Lista();//creacion de ram
                                Lista2 cpu=new Lista2();
                                Lista3 listos=new Lista3();
			Scanner num= new Scanner(System.in);
                        Scanner qua=new Scanner(System.in);
                        int evaluar=0;
                        
  			
				System.out.println("ESCRIBE EL NUMERO DE PROCESOS QUE DESEAS SIMULAR:");
				int numeroprocesos= num.nextInt();
                               int memoria=100;
                                System.out.println("INGRESE EL QUANTUM  :");
                                int quantum=qua.nextInt();
                                Proceso pro[]=new Proceso[numeroprocesos];
				System.out.println("---------------INGRESE LOS DATOS DE CADA UNO DE SUS PROCESOS--------------");
				
						
                                   Capturar(numeroprocesos,pro);
					
//                                      
                                        
                                         Auxiliar aux[]= new Auxiliar[numeroprocesos];
                                            
            
            
         
                                              for (int i=0; i<numeroprocesos; i++){

                                                  for (int j=i+1; j<numeroprocesos;j++){

                                                             if(pro[i].getTiempolleg()>pro[j].getTiempolleg()){
                                                                    aux[0]=new Auxiliar();
                                                                    
                                                                    aux[0].setTiempolleg(pro[j].getTiempolleg());
                                                                     aux[0].setTamaño(pro[j].getTamaño());
                                                                     aux[0].setIdproceso(pro[j].getIdproceso());
                                                                        aux[0].setTiempoej(pro[j].getTiempoej());     
                                                                     
                                                                     
                                                                    pro[j].setTiempolleg(pro[i].getTiempolleg());
                                                                      pro[j].setTamaño(pro[i].getTamaño());
                                                                      pro[j].setIdproceso(pro[i].getIdproceso());
                                                                      pro[j].setTiempoej(pro[i].getTiempoej());
                                                                      
                                                                    pro[i].setTiempolleg(aux[0].getTiempolleg());
                                                                      pro[i].setTamaño(aux[0].getTamaño());
                                                                       pro[i].setIdproceso(aux[0].getIdproceso());
                                                                    pro[i].setTiempoej(aux[0].getTiempoej());
                                                             }

                                                 }

                                              }
                                              
                           for(int a=0; a<numeroprocesos;a++){
                               
                               listos.agregarFinal(pro[a].getIdproceso(), pro[a].getTiempolleg(),pro[a].getTamaño(),pro[a].getTiempoej());
                                System.out.println("PROCESOS LISTOS:");
                                listos.mostrarLista3();
                               System.out.println("\n");}
                             
                         while(Terminar(listos,ram,cpu)==false){   
                           memoria= listos.Recorrer(ram,memoria,listos,cpu,quantum);}
                            //listos.Recorrer(ram,memoria,listos,cpu,quantum);
                          //   ram.CorrerProceso(ram,cpu,memoria,quantum,listos);
 
         
                                    
}
        /////////////////METODO DE CAPTURA DE DATOS DE LOS PROCESOS///////////////////////////////////77
        public static void Capturar(int numeroprocesos,Proceso pro[]){
                        
                        Scanner leer= new Scanner(System.in);
                         //Proceso pro[] = new Proceso [numeroprocesos];
                       int contador2;
			int id_proceso;
                        String nombre;
                        int  tamaño;
                        int tiempo_ejecucion;
                        int prioridad;
                        int tiempo_es;
                        int tiempo_llegada;
        
        
                        for (contador2=0;contador2<numeroprocesos;contador2++){
                           
						pro[contador2] = new Proceso(); //crea los arreglos de objetos de dentro de una posicion
                                                System.out.println("id_proceso:"+(contador2+1));
//                                               
//                                                System.out.println("nombre del proceso:");
//                                                nombre=leer.nextLine();
//                                                
                                                System.out.println("tamaño del proceso[MB]:");
                                                tamaño=leer.nextInt();                 
//                                                
                                                System.out.println("tiempo de ejecucion[ms]:");
                                                tiempo_ejecucion=leer.nextInt();
//                                                
//                                                System.out.println("prioridad del proceso:");
//                                                prioridad=leer.nextInt();
//                                                
//                                                System.out.println("tiempo de espera[ms]:");
//                                                tiempo_es=leer.nextInt();
//                                                
                                                System.out.println("tiempo de llegada[ms]:");
                                                tiempo_llegada=leer.nextInt();
						
                                                
                                                pro[contador2].setIdproceso(contador2+1);
//                                                pro[contador2].setNombre(nombre);
//                                               
//                                                pro[contador2].setNombre(nombre);
                                                pro[contador2].setTamaño(tamaño);
//                                              
//                                                pro[contador2].setPrioridad(prioridad);
                                                pro[contador2].setTiempoej(tiempo_ejecucion);
//                                                pro[contador2].setTiempoesp(tiempo_es);
                                                pro[contador2].setTiempolleg(tiempo_llegada);
                                                        leer.nextLine();
                                        
                                        }
	       
        }
  
        
        
        
        
        
       public static boolean Terminar(Lista3 listos, Lista ram, Lista2 cpu){//funcion para terminar el while
  if(listos.estaVacia()==true && ram.estaVacia()==true && cpu.estaVacia()==true)
    return true;
  else
    return false;
  }
        
        
}