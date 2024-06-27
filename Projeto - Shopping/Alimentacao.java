public class Alimentacao extends Loja{
    private Data dataAlvara;
    
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco meuEndereco, Data fundacao, Data dataAlvara, int quantMax){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, meuEndereco, fundacao, quantMax);
        this.dataAlvara = dataAlvara;
    }
    
    public String getDataAlvara(){
        return dataAlvara.toString();
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
    public String toString (){
        super.toString();
        return "\n" + "Dia de alvará: " + this.dataAlvara;
    }
}