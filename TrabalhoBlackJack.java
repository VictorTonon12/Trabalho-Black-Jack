/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhoblackjack;

import static util.IO.readString;



/**
 *
 * @author victo
 */
public class TrabalhoBlackJack {

/**
 *
 * @author LENOVO
 */
   public static void main(String[] args) {
        baralhoBJ baralho = new baralhoBJ();
        player jogador = new player();
        dealer dealer = new dealer();
          
        
        jogador.comprarCarta(baralho.darCarta());
        jogador.comprarCarta(baralho.darCarta());
        dealer.comprarCarta(baralho.darCarta());
        dealer.comprarCarta(baralho.darCarta());

        // Turno do jogador
        while (jogador.querCarta()) {
            System.out.println("Você quer uma carta? (s/n)");
            String resposta = readString();
            if (resposta.equalsIgnoreCase("s")) {
                jogador.comprarCarta(baralho.darCarta());
                System.out.println("Você recebeu uma carta. Seus pontos: " + jogador.calcularPontos());
                if (jogador.calcularPontos() > 21) {
                    System.out.println("Você estourou! Seus pontos: " + jogador.calcularPontos());
                    return;
                }
            } else {
                break;
            }
        }

        // Turno do dealer
        while (dealer.querCarta()) {
            dealer.comprarCarta(baralho.darCarta());;
            if (dealer.calcularPontos() > 21) {
                System.out.println("Dealer estourou! Dealer pontos: " + dealer.calcularPontos());
                return;
            }
        }

        // Resultados finais
        int pontosJogador = jogador.calcularPontos();
        int pontosDealer = dealer.calcularPontos();

        System.out.println("Seus pontos: " + pontosJogador);
        System.out.println("Pontos do dealer: " + pontosDealer);

        if (pontosJogador > 21) {
            System.out.println("Você perdeu!");
        } else if (pontosDealer > 21 || pontosJogador > pontosDealer) {
            System.out.println("Você ganhou!");
        } else if (pontosJogador < pontosDealer) {
            System.out.println("Você perdeu!");
        } else {
            System.out.println("Empate!");
        }

        
    }
    
 }
