/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class AppCola {
    
    public static void main(String []args ) throws Exception{
    ColaLista cola = new ColaLista();
  
    cola.insertar(6);
    cola.insertar(1);
    cola.insertar(2);
    cola.insertar(3);
    cola.insertar(4);
    cola.quitar();
    cola.mostrarCola();
    System.out.println("El primero en llegar es :"+cola.frenteCola());
    cola.borrarCola();
    cola.mostrarCola();


    
    }
}
