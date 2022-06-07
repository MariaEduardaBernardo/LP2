/*
Ana Luisa Oliveira da Silva - SP3045218
Carlos Eduardo dos Santos Ferreira - SP3056325
Maria Eduarda Bernardo de Paula - SP3045099
Nickolas Tavares Garcia - SP3045081 
Vitor Luís Barretto Pereira - SP1650122
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
  
      System.out.println("\n**** Lista 01 ****\n");
      
      Lista lista = new Lista();
      lista.adicionar("Verde");
      lista.adicionar("Amarelo");
      lista.adicionar("Azul");
      lista.adicionar("Vermelho");
      
      System.out.println("\nElementos da lista: " + lista.toString());
      System.out.println("\nPosição do elemento 'Amarelo': " + lista.encontrar("Amarelo"));
      
      System.out.println("\nElemento da posição 3: " + lista.encontrar(3));
      
      
      System.out.println("\n**** Lista 02 **** \n");
      
      Lista l1 = new Lista();
      l1.adicionar("Abacaxi");
      l1.adicionar("Banana");
      l1.adicionar("Carambola");
      l1.adicionar("Damasco");
      
      System.out.println("Elementos da lista: " +l1.toString());
      
      l1.remover(3);
      l1.remover("Carambola");
  
      System.out.println("\nElementos da lista após remoção:");
      Collection<String> collection = l1.getCollection();
      for(String elemento : collection) {
      System.out.println(elemento);
      }
      
      System.out.println("\n**** Lista 03 ****\n");
      
      Lista l2 = new Lista();
      l2.adicionar("Lontra");
      l2.adicionar("Capivara");
      l2.adicionar("Pato");
      l2.adicionar("Sapo");
      l2.adicionar("Porco");
      
      l2.remover("Porco");
      
      Iterator<String> iterator = l2.getIterator();
      
      while(iterator.hasNext()) {
      System.out.println(iterator.next());
      }
      
      Map<Integer, String> mapaLista2 = l2.getMapOrdenado();
      
      System.out.println("\nElementos da lista após ordenação: \n");
      for (int i = 1; i <= mapaLista2.size(); i++) {
      System.out.println(mapaLista2.get(i));
    }
  }  	
}
