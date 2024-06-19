public class Conta {
    //Atributos
    int numero;
    //String titular;
    double saldo;
    Cliente	titular	=	new	Cliente();	//	quando	chamarem	new	Conta,
                                        //haverá	um	new	Cliente	para	ele.

    /*  O metudo saca mudoupara metudsos com retorno
    // Metodo de saca
    void saca(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    */

    //Metodo de deposito
    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    //Metodos com retorno
    boolean	saca(double	valor) {
        if	(this.saldo	<	valor)	{
            return false;
        }
        else	{
            this.saldo	=	this.saldo	-	valor;
            return true;
        }
    }

    //O metudo trasfere mudoupara metudsos com retorno
    /*
    void transfere(Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
    */

    //Metodos com retorno
    boolean transfere(Conta destino, double valor) {
        boolean retirou = this.saca(valor);
        if (retirou == false) {
            //nao deu pra sacar
            return false;
        }
        else {
            destino.deposita(valor);
            return true;
        }
    }

}