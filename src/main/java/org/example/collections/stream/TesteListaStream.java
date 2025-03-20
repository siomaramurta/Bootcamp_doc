package org.example.collections.stream;

import java.util.ArrayList;
import java.util.List;

public class TesteListaStream {

    public static void main(String[] args) {
        List<String> contas = new ArrayList<>();

        contas.add("Conta Poupanca");
        contas.add("Conta Corrente");
        contas.add("Conta Pagamento");
        contas.add("Conta Poupanca");

        contas.stream()
                .filter( conta -> filterLista(conta))
                .forEach(conta -> System.out.println("Conta: " +conta));

        long total = contas.stream()
                .filter( conta -> filterLista(conta))
                .count();
        System.out.println("Total de Poupança: " + total);

        long totalContas = 0;
        for(int index = 0; index < contas.size(); index++) {
            String conta = contas.get(index);
            if (filterLista(conta)) {
                totalContas = totalContas + 1;
            }
        }
    }

    public static Boolean filterLista(String conta) {
            return conta.contains("Poupanca");
    }
}
