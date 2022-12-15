package entities; //PACOTE DA CLASSE

//PREFIXO PUBLIC INDICA QUE O ATRIBUTO OU METODO PODE SER USADO EM OUTROS ARQUIVOS

public class Triangulo { //NOME DA CLASSE

    public double a; // ATRIBUTOS DA CLASSE
    public double b;
    public double c;

    public double area(/*/PARAMETROS DO METODO*/){ 
    
        //CORPO DO METODO
        double p = (a + b + c) / 2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

}
