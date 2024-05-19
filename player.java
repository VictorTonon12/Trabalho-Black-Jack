/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoblackjack;

import base.carta;
import base.jogador;
import java.util.ArrayList;
import java.util.Collections;
import util.IO;
import static util.IO.readString;

/**
 *
 * @author victo
 */
public class player extends jogador {

    
    @Override
    public void comprarCarta(carta carta) {
        maoJogador.add(carta);
    }

    @Override
    public void comprarCartas(ArrayList<carta> cartas) {
        maoJogador.addAll(cartas);
    }
    @Override
    protected void exibirMao() {
        System.out.println(maoJogador);
    }
    
    public int calcularPontos() {
        int pontos = 0;
        int numAses = 0;

        for (carta carta : maoJogador) {
            pontos += carta.getPontuacao();
            if (carta.getValor().equals("A")) {
                numAses++;
            }
        }

        while (pontos > 21 && numAses > 0) {
            pontos -= 10;
            numAses--;
        }

        return pontos;
    }
     public boolean querCarta() {
        System.out.println(", você quer outra carta? (s/n)");
        String resposta = readString();
        return resposta.equalsIgnoreCase("s");
    }
    
}
