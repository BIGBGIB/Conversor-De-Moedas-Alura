package br.com.alura.conversordemoeda.principal;

import br.com.alura.conversordemoeda.conversao.Cotacao;
import br.com.alura.conversordemoeda.conversao.Moedas;
import br.com.alura.conversordemoeda.modelos.Nomeclatura;

import java.util.Scanner;

public class Menu {
    public void exibeMenu() {
        int i = 0;
        Scanner leitura1 = new Scanner(System.in);
        Scanner leitura2 = new Scanner(System.in);
        Cotacao minhaCotacao = new Cotacao();
        while (i != 7){
            System.out.println("""
                    *************************************
                    Bem-Vindo ao Conversor de moedas VIP
                    
                    Operações disponíveis:
                    
                        1• Converter Dolar para Real
                        2• Converter Real para Dolar
                        3• Converter Euro para Real
                        4• Converter Real para Euro
                        5• Converter Won para Real
                        6• Converter Real para Won
                        7• Sair
                    
                    Digite a opção desejada:
                    """);
            int numeroOperacao = leitura1.nextInt();

            switch (numeroOperacao){
                case 1:
                    System.out.println("Digite o valor");
                    double numeroValor = leitura2.nextDouble();
                    System.out.println("*************************************");
                    minhaCotacao.obterEndereco("https://v6.exchangerate-api.com/v6/0c8912a38faec38ad6559b40/pair/USD/BRL/" + numeroValor);
                    break;
                case 2:
                    System.out.println("Digite o valor");
                    numeroValor = leitura2.nextDouble();
                    System.out.println("*************************************");
                    minhaCotacao.obterEndereco("https://v6.exchangerate-api.com/v6/0c8912a38faec38ad6559b40/pair/BRL/USD/" + numeroValor);
                    break;
                case 3:
                    System.out.println("Digite o valor");
                    numeroValor = leitura2.nextDouble();
                    System.out.println("*************************************");
                    minhaCotacao.obterEndereco("https://v6.exchangerate-api.com/v6/0c8912a38faec38ad6559b40/pair/EUR/BRL/" + numeroValor);
                    break;
                case 4:
                    System.out.println("Digite o valor");
                    numeroValor = leitura2.nextDouble();
                    System.out.println("*************************************");
                    minhaCotacao.obterEndereco("https://v6.exchangerate-api.com/v6/0c8912a38faec38ad6559b40/pair/BRL/EUR/" + numeroValor);
                    break;
                case 5:
                    System.out.println("Digite o valor");
                    numeroValor = leitura2.nextDouble();
                    System.out.println("*************************************");
                    minhaCotacao.obterEndereco("https://v6.exchangerate-api.com/v6/0c8912a38faec38ad6559b40/pair/KRW/BRL/" + numeroValor);
                    break;
                case 6:
                    System.out.println("Digite o valor");
                    numeroValor = leitura2.nextDouble();
                    System.out.println("*************************************");
                    minhaCotacao.obterEndereco("https://v6.exchangerate-api.com/v6/0c8912a38faec38ad6559b40/pair/BRL/KRW/" + numeroValor);
                    break;
                case 7:
                    i = 7;
                    System.out.println("Programa Finalizado");
                    System.out.println("*************************************");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

