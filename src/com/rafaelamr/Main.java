package com.rafaelamr;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();

        //checagem se há mais de 1 palavra
        if (entrada.contains(" ")) {
            List<String> listaAux = new ArrayList<>();
            String [] arrString = entrada.toLowerCase().split(" ");

            //após o split, cada palavra passa pela função
            for (String str : arrString) {
                listaAux.add(removeLetrasDuplicadas(str));
            }

            //as palavras corrigidas e unidas de nv em uma lista são devolvidas
            System.out.println(String.join(" ", listaAux) + ".");

        } else

            System.out.println(removeLetrasDuplicadas(entrada.toLowerCase()) + ".");

        scanner.close();
    }

    public static String removeLetrasDuplicadas(String str) {
        HashSet<Character> hashRemoveDuplicadas = new LinkedHashSet<>();
        //set ignora repetições, linkedhashset respeita ordem de inserção
        char [] ch = str.toCharArray();
        for (char c : ch) {
            hashRemoveDuplicadas.add(c);
        }

        //reconstrução de cada palavra
        StringBuilder sb = new StringBuilder();
        for (char c : hashRemoveDuplicadas) {
            sb.append(c);
        }

        return sb.toString();
    }
}