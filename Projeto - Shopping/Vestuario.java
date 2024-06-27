public class Vestuario extends Loja{
    private boolean produtosImportados;
    
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco meuEndereco, Data dataInauguracao, boolean produtosImportados, int quantMax){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, meuEndereco, dataInauguracao, quantMax);
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados(){
        return this.produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    public String toString (){
        super.toString();
        return "\n" + "Produto é importado ? \n" + this.produtosImportados;
    }
}
