package entities;

public class Conta {

    public String usuarioConta;
    public int numConta;
    public double depositoConta;

    public Conta(String usuarioConta, int numConta) {
        this.usuarioConta = usuarioConta;
        this.numConta = numConta;

    }

    public Conta(String usuarioConta, int numConta, double depositoConta) {
        this.usuarioConta = usuarioConta;
        this.numConta = numConta;
        this.depositoConta = depositoConta;

    }

    public double deposita(double depositoConta) {
        this.depositoConta += depositoConta;
        return this.depositoConta;
    }

    public double saque(double depositoConta) {
        this.depositoConta -= depositoConta;
        return this.depositoConta;
    }

    public String toString() {
        return "conta: " + this.numConta + " \n usario: " + this.usuarioConta + " \n valor conta: "+ this.depositoConta;
    }
}
