package Projeto.Marketplace.Em.Java.test;

import Projeto.Marketplace.Em.Java.domain.Produto;

public class Loja {
    static void main(String[] args) {
        Produto powerbank = new Produto("Powerbank Samsung" , 99.90 , 3 , "Carregador Portátil");
        Produto foneBluetooth = new Produto("Fone bluetooth" , 59.90 , 109.90 , 5 , "Carregador Portátil");

        powerbank.informacoesProduto();
        powerbank.totalInvestido();
        powerbank.lucroEstimado();
        foneBluetooth.informacoesProduto();
        foneBluetooth.totalInvestido();
        foneBluetooth.informacoesLucroGeral();
    }
}
