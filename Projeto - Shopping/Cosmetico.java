public class Cosmetico extends Loja{
    private double taxaComercializacao;
    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco meuEndereco, Data fundacao, double taxaComercializacao, int quantMax){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, meuEndereco, fundacao, quantMax);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public String toString(){
        super.toString();
        return "\n" + "Taxa de comercialização: " + this.taxaComercializacao;
    }
    
    public double getTaxaComercializacao(){
        return this.taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    
    
}
