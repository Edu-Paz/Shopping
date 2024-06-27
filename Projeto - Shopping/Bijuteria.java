public class Bijuteria extends Loja{
    private double metaVendas;
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco meuEndereco, Data fundacao, double metaVendas, int quantMax){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, meuEndereco, fundacao, quantMax);
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas(){
        return this.metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    public String toString (){
        super.toString();
        return "\n" + "A meta mensal é de: " + this.metaVendas;
    }
}