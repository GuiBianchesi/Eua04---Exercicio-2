public class ContaCorrente {
    String nome;
    float saldo;
    float limite;
    char tipo;
    public ContaCorrente(){

    }
    public ContaCorrente(String n, float s, float l, char t){
        nome = n;
        saldo = s;
        limite = l;
        tipo = t;
    }
    public ContaCorrente(String n, float s, char t){

    }

    void cadastraDados(){
        System.out.println("Dados cadastrados.");
    }

    String imprimeDados(){
        return "Nome: "+nome+ " Saldo: "+saldo+ " Limite: "+limite+ " Tipo: "+tipo;
    }

    void depositar(float valor){
        saldo = saldo +valor;}
   
    void sacar(float valor){
        saldo = saldo -valor;
        }
}
