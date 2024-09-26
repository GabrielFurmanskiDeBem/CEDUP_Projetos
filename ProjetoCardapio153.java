import java.util.Scanner;

public class ProjetoCardapio153 {

    /*
    Grupo: Cedupinhos
    Nomes: Arthur Cândido da Silva, Gabriel Furmanski de Bem, Heloyse Lima Oliveira, Julia Lack Oliveira, Yuri Bernardino da Rosa
    Turma: 1-53
    */
    
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int escolhaAbrirCardapio, escolhaMenu, escolherSalgado, escolherDoce, escolherBebida;
        float valorTotal = 0;

        System.out.println("Olá! Bem-vindo(a) ao restaurante Cedupinhos, qual será o seu pedido?");
        System.out.println("Abrir cardápio?");
        Thread.sleep(500);
        System.out.println("[1] Sim");
        Thread.sleep(500);
        System.out.println("[2] Não (Terminar)");

        do {
            Thread.sleep(500);
            System.out.print("Escolha: ");
            escolhaAbrirCardapio = sc.nextInt();
            if(escolhaAbrirCardapio<1||escolhaAbrirCardapio>2){
                System.out.println("[ERRO] Escolha inválida!");
            }
        }while(escolhaAbrirCardapio<1||escolhaAbrirCardapio>2);

