
import java.io.*;
import java.util.*;
public class mainProyecto {
 	public static void main(String args[]){
			
			Scanner num= new Scanner(System.in);
                        Scanner qua=new Scanner(System.in);
  
				System.out.println("ESCRIBE EL NUMERO DE PROCESOS QUE DESEAS SIMULAR:");
				int numeroprocesos= num.nextInt();
                               
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
                                                                     
                                                                     
                                                                    pro[j].setTiempolleg(pro[i].getTiempolleg());
                                                                      pro[j].setTamaño(pro[i].getTamaño());
                                                                      pro[j].setIdproceso(pro[i].getIdproceso());
                                                                      
                                                                      
                                                                    pro[i].setTiempolleg(aux[0].getTiempolleg());
                                                                      pro[i].setTamaño(aux[0].getTamaño());
                                                                       pro[i].setIdproceso(aux[0].getIdproceso());
                                                                       
                                                                      
                                                             }


                                                 }


                                              }
        
          
          
          System.out.println("\nLISTA DE PROCESOS (ordenamiento por tiempo de llegada)");
          
          for(int a=0;a<numeroprocesos;a++){
          
              System.out.println("ID PROCESO:"+  pro[a].getIdproceso()+"\tTIEMPO DE LLEGADA:"+pro[a].getTiempolleg()+"[ms]\t"+"TAMAÑO:"+pro[a].getTamaño()+"[MB]");
          
          }
          
           Ram(pro,numeroprocesos);
                                        
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
                                                System.out.println("tamaño del proceso:");
                                                tamaño=leer.nextInt();                 
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
                                                pro[contador2].setTamaño(tamaño);
//                                              
//                                                pro[contador2].setPrioridad(prioridad);
//                                                pro[contador2].setTiempoej(tiempo_ejecucion);
//                                                pro[contador2].setTiempoesp(tiempo_es);
                                                pro[contador2].setTiempolleg(tiempo_llegada);
                                                        leer.nextLine();
                                        
                                        }
				
                      
        
        }
        
/////////////////////////////////////METODO PARA INGRESAR A LA LISTA RAM////////////////////////////////
        
                public static void Ram(Proceso pro[],int numeroprocesos){
                        int ram=1000;
                        Nodo nodo[]=new Nodo[numeroprocesos];
                        for(int a=0;a<numeroprocesos;a++){
                        
                               if (pro[a].getTamaño()<=ram && ram>0){
                                       
                                        ram=(ram-pro[a].getTamaño());
                                        
                                
                                }
                               
                               else {
                               
                                   System.out.println("\nNO HAY ESPACIO DISPONIBLE AUN,ESPERE A QUE SE LIBERE ESPACIO EN MEMORIA\n");
                               }
                        
                        }
                        
                
                }
        

        
}
        
       