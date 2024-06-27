public class Data{
    private int dia;
    private int mes;
    private int ano;
    
    public Data (int dia, int mes, int ano){
        if (ano % 4 == 0 && ano >= 0){ //Se o ano for bissexto
            if (mes == 2){ //Registra somente de dia 1 a dia 29 de fev
                if (dia >=1 && dia <=29){
                    this.ano = ano;
                    this.mes = mes;
                    this.dia = dia;
                }
                else { //Se não for um dia válido, altera a data para 1/1/2000
                    this.ano = 2000;
                    this.dia = 1;
                    this.mes = 1;
                    System.out.println("Data inválida. \nData alterada para 1/1/2000");
                }
            }
            else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){ //Registra os meses que possuem 31 dias
                if (dia >= 1 && dia <= 31){ //Registra de dia 1 a dia 31
                    this.ano = ano;
                    this.dia = dia;
                    this.mes = mes;
                }
                else { //Se não for um dia válido, altera a data para 1/1/2000
                    this.ano = 2000;
                    this.dia = 1;
                    this.mes = 1;
                    System.out.println("Data inválida. \nData alterada para 1/1/2000");
                }            
            }
            else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) { //Registra meses de 30 dias
                if (dia >= 1 && dia <= 30){//Registra de dia 1 a dia 30
                    this.ano = ano;
                    this.dia = dia;
                    this.mes = mes;
                }
                else { //Se não for um dia válido, altera a data para 1/1/2000
                    this.ano = 2000;
                    this.dia = 1;
                    this.mes = 1;
                    System.out.println("Data inválida. \nData alterada para 1/1/2000");
                }
            }
            else { //Se não for um mês válido, altera a data para 1/1/2000
                    this.ano = 2000;
                    this.dia = 1;
                    this.mes = 1;
                    System.out.println("Data inválida. \nData alterada para 1/1/2000");
                }
        }
        else if (ano % 4 != 0 && ano >= 0){ //Se o ano não for bissexto
            if (mes == 2){ //Registra somente de dia 1 a dia 28 de fev
                if (dia >=1 && dia <=28){
                    this.ano = ano;
                    this.mes = mes;
                    this.dia = dia;
                }
                else { //Se não for um dia válido, altera a data para 1/1/2000
                    this.ano = 2000;
                    this.dia = 1;
                    this.mes = 1;
                    System.out.println("Data inválida. \nData alterada para 1/1/2000");
                }
            }
            else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){ //Registra os meses que possuem 31 dias
                if (dia >= 1 && dia <= 31){ //Registra de dia 1 a dia 31
                    this.ano = ano;
                    this.dia = dia;
                    this.mes = mes;
                }
                else { //Se não for um dia válido, altera a data para 1/1/2000
                    this.ano = 2000;
                    this.dia = 1;
                    this.mes = 1;
                    System.out.println("Data inválida. \nData alterada para 1/1/2000");
                }            
            }  
            else if (mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) { //Registra meses de 30 dias
                if (dia >= 1 && dia <= 30){//Registra de dia 1 a dia 30
                    this.ano = ano;
                    this.dia = dia;
                    this.mes = mes;
                }
                else { //Se não for um dia válido, altera a data para 1/1/2000
                    this.ano = 2000;
                    this.dia = 1;
                    this.mes = 1;
                    System.out.println("Data inválida. \nData alterada para 1/1/2000");
                }
            }
        }
    }
    
    public int getDia (){
        return this.dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
    
    public boolean verificaAnoBissexto(){
        if (this.ano % 4 == 0){
            return true;
        }
        else {
            return false;
        }
    }
}