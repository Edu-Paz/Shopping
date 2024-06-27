public class Shopping{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping(String nome, Endereco endereco, int quantMax){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantMax];
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public Endereco getEndereco(){
        return this.endereco;
    }
    
    public Loja[] getLojas(){
        return this.lojas;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEndereco (Endereco endereco){
        this.endereco = endereco;
    }
    
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }
    
    public boolean insereLoja (Loja loja){
        for (int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                System.out.println("***LOJA ADICIONADA***\n\n");
                return true;
            }
        }
        System.out.println("***SHOPPING CHEIO***");
        return false;
    }

    //Classe criada para procurar uma loja pelo nome
    public Loja buscaLojaPorNome(String nome){
        for(int i = 0; i < lojas.length; i++){
            if (lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)) {
                return lojas[i];
            }
        }
        return null;
    }
    
    public boolean removeLoja(String nome){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equalsIgnoreCase(nome)){
                lojas[i] = null;
                System.out.println("***LOJA REMOVIDA***\n\n");
                return true;
                
            }
        }
        return false;
    }
    
    public Informatica lojaSeguroMaisCaro(){
        Informatica maisCaro = null;
        double maiorSeguro = -1;
        
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] instanceof Informatica){
                Informatica lojaInformatica = (Informatica) lojas[i];
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    maisCaro = lojaInformatica;
                }
            }
        }
        return maisCaro;
    }
    
    public int quantidadeLojasPorTipo(String nome){
        int Cosm = 0;
        int Vest = 0;
        int Biju= 0;
        int Alim = 0;
        int Info = 0;
        
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] instanceof Cosmetico){
                Cosm++;
            }
            if(lojas[i] instanceof Vestuario){
                Vest++;
            }
            if(lojas[i] instanceof Bijuteria){
                Biju++;
            }
            if(lojas[i] instanceof Alimentacao){
                Alim++;
            }
            if(lojas[i] instanceof Informatica){
                Info++;
            }
        }
        
        if (nome.equalsIgnoreCase("cosmético")){
            return Cosm;
        }
        
        else if (nome.equalsIgnoreCase("vestuário")){
            return Vest;
        }
        
        else if (nome.equalsIgnoreCase("Bijuteria")){
            return Biju;
        }
        
        else if (nome.equalsIgnoreCase("alimentação")){
            return Alim;
        }
        
        else if (nome.equalsIgnoreCase("informática")){
            return Info;
        }
        
        else{
            return -1;
        }
    }
    
    public String toString() {
        StringBuilder lojasStr = new StringBuilder();
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null) {
                lojasStr.append(lojas.toString()).append("\n");
            }
        }
        return String.format("Shopping:\nNome: %s\nEndereço: %s\nLojas:\n%s", nome, endereco, lojasStr.toString());
    }
}