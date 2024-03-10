public class execicio5 {//Os fatoriai. testando o codigo
    public static void main(String[] args){
        long fatorial = 1;
        for (int n = 1;  n <= 40; n++){ //trocando o fatorial por 20, 30, 40 para analisar os erros.
            fatorial = fatorial * n;
            System.out.println("Fat("+ n +") = " + fatorial);
        } // podemos pecebi um erro, pos utapassamos o limite o int devemos trocar por long
    }

}
