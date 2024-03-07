public class BalancoTrimestral { //criar classe
    public static void main(String[] args) { //Dentro do metodo main declaras as variaveis
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco; //faze a soma

        System.out.println("Gastos do trimestre: R$" + gastosTrimestre);
        int mediaPorMes = gastosTrimestre / 3; //faze a media aritimetica
        System.out.println("Média mensal: R$" + mediaPorMes);
    }
}
