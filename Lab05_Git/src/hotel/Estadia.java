package hotel;

public class Estadia {
	 
    private Animal animal;
    private double valor;
    private int dias;   
 
    public Estadia(String nome, String tipo, int idade, int dias, double valor){
        this.animal = new Animal(nome, tipo, idade);
        this.valor = valor;
        this.dias = dias;
    }
 
    public int getDias(){
        return this.dias;
    }
   
    public double getValor(){
        return this.valor;
    }
   
    public String getNome(){
        return animal.getNome();
    }
   
    public String getTipo(){
        return animal.getTipo();
    }
   
    public int getIdade(){
        return animal.getIdade();
    }
   
    public String toString(){
        String imprime = null;
        imprime += String.format("%s, %s, %d dias com o preço do  R$ %.2f",animal.getNome(),animal.getTipo(),this.dias, this.valor);
        return imprime;
    }
 
}
