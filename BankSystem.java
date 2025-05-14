import java.util.Scanner;
public class BankAccount {
    private double saldo;
    private double limiteChequeEspecial;
    private double dividaChequeEspecial;
    Scanner scanner = new Scanner(System.in);

    public BankAccount(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
        this.dividaChequeEspecial = 0;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é " + saldo);
    }

    public void consultarChequeEspecial() {
        System.out.println("Seu cheque especial é " + limiteChequeEspecial);
        System.out.println("Valor usado do cheque especial é " + dividaChequeEspecial);
    }

    public void depositar() {
        System.out.println("Quando voce quer depositar?");
        double valor = scanner.nextDouble();

        if (dividaChequeEspecial > 0) {
            double taxa = dividaChequeEspecial * 0.20;
            double totalDivida = dividaChequeEspecial + taxa;

            if (valor >= totalDivida){
                valor -= totalDivida;
                dividaChequeEspecial = 0;
                System.out.println("Divida paga com sucesso");
            } else {
                dividaChequeEspecial -= valor / 1.2;
                System.out.println("Sua divida foi paga parcialmente");
                valor = 0;
            }
        }
        saldo += valor;
        System.out.println("Deposito feito com sucesso");
    }

    public void sacar(){
        if (this.saldo <= 0){
            System.out.println("Voce esta sem saldo, por favor deposite um valor maior que 0R$");
        }
        else {
            System.out.println("Quanto voce quer sacar? ");
            int saque = scanner.nextInt();
            if (saque > this.saldo || saque <= 0){
                System.out.println("Valor informado negado, informe um valor valido");
            }
            else {
                saldo -= saque;
                System.out.println("O valor de " + saque + " foi sacado");
            }
        }
    }
    public void pagarBoleto (){
        System.out.println("Informe o valor do boleto:");
        double boleto = scanner.nextDouble();

        if (boleto <= saldo) {
            saldo -= boleto;
            System.out.println("Boleto pago com sucesso.");
        } else {
            double falta = boleto - saldo;
            if (falta <= (limiteChequeEspecial - dividaChequeEspecial)) {
                dividaChequeEspecial += falta;
                saldo = 0;
                System.out.println("Boleto pago usando cheque especial.");
            } else {
                System.out.println("Saldo insuficiente e cheque especial excedido. Boleto não pago.");
            }
        }

    }

    public void verificarUsoCheque (){
        if (dividaChequeEspecial > 0) {
            System.out.println("Voce esta usando " + dividaChequeEspecial + " do cheque especial");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao Banco ! 🏦");
        System.out.print("Digite o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();

        BankAccount conta = new BankAccount(depositoInicial);

        int opcao;
        do {
            System.out.println("\n===== MENU BANCO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar uso do cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    conta.consultarChequeEspecial();
                    break;
                case 3:
                    conta.depositar();
                    break;
                case 4:
                    conta.sacar();
                    break;
                case 5:
                    conta.pagarBoleto();
                    break;
                case 6:
                    conta.verificarUsoCheque();
                    break;
                case 0:
                    System.out.println("Saindo... Obrigado por usar o Banco!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

}








