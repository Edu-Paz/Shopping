public class Produto {
    private String nome;
    private double preco;
    private Data validade;
    
    public Produto(String nome, double preco, Data validade){
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }
    
    public Data getDataValidade(){
        return this.validade;
    }
    
    public void setDataValidade(Data validade){
        this.validade = validade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String toString() {
        return "Produto: \n" +
                "Nome: " + this.nome + "\n" +
                "Preço: " + this.preco +
                "Validade: " + this.validade;
    }
    
    public boolean estaVencido(Data dataAtual) {
    if (validade.getAno() < dataAtual.getAno()) {
        return true;
    } else if (validade.getAno() == dataAtual.getAno()) {
        if (validade.getMes() < dataAtual.getMes()) {
            return true;
        } else if (validade.getMes() == dataAtual.getMes()) {
            if (validade.getDia() < dataAtual.getDia()) {
                return true;
            }
        }
    }
    return false;
}
    
    
}