/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezbarrera__20251013;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaEnlazada mi_lista = new ListaEnlazada();

        mi_lista.agregarAlInicio(10);
        mi_lista.agregarAlFinal(100);

        mi_lista.agregarEn(1, 50);
        mi_lista.mostrar();
        
        Nodo primer_nodo = new Nodo(50);
        Nodo segundo_nodo = new Nodo(80);
        Nodo tercer_nodo = new Nodo(90);
        // TODO code application logic here
        
        System.out.println(primer_nodo.data);
        System.out.println(segundo_nodo.data);
        System.out.println(tercer_nodo.data);
        
        primer_nodo.siguiente = segundo_nodo;
        segundo_nodo.siguiente = tercer_nodo;
        
        Nodo actual = primer_nodo;
        
        while(actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
        
    }
    
}
