import java.util.Scanner;

public class ProjetoCardapio153 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int escolhaAbrirCardapio, escolhaMenu, escolherSalgado, escolherDoce, escolherBebida;
        float valorTotal = 0;

        System.out.println("Olá! Bem-vindo(a) ao restaurante [], qual será o seu pedido?");
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
                                        valorTotal+=5;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu uma coxinha, R$5,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 2:
                                        valorTotal+=9.5f;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu uma esfirra, R$9,50 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 3:
                                        valorTotal+=7;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um pastel, R$7,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 4:
                                        valorTotal+=7;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um quibe, R$7,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 5:
                                        valorTotal+=6;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um pão de queijo, R$6,00 somados na conta.");
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
                                        valorTotal+=10;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um sagu, R$10,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 2:
                                        valorTotal+=18.5f;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um pudim, R$18,50 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 3:
                                        valorTotal+=85;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu uma torta, R$85,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 4:
                                        valorTotal+=24;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um açaí personalizado, R$24,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 5:
                                        valorTotal+=15;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um brownie, R$15,00 somados na conta.");
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
                                        valorTotal+=5;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um suco, R$5,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 2:
                                        valorTotal+=13;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um refrigerante, R$13,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 3:
                                        valorTotal+=4;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um café, R$4,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 4:
                                        valorTotal+=50;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um vinho, R$50,00 somados na conta.");
                                        System.out.println("-----------------------------");
                                        break;
                                    case 5:
                                        valorTotal+=8;
                                        System.out.println("-----------------------------");
                                        System.out.println("Você pediu um caldo de cana, R$8,00 somados na conta.");
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
                System.out.printf("O total deu R$"+valorTotal+".");
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