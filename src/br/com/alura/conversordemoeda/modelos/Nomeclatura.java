package br.com.alura.conversordemoeda.modelos;

import br.com.alura.conversordemoeda.conversao.Moedas;

import java.util.Objects;

public class Nomeclatura {
    String moedaBase;
    String moedaDestino;
    double taxaDeCambio;
    double resultado;


    public Nomeclatura(Moedas minhasMoedas) {
        this.moedaBase = minhasMoedas.base_code();
        this.moedaDestino = minhasMoedas.target_code();
        this.taxaDeCambio = minhasMoedas.conversion_rate();
        this.resultado = minhasMoedas.conversion_result();
    }

    @Override
    public String toString() {
       String nomeMoedaBase = null;
       String nomeMoedaDestino = null;
       String codigoTaxaDeCambio = null;
       String codigoResultado = null;

       if (this.moedaBase.equals("USD") && this.moedaDestino.equals("BRL")) {
           nomeMoedaBase = "Dolar";
           nomeMoedaDestino = "Real";
           codigoTaxaDeCambio = "$";
           codigoResultado = "R$";
       }
       if (this.moedaBase.equals("BRL") || this.moedaDestino.equals("USD")) {
            nomeMoedaBase = "Real";
            nomeMoedaDestino = "Dolar";
            codigoTaxaDeCambio = "R$";
            codigoResultado = "$";
       }
       if (this.moedaBase.equals("EUR") && this.moedaDestino.equals("BRL")) {
            nomeMoedaBase = "Euro";
            nomeMoedaDestino = "Real";
            codigoTaxaDeCambio = "€";
            codigoResultado = "R$";

       }
       if (this.moedaBase.equals("BRL") && this.moedaDestino.equals("EUR") ) {
            nomeMoedaBase = "Real";
            nomeMoedaDestino = "Euro";
            codigoTaxaDeCambio = "R$";
            codigoResultado = "€";
       }
        if (this.moedaBase.equals("KRW") && this.moedaDestino.equals("BRL")){
            nomeMoedaBase = "Won";
            nomeMoedaDestino = "Real";
            codigoTaxaDeCambio = "₩";
            codigoResultado = "R$";
        }
        if (this.moedaBase.equals("BRL") && this.moedaDestino.equals("KRW")){
            nomeMoedaBase = "Real";
            nomeMoedaDestino = "Won";
            codigoTaxaDeCambio = "R$";
            codigoResultado = "₩";
        }

        return String.format(   """
                        ########################
                        
                        Conversão
                          De: %s (%s)
                          Para: %s (%s)
                          Taxa de câmbio: %s%.4f
                          Resultado: %s%.2f
                          
                        ########################""", moedaBase, nomeMoedaBase, moedaDestino, nomeMoedaDestino, codigoTaxaDeCambio, taxaDeCambio,  codigoResultado, resultado);
        
    }
}
