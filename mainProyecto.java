
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
			

				System.out.println("ESCRIBE EL NUMERO DE PROCESOS QUE DESEAS SIMULAR:");
				int numeroprocesos= num.nextInt();
				System.out.println("---------------INGRESE LOS DATOS DE CADA UNO DE SUS PROCESOS--------------");

				
						 Proceso pro[] = new Proceso [numeroprocesos];
                                                 Nodo n[]=new Nodo [numeroprocesos];
                                               
                                                 
					for (contador2=0;contador2<numeroprocesos;contador2++){
						pro[contador2] = new Proceso(); //crea los arreglos de objetos de dentro de una posicion
                                                
//                                                n[contador2]= new Nodo();//creacion de nodo por cada proceso
                                                
						
                                                System.out.println("id_proceso:"+(contador2+1));
                                                pro[contador2].setIdproceso(contador2+1);
//                                                System.out.println("nombre del proceso:\n");
//                                                nombre=leer.nextLine();
//                                                
//                                                System.out.println("tamaño del proceso:\n");
//                                                tamaño=leer.nextInt();                 
//                                                
//                                                System.out.println("tiempo de ejecucion[ms]:\n");
//                                                tiempo_ejecucion=leer.nextInt();
//                                                
//                                                System.out.println("prioridad del proceso:\n");
//                                                prioridad=leer.nextInt();
//                                                
//                                                System.out.println("tiempo de espera[ms]:\n");
//                                                tiempo_es=leer.nextInt();
//                                                
                                                System.out.println("tiempo de llegada[ms]:\n");
                                                tiempo_llegada=leer.nextInt();
						
                                                
                                               
//                                                pro[contador2].setNombre(nombre);
//                                               
//                                                pro[contador2].setNombre(nombre);
//                                                pro[contador2].setTamaño(tamaño);
//                                              
//                                                pro[contador2].setPrioridad(prioridad);
//                                                pro[contador2].setTiempoej(tiempo_ejecucion);
//                                                pro[contador2].setTiempoesp(tiempo_es);
                                                
                                                        leer.nextLine();
                                        pro[contador2].setTiempolleg(tiempo_llegada);
                                        }
				
                                      	for(int i=0;i<numeroprocesos;i++)
                                                {
                                        
					System.out.println("ID_PROCESO:"+pro[i].getIdproceso());
//                                        System.out.println("NOMBRE:"+pro[i].getNombre());
//                                        System.out.println("TAMAÑO:"+pro[i].getTamaño());
//                                        System.out.println("PRIORIDAD:"+pro[i].getPrioridad());
//                                        System.out.println("TIEMPO DE EJECUCION:"+pro[i].getTiempoej()+"ms");
//                                        System.out.println("TIEMPO DE ESPERA:"+pro[i].getTiempoesp()+"ms");
                                        System.out.println("TIEMPO DE LLEGADA:"+pro[i].getTiempolleg()+"ms");
                                        System.out.println("-------------------------");
} 
                                        System.out.println("HOLA:"+pro[0].getTiempolleg());
                                      System.out.println("PRUEBAAAA:"+crearCola(pro)); //enlaza los nodos 
                                        
                                        
                                        
                                        
}

                                 
        
      public static Proceso crearCola(Proceso[] pro){
             Auxiliar aux[]= new Auxiliar[0];
            System.out.println("prueba:"+pro[0].getTiempolleg());
//          for (int i=0; i<numeroprocesos; i++){
//             
//              for (int j=1; j<numeroprocesos;j++){
//                         if(pro[i].getTiempolleg()<pro[j].getTiempolleg()){
//                                aux[0]=new Auxiliar();
//                                aux[0].setTiempolleg(pro[j].getTiempolleg());
//                                
//                                pro[j].setTiempolleg(pro[i].getTiempolleg());
//                                pro[j].setTiempolleg(aux[0].getTiempolleg());
//                               
//                         }
//              
//              
//             }
//        
//        
//          }
          
          
          
        
        return pro[0];
}
}
        
        
        
        


