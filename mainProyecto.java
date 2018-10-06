
import java.io.*;
import java.util.*;
public class mainProyecto {
 	public static void main(String args[]){
			int contador, contador2;
			Scanner num= new Scanner(System.in);
                        Scanner leer= new Scanner(System.in);
                       
			int id_proceso;
                        String nombre;
                        int  tamaño;
                        int tiempo_ejecucion;
                        int prioridad;
                        int tiempo_es;
                        int tiempo_llegada;
		
			boolean bool=false;
				System.out.println("ESCRIBE EL NUMERO DE PROCESOS QUE DESEAS SIMULAR:");
				int numeroprocesos= num.nextInt();
				System.out.println("---------------INGRESE LOS DATOS DE CADA UNO DE SUS PROCESOS--------------");
				
						 Proceso pro[] = new Proceso [numeroprocesos];
                                                 Nodo n[]=new Nodo [numeroprocesos];
					for (contador2=0;contador2<numeroprocesos;contador2++){
						pro[contador2] = new Proceso(); //crea los arreglos de objetos de dentro de una posicion
                                                
                                                n[contador2]= new Nodo();//creacion de nodo por cada proceso
                                                
						
                                                System.out.println("id_proceso:"+(contador2+1));
//                                               
//                                                System.out.println("nombre del proceso:");
//                                                nombre=leer.nextLine();
//                                                
//                                                System.out.println("tamaño del proceso:");
//                                                tamaño=leer.nextInt();                 
//                                                
//                                                System.out.println("tiempo de ejecucion[ms]:");
//                                                tiempo_ejecucion=leer.nextInt();
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
//                                                pro[contador2].setTamaño(tamaño);
//                                              
//                                                pro[contador2].setPrioridad(prioridad);
//                                                pro[contador2].setTiempoej(tiempo_ejecucion);
//                                                pro[contador2].setTiempoesp(tiempo_es);
                                                pro[contador2].setTiempolleg(tiempo_llegada);
                                                        leer.nextLine();
                                        
                                        }
				
//                                      
                                        
                                         Auxiliar aux[]= new Auxiliar[numeroprocesos];
            aux[0]=new Auxiliar();
            
            
            
          for (int i=0; i<numeroprocesos; i++){
            
              for (int j=i+1; j<numeroprocesos;j++){
                  
                         if(pro[i].getTiempolleg()>pro[j].getTiempolleg()){
                                
                                aux[0].setTiempolleg(pro[j].getTiempolleg());
                               
                                pro[j].setTiempolleg(pro[i].getTiempolleg());
                                System.out.println("iteracion i:"+i);
                                System.out.println("iteracion j:"+j);
                                System.out.println("aux:"+aux[0]);
                                pro[i].setTiempolleg(aux[0].getTiempolleg());
                               System.out.println(" entreeeee");
                              
                         }
              
              
             }
        
        
          }
                System.out.println("LISTA DE PROCESOS (ordenamiento por tiempo de llegada)\n");
          
          for(int a=0;a<numeroprocesos;a++){
          
              System.out.println("ID PROCESO:"+  pro[a].getIdproceso()+"\tTIEMPO DE LLEGADA:"+pro[a].getTiempolleg()+"[ms]");
          
          }
                                        
}
                                 
    
}
        
       