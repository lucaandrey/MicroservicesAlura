package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
        System.out.println(calculadoraDeDesconto.calcular(primeiro));
        System.out.println(calculadoraDeDesconto.calcular(segundo));
    }
}
