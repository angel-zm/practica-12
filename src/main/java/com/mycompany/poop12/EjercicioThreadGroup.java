/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop12;

/**
 *
 * @author dany_
 */
public class EjercicioThreadGroup extends Thread {

    public EjercicioThreadGroup(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
         for (int i = 0; i< 10; i++) {
   System.out.println(getName ());
         
    }
   } 
    
    public static void listarHilos(ThreadGroup grupoActual){
   int numHilos;
   Thread[]listaHilos;
   numHilos = grupoActual.activeCount();
   listaHilos = new Thread [numHilos];
   grupoActual.enumerate(listaHilos);
   System.out.println("\n Nunera de Hilos activos = "+numHilos+"\n");
   for (int i = 0; i< numHilos; i++) {
       System.out.println("Hilo activo "+i+" "+listaHilos[i].getName());
       
     }
  }
}
