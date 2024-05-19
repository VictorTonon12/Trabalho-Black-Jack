/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoblackjack;

import base.baralho;
import base.carta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author victo
 */
public class baralhoBJ extends baralho{
    
    private cartaBJ carta;
    
    
    @Override
    public void gerarBaralho() {
        String[] nipes = {"Copas", "Ouros", "Espadas", "Paus"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList<carta> cartas = new ArrayList();
        

        for (String nipe : nipes) {
            for (String valor : valores) {
                this.cartas.add(new cartaBJ(nipe, valor));
            }
        }
    }

    @Override
    public void embaralhar() {
         Collections.shuffle(this.cartas);
    }

    @Override
    public carta darCarta() {
        verificarEPreencherBaralho();
        return this.cartas.remove(this.cartas.size() - 1);
    }

    @Override
    public ArrayList<carta> darCartas() {
        verificarEPreencherBaralho();
        return cartas;
    }

    @Override
    protected void exibirBaralho() {
        for (int i = 0; i< this.cartas.size(); i++){
            System.out.println(this.cartas.get(i));
        }
    }

    @Override
    protected void verificarEPreencherBaralho() {
        if (this.cartas.isEmpty()){
            this.gerarBaralho();
            this.embaralhar();
        }
    }
    
}
