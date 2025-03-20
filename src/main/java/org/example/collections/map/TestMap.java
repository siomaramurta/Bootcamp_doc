package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

    public static void main(String[] args) {
        Map<String, String> contas = new HashMap<>();

        contas.put("Conta Corrente", "Siomara");
        contas.put("Conta Pagamento", "Karyn");
        contas.put("Conta Poupança", "Paula");
        contas.put("Conta Corrente", "Siomara Murta");

        System.out.println(contas);
        System.out.println(contas.get("Conta Corrente"));

        System.out.println(contas.keySet());
    }
}
