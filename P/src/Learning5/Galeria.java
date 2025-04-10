package Learning5;

import java.util.ArrayList;
public class Galeria {

   private ArrayList<Obra> obras;   
   private int maxObras;
   private int lucroTotal;
   
   public Galeria(int maxObras) {
      this.obras = new ArrayList<>();
      this.maxObras = maxObras;
      this.lucroTotal = 0;

   }

   public void adicionarobras(Obra obra) {

      if (obras.size() < maxObras ) {
      obras.add(obra);
      System.out.println("Foi adicionado a obra: " + obra.detalhes());
      }
      else {
      System.out.println("Atingiste o máximo de obras");
      }
   }

   public void listarobras() {

      for(Obra i : obras ) {

         System.out.println(i.detalhes());
      }
   }

   public void venderobras(int id, int precoVenda) {
      Obra removerobra = null;
      for (Obra i:obras) {
      if (i.getId() == id) {

         removerobra = i;
         break;
         }
      }
      if (removerobra != null) {
         obras.remove(removerobra);
         int lucro = precoVenda - removerobra.getPreco(); 
         lucroTotal += lucro;
         System.out.println("A obra " + removerobra.getTitulo() + "foi vendida.");
      } else {
         System.out.println("Obra não encontrada.");
      }
      
   }

   public void lucro() {
      System.out.println("Lucro total: " + lucroTotal + "moedas");
    }
   
 


}
