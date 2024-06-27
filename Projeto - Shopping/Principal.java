public class Principal{
    public static void main(String args[]){
        //Criação de instâncias globais
        System.out.println("Bem vindo! \n\n...Criação de shopping...\n");
        int n = 0;
        Produto produto = null;
        
        //Criação do Shopping
        String nomeShopping = Teclado.leString("Digite o nome do Shopping: ");  
        String ruaShopping = Teclado.leString("Digite o nome da rua: ");
        String cidadeShopping = Teclado.leString("Digite o nome da cidade: ");
        String estadoShopping = Teclado.leString("Digite o nome do estado: ");
        String paisShopping = Teclado.leString("Digite o nome do país: ");
        String cepShopping = Teclado.leString("Digite o cep: ");
        String numeroShopping = Teclado.leString("Digite o número do Shopping: ");
        String complementoShopping = Teclado.leString("Digite o complemento do Shopping: ");
        int tamanho = Teclado.leInt("Digite a quantidade de lojas do shopping");
            
        Endereco enderecoShopping = new Endereco (ruaShopping, cidadeShopping, estadoShopping, paisShopping, cepShopping, numeroShopping, complementoShopping);
        Shopping shopping = new Shopping (nomeShopping, enderecoShopping, tamanho);
        
        
        //Menu do usuário
        while (n != 4){
            n = Teclado.leInt("Menu:\n (1) Criar uma loja \n (2) Criar um produto \n (3) Ver a validade de um produto \n (4) Sair\n\n");
            
            if (n == 1){
                int tipo = Teclado.leInt("Qual tipo de loja: \n 1: Cosmético\n 2: Vestuário\n 3: Bijuteria\n 4: Alimentação\n 5: Informática\n");
                String nomeLoja = Teclado.leString("Digite o nome da loja: ");
                int quantidadeFuncionarios1 = Teclado.leInt("Digite a quantidade de funcionários: ");
                double salarioBase1 = Teclado.leDouble("Digite o salário base dos funcionários: ");
                
                //Instanciação dentro da classe Endereço (somente do número e do complemento da loja)
                String Numero1 = Teclado.leString("Digite o número da loja: ");
                String Complemento1 = Teclado.leString("Digite o complemento da loja: ");
                Endereco meuEndereco = new Endereco (ruaShopping, cidadeShopping, estadoShopping, paisShopping, cepShopping, Numero1, Complemento1);

                //Instanciação dentro da classe Data
                int DiaLoja = Teclado.leInt("Digite o dia de inauguração: ");
                int MesLoja = Teclado.leInt("Digite o mês de inauguração: ");
                int AnoLoja = Teclado.leInt("Digite o ano de inauguração: ");
                Data dataInauguracao = new Data (DiaLoja, MesLoja, AnoLoja);
                
                if (tipo == 1){
                    double taxaComercializacao = 200;
                    Loja loja = new Cosmetico (nomeLoja, quantidadeFuncionarios1, salarioBase1, meuEndereco, dataInauguracao, taxaComercializacao, tamanho);
                    shopping.insereLoja(loja);
                }
                
                if (tipo == 2){
                    boolean produtosImportados = false;
                    
                    String importados = Teclado.leString("Vende produtos importados ?\n1: Sim\n2: Não\nR: ");
                    while(importados == "1" || importados == "2"){
                        if(importados == "1"){
                            produtosImportados = true;
                        }
                        else if(importados == "2"){
                            produtosImportados = false;
                        }
                        else{
                            System.out.println("Valor inválido");
                        }
                    }
                    
                    Loja loja = new Vestuario (nomeLoja, quantidadeFuncionarios1, salarioBase1, meuEndereco, dataInauguracao, produtosImportados, tamanho);
                    shopping.insereLoja(loja);
                }
                
                if (tipo == 3){
                    double metaVendas = Teclado.leDouble("Digite a meta de vendas da loja: ");
                    Loja loja = new Bijuteria (nomeLoja, quantidadeFuncionarios1, salarioBase1, meuEndereco, dataInauguracao, metaVendas, tamanho);
                    shopping.insereLoja(loja);
                }
                
                if (tipo == 4){
                    int diaAlvara = Teclado.leInt("Digite a data de alvará de funcionamento:\n Dia: ");
                    int mesAlvara = Teclado.leInt("Mês: ");
                    int anoAlvara = Teclado.leInt("Ano: ");
                    Data dataAlvara = new Data(diaAlvara, mesAlvara, anoAlvara);
                    
                    Loja loja = new Alimentacao (nomeLoja, quantidadeFuncionarios1, salarioBase1, meuEndereco, dataInauguracao, dataAlvara, tamanho);
                    shopping.insereLoja(loja);
                }
                
                if (tipo == 5){
                    double segurosEletronicos = 200.99;
                    Loja loja = new Informatica (nomeLoja, quantidadeFuncionarios1, salarioBase1, meuEndereco, dataInauguracao, segurosEletronicos, tamanho);
                    shopping.insereLoja(loja);
                }
                
            }
            
            else if (n == 2){
                
                //Solicita ao usuário a loja na qual o mesmo quer adicionar um produto
                String nomeLoja = Teclado.leString("Qual a loja que você quer adicionar o produto ?");
                Loja lojaAdd = shopping.buscaLojaPorNome(nomeLoja);
                
                
                String nomeProd = Teclado.leString("Digite o nome do produto: ");
                double preco1 = Teclado.leDouble("Digite o valor do produto: ");
                
                //Criação do objeto validade dentro da classe Data
                int diaProd = Teclado.leInt("Digite o dia de validade: ");
                int mesProd = Teclado.leInt("Digite o mês de validade: ");
                int anoProd = Teclado.leInt("Digite o ano de validade: ");
                Data validade = new Data (diaProd, mesProd, anoProd);
                
                //Instanciação dentro da classe Produto
                Produto meuProduto = new Produto (nomeProd, preco1, validade);
                
                //Adiciona produto na loja escolhida
                lojaAdd.insereProduto(meuProduto);
                
                //Transferindo o valor da váriavel local para uma variável global
                produto = meuProduto;
            }
            
            else if (n == 3){
                String nomeLoja = Teclado.leString("Nome da loja: ");
                Loja loja = shopping.buscaLojaPorNome(nomeLoja);
                
                if(loja!= null){
                    String nomeProd = Teclado.leString("Nome do produto: ");
                    Produto prod = loja.buscaProdutoPorNome(nomeProd);
                    
                    if (prod != null){
                        Data dataAtual = new Data(20, 10, 2023);
                        if(prod.estaVencido(dataAtual)){
                            System.out.println("***PRODUTO VENCIDO***");
                        }
                        else {
                            System.out.println("***PRODUTO NÃO VENCIDO***");
                        }
                    }
                    
                    else {
                        System.out.println("***PRODUTO NÃO ENCONTRADO***");
                    }
                }
                else {
                    System.out.println("***LOJA NÃO ENCONTRADA***");
                }
            }
            
            else if (n == 4){
                System.out.println("Você saiu.");
            }
        }
        
        
    }
}