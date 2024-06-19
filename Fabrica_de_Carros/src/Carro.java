public class Carro {
    //Atributos
    String cor;
    String modelo;
    double velocidadeAlta;
    double velocidadeMaxima;
    Motor motor;

    //Ligar o carro
    void ligar(){
        System.out.println("O carro esta ligado");
    }

    // Acelera uma certa quantidade
    void acelera(double quantidade){
        double velocidadeNova = this.velocidadeAlta + quantidade;
        this.velocidadeAlta = velocidadeNova;
    }

    //Devolve a marcha do carro
    int pegaMarcha() {
        if (this.velocidadeAlta < 0){
            return -1;
        }
        if (this.velocidadeAlta >= 0 && this.velocidadeAlta < 40){
            return 1;
        }
        if (this.velocidadeAlta >= 40 && this.velocidadeAlta < 80){
            return 2;
        }
        return 3;
    }
}
