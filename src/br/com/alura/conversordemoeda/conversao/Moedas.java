package br.com.alura.conversordemoeda.conversao;

public record Moedas(String base_code, String target_code, double conversion_rate, double conversion_result) {
}

// usd = doral eur = euro brl = real krw = won