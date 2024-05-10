package models;

public class ContaBancaria {

    public Integer numero;
    public String agencia;
    public String nomeCliente;
    public Double saldo;

    public ContaBancaria() {}

    public void setAgencia(String agencia) throws Exception {
        this.agencia = formatarAgencia(agencia);
    }

    private String formatarAgencia(String agencia) throws Exception {
        if (agencia.length()!=4){
            throw new Exception("Agencia deve conter 4 digitos");
        }
        return agencia.substring(0,3).concat("-").concat(String.valueOf(agencia.charAt(3)));
    }


    @Override
    public String toString() {
        return "Olá "
                .concat(nomeCliente).concat(" obrigado por criar uma conta em nosso banco, sua agência é "
                .concat(agencia).concat(", conta ")
                .concat(numero.toString()).concat(" e seu saldo ")
                .concat(saldo.toString()).concat(" já está disponível para saque"));
    }
}
