package aula07.Ex3;

import java.util.ArrayList;
public class Galeria {

   private ArrayList<Obra> obras;   
   private int maxObras;
   
   public Galeria(int maxObras) {
      this.obras = new ArrayList<>();
      this.maxObras = maxObras;

   }

   public void adicionarobras(Obra obra) {

      if (obras.size() < 100 ) {
      obras.add(obra);
      System.out.println("Foi adicionado a obra: " + obra);
      }
      else {
      System.out.println("Atingiste o máximo de obras");
      }
   }

   public void listarobras(Obra obra) {

      for(Obra i : obras ) {

         System.out.println("Obra: " + obra);
      }
   }
   
      
   //construtor da galeria

   //metodos de adicionar, vender,...


}
