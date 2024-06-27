public class Informatica extends Loja{
    private double segurosEletronicos;
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco meuEndereco, Data fundacao, double segurosEletronicos, int quantMax){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, meuEndereco, fundacao, quantMax);
        this.segurosEletronicos = segurosEletronicos;
    }
    
    public double getSeguroEletronicos(){
        return this.segurosEletronicos;
    }

    public void setSeguroEletronicos(double segurosEletronicos){
        this.segurosEletronicos = segurosEletronicos;
    }
    
    public String toString (){
        super.toString();
        return "\n" + "Seguro mensal: " + this.segurosEletronicos;
    }
}