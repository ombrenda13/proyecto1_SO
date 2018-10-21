/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brenda
 */
public class Lista3 {

    protected Nodo inicio2, fin2;

    public Lista3() {
        inicio2 = null;
        fin2 = null;

    }

    public boolean estaVacia() {

        if (inicio2 == null) {
            return true;

        } else {
            return false;
        }

    }

    public void agregarFinal(int id, int tiempo, int tamano, int tiempo_ejecucion) {
        if (!estaVacia()) {

            fin2.siguiente2 = new Nodo(id, tiempo, tamano, inicio2, tiempo_ejecucion);
            fin2 = fin2.siguiente2;

        } else {
            inicio2 = fin2 = new Nodo(id, tiempo, tamano, inicio2, tiempo_ejecucion);

        }

    }

    public Nodo mostrarLista3() {
        Nodo recorrer = inicio2;

        while (recorrer != null) {

            System.out.print("\t[ID PROCESO:" + recorrer.id + "\tTIEMPO DE LLEGADA:" + recorrer.tiempo + "[ms]\t" + "TAMAÑO:" + recorrer.tamaño + "[MB]" + recorrer.tiempo_ejecucion + "[ms]]--->\n");

//             
            recorrer = recorrer.siguiente2;

        }
        return recorrer;
    }

    public void Recorrer(Lista ram, int memoria, Lista3 listos, Lista2 cpu, int quantum) {

        Nodo recorrer = inicio2;

        while (recorrer != null && memoria >= recorrer.tamaño) {
                memoria=memoria-recorrer.tamaño;
          
                System.out.println("soy la lista de ram y me queda " + memoria +":");
               
                ram.agregarFinal(recorrer.id, recorrer.tiempo, recorrer.tamaño, recorrer.tiempo_ejecucion);
                ram.mostrarLista(ram,cpu,memoria,quantum);
                System.out.println("soy la nueva lista de listos:");
                listos.borrarProceso();
                listos.mostrarLista3(); 
               
               
              
              
                recorrer = recorrer.siguiente2;
            
        }
        
     
//lama al final a correr proceso
    }


    
    
    
    public void borrarProceso() {
        //int tem=fin.tamaño;
        if (inicio2 == fin2) {
            inicio2 = null;
            fin2 = null;
        } else {
            inicio2 = inicio2.siguiente2;

        }
    }
}
