public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco meuEndereco;
    private Data dataInauguracao;
    private Produto[] estoqueProdutos;
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco meuEndereco, Data dataInauguracao,int quantMax){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.meuEndereco = meuEndereco;
        this.dataInauguracao = dataInauguracao;
        this.estoqueProdutos = new Produto [quantMax];
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco meuEndereco, Data dataInauguracao, int quantMax){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.meuEndereco = meuEndereco;
        this.dataInauguracao = dataInauguracao;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto [quantMax];
    }

    public Loja(String nome, int quantidadeFuncionarios, int quantMax){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto [quantMax];
    }
    
    public Produto[] getEstoqueProdutos(){
        return this.estoqueProdutos; 
    }
    
    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }
    
    public Endereco getEndereco(){
        return this.meuEndereco;
    }
    
    public void setEndereco(Endereco meuEndereco){
        this.meuEndereco = meuEndereco;
    }
    
    public Data getDataFundacao(){
        return this.dataInauguracao;
    }
    
    public void setDataFundacao(Data fundacao){
        this.dataInauguracao = fundacao;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return this.quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return this.salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public String toString() {
        StringBuilder produtosStr = new StringBuilder();
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null) {
                produtosStr.append(estoqueProdutos[i].toString()).append("\n");
            }
        }
        return String.format("Loja:\nNome: %s\nQuantidade de Funcionários: %d\nSalário Base Funcionário: %.2f\nEndereço: %s\nData de Fundação: %s\nProdutos:\n%s",
            nome, quantidadeFuncionarios, salarioBaseFuncionario, meuEndereco, dataInauguracao, produtosStr.toString());
    }
    
    public double gastosComSalario(){
        if (getSalarioBaseFuncionario() != -1){
            return (this.quantidadeFuncionarios * this.salarioBaseFuncionario);
        }
        else{
            return -1;
        }
    }
    
    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';     
        }
        else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';
        }
        else if (quantidadeFuncionarios > 30){
            return 'G';
        }
        return '0';
    }
    
    public void imprimeProdutos(){
        for (int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null){
                System.out.println(estoqueProdutos[i]);
            }
        }
    }
    
    public boolean insereProduto(Produto produto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null ){
                estoqueProdutos[i] = produto;
                System.out.println("***PRODUTO ADICIONADO***");
                return true;
            }
        }
        System.out.println("***ESTOQUE CHEIO***");
        return false;
    }
    
    public boolean removeProduto(String prod){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(prod)){
                System.out.println("***PRODUTO REMOVIDO***");
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    //Método para buscar o produto pelo nome
    public Produto buscaProdutoPorNome(String nome) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nome)) {
                return estoqueProdutos[i];
            }
        }
        return null;
    }
    
    
    
}