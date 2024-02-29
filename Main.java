import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

    }
}

class Senha{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario = "admin";
        String senhaDB = "12345";
        boolean ligado = true;
        int seguranca = 0;

        while (ligado){
            System.out.println("Login: ");
            String usuarioDigitado = scanner.nextLine();
            System.out.println("Senha: ");
            String senhaDigitada = scanner.nextLine();

            if (seguranca >= 3){
                ligado = false;
            }else if (senhaDigitada.equals(senhaDB) && usuarioDigitado.equals(usuario)) {
                System.out.println("Acesso autorizado!");
                break;
            } else {
                System.out.println("Senha ou Usuário incorreto.");
                seguranca+=1;
        }
        }
    }
}

class Contador{
    public static void main(String[] args) {
        for (int contador = 1; contador <= 10; contador++){
            System.out.println(contador);
        }
    }
}

class Jogo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                \t\t\t\tBem-Vindo ao Jogo
                Pensarei em um número de 1 a 100, e você terá que descobrir
                Se errar 5 vezes perde!
                """);

        int numeroCorreto = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas != 5){
            System.out.println("\nTente acertar o número que pensei de 1 a 100:");
            int chute = scanner.nextInt();

            if (chute == numeroCorreto){
                tentativas++;
                System.out.printf("""                     
                        \nParabéns, você acertou o número!
                                                
                        Número: %d
                        Tentativas: %d
                        %n""",numeroCorreto, tentativas);
                break;
            }else {
                tentativas++;
                if (chute<numeroCorreto){
                    System.out.printf("""
                            \nO número que pensei é MAIOR que este
                            Tentativas: %d
                            """,tentativas);
                }else{
                    System.out.printf("""
                            \nO número que pensei é MENOR que este
                            Tentativas: %d
                            """,tentativas);
                }
            }
        }
    }
}

class PositivoNegativo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        double numero = scanner.nextDouble();

        if (numero>=0){
            System.out.println("Número positivo");
        }else{
            System.out.println("Número negativo");
        }

    }
}

class NumerosInteiros{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o 1 número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Escreva o 2 número: ");
        int numero2 = scanner.nextInt();
        if (numero1==numero2){
            System.out.println("Números sao iguais");
        }else{
            System.out.println("Números sao diferentes");
            if (numero1>numero2){
                System.out.println(numero1+ " é maior que "+ numero2);
            }else{
                System.out.println(numero1+ " é menor que "+ numero2);
            }
        }
    }
}

class CalculoQC{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ligado = true;

        while (ligado){
            System.out.println("""
                    \n1. Calcular área do quadrado
                    2. Calcular área do círculo
                    3. Sair
                    Opçao:""");
            int escolha = scanner.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Base ou Altura: ");
                    double bh = scanner.nextDouble();
                    System.out.println("Área do Quadrado: "+Math.pow(bh,2));
                    break;
                case 2:
                    System.out.println("Raio: ");
                    double raio = scanner.nextDouble();
                    System.out.println("Área do Círculo: "+ Math.PI*(Math.pow(raio,2)));
                    break;
                default:
                    ligado = false;
            }
        }
    }
}

class Tabuada{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um número para exibir a tabuada: ");
        int tabuada = scanner.nextInt();
        System.out.println("Quer que "+tabuada+" seja multiplicado até que número? ");
        int ateNumero = scanner.nextInt();

        for (int i = 1; i <= ateNumero; i++) {
            System.out.println(i+" x "+tabuada+" = "+tabuada*i);
        }
    }
}

class ParImpar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero<=0){
            System.out.println("Somente números maiores que 0");
        }else if (numero%2==0){
            System.out.println(numero+" é par");
        }else{
            System.out.println(numero+" é ímpar");
        }
    }
}

class Fatorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
            if (numero < 0) {
                System.out.println("O número deve ser não negativo");
            }

            if (numero == 0) {
                System.out.println("O fatorial de 0 é 1");
            }

            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}

class Desafio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = "SeuNome";
        String tipoConta = "Corrente";
        double saldoConta = 2500;
        boolean ligado = true;

        String menu = """
                    \nOperaçoes
                                    
                    1. Consultar Saldos
                    2. Receber Valor
                    3. Transferir Valor
                    4. Sair
                                    
                    Digite a opçao desejada:""";

        System.out.printf("""
                *******************************************
                Dados iniciais do cliente:
                                    
                Nome:           %s
                Tipo conta:     %s
                Saldo inicial:  R$ %.2f
                *******************************************
                """, nome, tipoConta, saldoConta);

        while (ligado) {
            System.out.println(menu);
            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("Seu saldo é de R$ "+saldoConta);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: ");
                    double valorAReceber = scanner.nextDouble();
                    saldoConta+=valorAReceber;
                    System.out.println("Saldo Atualizado R$ "+saldoConta);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    double valorATransferir = scanner.nextDouble();
                    if (valorATransferir>saldoConta){
                        System.out.println("Nao há saldo o suficiente para realizar a transferência");
                        break;
                    }
                    saldoConta-=valorATransferir;
                    System.out.println("Saldo Atualizado R$ "+saldoConta);
                    break;
                case 4:
                    ligado = false;
                default:
                    System.out.println("Opçao Inválida!");
                    break;
            }
        }
    }
}