        switch (escolhaAbrirCardapio) {
            case 1:
                do {
                    System.out.println(" -- CARDÁPIO --");
                    System.out.println("Menus: ");
                    System.out.println("[1] Salgados");
                    System.out.println("[2] Doces");
                    System.out.println("[3] Bebidas");
                    System.out.println("[4] Fechar o cardápio");

                    Thread.sleep(500);
                    System.out.print("Abrir qual menu? R: ");
                    escolhaMenu = sc.nextInt();

                    if(escolhaMenu<1||escolhaMenu>4) {
                        System.out.println("[ERRO] Escolha inválida!");
                    }
                    Thread.sleep(500);
                    switch (escolhaMenu){
                        case 1:
                            do {
                                System.out.println("--- MENU DE SALGADOOS ---");
                                System.out.println("[1] Coxinha | R$5,00");
                                System.out.println("[2] Esfirra | R$ 9,50");
                                System.out.println("[3] Pastel | R$7,00");
                                System.out.println("[4] Quibe | R$7,00");
                                System.out.println("[5] Pão de queijo | R$6,00");
                                System.out.println("[6] Fechar Menu");
                                Thread.sleep(500);
                                do {
                                    System.out.print("Escolha: ");
                                    escolherSalgado = sc.nextInt();
                                    if (escolherSalgado < 1 || escolherSalgado > 6) {
                                        System.out.println("[ERRO] Escolha inválida!");
                                    }
                                } while (escolherSalgado < 1 || escolherSalgado > 6);

                                switch(escolherSalgado){
                                    case 1:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida1 = sc.nextInt();
                                        double precoPorQuantidade1 = quantidadeEscolhida1*5;
                                        valorTotal+=(precoPorQuantidade1);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida1+" coxinha(s), R$%.2f%n", precoPorQuantidade1 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 2:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida2 = sc.nextInt();
                                        double precoPorQuantidade2 = quantidadeEscolhida2*9.5;
                                        valorTotal+=(precoPorQuantidade2);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida2+" esfirra(s), R$%.2f%n", precoPorQuantidade2 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 3:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida3 = sc.nextInt();
                                        double precoPorQuantidade3 = quantidadeEscolhida3*7;
                                        valorTotal+=(precoPorQuantidade3);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida3+" pastel(éis), R$%.2f%n", precoPorQuantidade3 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 4:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida4 = sc.nextInt();
                                        double precoPorQuantidade4 = quantidadeEscolhida4*7;
                                        valorTotal+=(precoPorQuantidade4);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida4+" quibe(s), R$%.2f%n", precoPorQuantidade4 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 5:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida5 = sc.nextInt();
                                        double precoPorQuantidade5 = quantidadeEscolhida5*6;
                                        valorTotal+=(precoPorQuantidade5);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida5+" pão(s) queijo, R$%.2f%n", precoPorQuantidade5 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 6:
                                        System.out.println("-----------------------------");
                                        System.out.println("Você saiu do menu de salgados.");
                                        System.out.println("-----------------------------");
                                        break;
                                    default:
                                        System.out.println("[ERRO] Escolha inválida!");
                                        break;
                                }
                                Thread.sleep(1000);
                            }while(escolherSalgado!=6);
                            break;
                        case 2:
                            do {
                                System.out.println("--- MENU DE DOCES ---");
                                System.out.println("[1] Sagu | R$10,00");
                                System.out.println("[2] Pudim | R$18,50");
                                System.out.println("[3] Torta (sabores variados) | R$85,00");
                                System.out.println("[4] Açaí (Personalizado de 450ml) | R$24,00");
                                System.out.println("[5] Brownie | R$15,00");
                                System.out.println("[6] Fechar menu");

                                Thread.sleep(500);
                                do {
                                    System.out.print("Escolha: ");
                                    escolherDoce = sc.nextInt();
                                    if (escolherDoce < 1 || escolherDoce > 6) {
                                        System.out.println("[ERRO] Escolha inválida!");
                                    }
                                } while (escolherDoce < 1 || escolherDoce > 6);

                                switch(escolherDoce){
                                    case 1:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida1 = sc.nextInt();
                                        double precoPorQuantidade1 = quantidadeEscolhida1*10;
                                        valorTotal+=(precoPorQuantidade1);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida1+" sagu(s), R$%.2f%n", precoPorQuantidade1 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 2:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida2 = sc.nextInt();
                                        double precoPorQuantidade2 = quantidadeEscolhida2*18.5;
                                        valorTotal+=(precoPorQuantidade2);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida2+" pudim(ns), R$%.2f%n", precoPorQuantidade2 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 3:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida3 = sc.nextInt();
                                        double precoPorQuantidade3 = quantidadeEscolhida3*85;
                                        valorTotal+=(precoPorQuantidade3);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida3+" torta(s), R$%.2f%n", precoPorQuantidade3 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 4:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida4 = sc.nextInt();
                                        double precoPorQuantidade4 = quantidadeEscolhida4*24;
                                        valorTotal+=(precoPorQuantidade4);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida4+" açaí(s), R$%.2f%n", precoPorQuantidade4 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 5:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida5 = sc.nextInt();
                                        double precoPorQuantidade5 = quantidadeEscolhida5*15;
                                        valorTotal+=(precoPorQuantidade5);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida5+" brownie(s), R$%.2f%n", precoPorQuantidade5 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 6:
                                        System.out.println("-----------------------------");
                                        System.out.println("Você saiu do menu de doces.");
                                        System.out.println("-----------------------------");
                                        break;
                                    default:
                                        System.out.println("[ERRO] Escolha inválida!");
                                        break;
                                }
                                Thread.sleep(1000);
                            }while(escolherDoce!=6);
                            break;
                        case 3:
                            do {
                                System.out.println("--- MENU DE BEBIDAS ---");
                                System.out.println("[1] Suco (Frutas variadas de mesmo valor / 300ml) | R$5,00");
                                System.out.println("[2] Refrigerante (2 litros) | R$13,00");
                                System.out.println("[3] Café | R$4,00");
                                System.out.println("[4] Vinho | R$50,00");
                                System.out.println("[5] Caldo de cana | R$8,00");
                                System.out.println("[6] Fechar Menu");

                                Thread.sleep(500);
                                do {
                                    System.out.print("Escolha: ");
                                    escolherBebida = sc.nextInt();
                                    if (escolherBebida < 1 || escolherBebida > 6) {
                                        System.out.println("[ERRO] Escolha inválida!");
                                    }
                                } while (escolherBebida < 1 || escolherBebida > 6);

                                switch(escolherBebida){
                                    case 1:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida1 = sc.nextInt();
                                        double precoPorQuantidade1 = quantidadeEscolhida1*5;
                                        valorTotal+=(precoPorQuantidade1);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida1+" suco(s), R$%.2f%n", precoPorQuantidade1 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 2:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida2 = sc.nextInt();
                                        double precoPorQuantidade2 = quantidadeEscolhida2*13;
                                        valorTotal+=(precoPorQuantidade2);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida2+" refrigerante(s), R$%.2f%n", precoPorQuantidade2 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 3:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida3 = sc.nextInt();
                                        double precoPorQuantidade3 = quantidadeEscolhida3*4;
                                        valorTotal+=(precoPorQuantidade3);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida3+" copo(s) de café, R$%.2f%n", precoPorQuantidade3 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 4:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida4 = sc.nextInt();
                                        double precoPorQuantidade4 = quantidadeEscolhida4*50;
                                        valorTotal+=(precoPorQuantidade4);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida4+" taça(s) de vinho, R$%.2f%n", precoPorQuantidade4 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 5:
                                        System.out.print("Qual a quantidade desejada? R: ");
                                        int quantidadeEscolhida5 = sc.nextInt();
                                        double precoPorQuantidade5 = quantidadeEscolhida5*18.5;
                                        valorTotal+=(precoPorQuantidade5);
                                        System.out.println("-----------------------------");
                                        System.out.printf("Você pediu "+quantidadeEscolhida5+" caldo(s) de cana, R$%.2f%n", precoPorQuantidade5 ," somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 6:
                                        System.out.println("-----------------------------");
                                        System.out.println("Você saiu do menu de bebidas.");
                                        System.out.println("-----------------------------");
                                        break;
                                    default:
                                        System.out.println("[ERRO] Escolha inválida!");
                                        break;
                                }
                            }while(escolherBebida!=6);
                            break;
                        case 4:
                            Thread.sleep(500);
                            System.out.println("Você fechou o cardápio.");
                        default:
                            break;
                    }
                }while(escolhaMenu!=4);

                Thread.sleep(1000);
                System.out.printf("O total deu R$%.2f%n",valorTotal,".");
                break;
            case 2:
                System.out.println("Você foi embora.");
                break;
            default:
                System.out.println("[ERRO] Escolha inválida!");
                break;
        }
    }
}
