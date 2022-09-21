package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cliente> clienteList = new ArrayList<>();

    public static void main(String[] args) {
        int contador = 0;
        Lol:
        while (true) {
            contador++;
            System.out.println("Bem Vindo ao Sistema de cadastramento de Clientes, o que você você quer fazer?");
            System.out.println("Se você deseja sair digite: (1)");
            System.out.println("Se você deseja criar uma entidade cliente digite: (2)");
            Scanner scanner = new Scanner(System.in);
            int opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 1) {
                for (Cliente x: clienteList){
                    System.out.println("Lista definitiva de Clientes: ");
                    System.out.println("Nome: "+x.nome);
                    System.out.println("Idade: "+x.idade);
                    System.out.println("Aposentadoria: "+ x.aposentadoria);
                }
                break Lol;
            }
            if (opcaoEscolhida == 2) {
                System.out.println("-------------------------------------------------------");
                Cliente cliente = new Cliente();
                System.out.println("Qual o nome do cliente e a idade logo em seguida ? ");
                Scanner atributosDoCliente = new Scanner(System.in);
                cliente.nome = atributosDoCliente.nextLine();
                cliente.idade = Integer.valueOf(atributosDoCliente.nextLine());
                System.out.println("Cliente de nome: " + cliente.nome);
                System.out.println("Cliente com idade: " + cliente.idade);
                if (cliente.idade > 65){
                    cliente.aposentadoria = 2000;
                }
                clienteList.add(cliente);
                System.out.println("-------------------------------------------------------");

            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Você deseja remover algum cliente? (1)Remover um Cliente | (2)Não remover ninguém | (3)Buscar algum cliente pelo nome | (4) Ver todos os clientes da lista | (5) Atualizar uma idade de um cliente");
            Scanner scanner1 = new Scanner(System.in);
            int remover = scanner1.nextInt();
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            if (remover == 1) {
                Scanner remove = new Scanner(System.in);
                System.out.println("Digite o nome do cliente que você deseja remover:");
                String removerCliente = remove.nextLine();
                for (int i = 0; i < clienteList.size(); i++) {
                    if (removerCliente.equals(clienteList.get(i).nome)) {
                        clienteList.remove(i);
                        System.out.println("-------------------------------------------------------");
                        System.out.println("Você deseja começar o processo de novo? (1)Sim (2)Não");
                        int recomecar = remove.nextInt();
                        if (recomecar == 1) {
                            continue Lol;
                        } else
                            for(Cliente o: clienteList){
                                System.out.println("Nome: " + o.nome);
                                System.out.println("Idade: " + o.idade);
                                System.out.println("Aposentadoria: " + o.aposentadoria);
                            }
                            break Lol;


                    }
                }
            } else if (remover == 2) {
                System.out.println("\n");
                System.out.println("Você deseja adicionar mais alguem ou encerrar o programa? (1)Adiconar mais Clientes | (2)Encerrar.");
                Scanner scanner2 = new Scanner(System.in);
                int encerrarOuContinuar = scanner2.nextInt();
                if (encerrarOuContinuar == 1) {
                    continue Lol;
                } else
                    for(Cliente o: clienteList){
                        System.out.println("Nome: " + o.nome);
                        System.out.println("Idade: " + o.idade);
                        System.out.println("Aposentadoria: " + o.aposentadoria);
                    }
                    break Lol;
            } else if (remover == 3) {
                System.out.println("Digite o nome do cliente que você localizar: ");
                Scanner acharCliente = new Scanner(System.in);
                String clienteAchar = acharCliente.nextLine();

                for(Cliente c : clienteList){
                    if(c.nome.equals(clienteAchar)){
                        System.out.println("nome: " + c.nome);
                        System.out.println("idade: " + c.idade);
                        System.out.println("Aposentadoria: "+c.aposentadoria);

                    }
                }

            } else if (remover == 4) {
                System.out.println("\n");
                System.out.println("=========================");
                for (Cliente f : clienteList) {
                    System.out.println("Nome: " + f.nome);
                    System.out.println("Idade: " + f.idade);
                    System.out.println("Aposentadoria: "+ f.aposentadoria);
                    System.out.println("=========================");
                }
            }
            else if (remover == 5){
                System.out.println("Digite o nome do cliente que você deseja modificar a idade: ");
                Scanner mudarIdade = new Scanner(System.in);
                String idadeMudar = mudarIdade.nextLine();

                for (int d = 0; d < clienteList.size(); d++){
                    if (idadeMudar.equals(clienteList.get(d).nome)){
                        System.out.println("Digite a nova idade do cliente: "+ clienteList.get(d).nome);
                        Scanner idadeMudada = new Scanner(System.in);
                        Integer novaIdade = idadeMudada.nextInt();
                        clienteList.get(d).idade = novaIdade;
                        for (Cliente  z: clienteList){
                            System.out.println("Nome: "+z.nome);
                            System.out.println("Idade: "+z.idade);
                            System.out.println("Aposentadoria: "+z.aposentadoria);

                        }

                    }

                }

            }
        }
    }
}