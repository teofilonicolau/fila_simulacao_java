package com.example.filadeespera;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> fila = new LinkedList<>();

        // Adicionar nomes iniciais à fila
        fila.add("Ana");
        fila.add("Pedro");
        fila.add("Maria");
        fila.add("João");

        while (!fila.isEmpty()) {
            // Mostrar a fila atual
            System.out.println("Fila atual: " + fila);

            // Mostrar e remover o proximo nome a ser atendido
            System.out.println("Próximo a ser atendido: " + fila.peek());
            System.out.print("Deseja remover este nome da fila? (s/n): ");
            String remover = scanner.nextLine();

            if (remover.equalsIgnoreCase("s")) {
                fila.poll(); // Remove o primeiro da fila
            }

            // Adicionar novos nomes à fila
            System.out.print("Deseja adicionar um novo nome à fila? (s/n): ");
            String adicionar = scanner.nextLine();

            if (adicionar.equalsIgnoreCase("s")) {
                System.out.print("Digite o nome a ser adicionado: ");
                String novoNome = scanner.nextLine();
                fila.add(novoNome);
            }
        }

        System.out.println("A fila está vazia.");
        scanner.close();
    }
}

