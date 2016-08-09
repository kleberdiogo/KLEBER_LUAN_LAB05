package hotel;


public class Animal {
  
   private String nome;
   private int idade;
   private String tipo;

   public Animal(String nome, String tipo, int idade){
       this.nome = nome;
       this.idade = idade;
       this.tipo = tipo;

   }
   public String getNome(){
       return this.nome;
   }
   public int getIdade(){
       return this.idade;
   }
   public String getTipo(){
       return this.tipo;
   }

   @Override
   public int hashCode() {
       final int prime = 31;
       int result = 1;
       result = prime * result + ((nome == null) ? 0 : nome.hashCode());
       result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
       return result;
   }
   @Override
   public boolean equals(Object obj) {
       if(obj instanceof Animal){
           Animal animal = (Animal) obj;
           if(this.getNome().equals(animal.getNome())){
               if(this.getTipo().equals(animal.getTipo())){
                   return true;
               }
           }
      
       }
       return false;
   }

}
