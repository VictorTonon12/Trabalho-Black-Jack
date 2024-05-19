/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhoblackjack;

import base.carta;
import util.IO;


/**
 *
 * @author victo
 */
public class cartaBJ extends carta {

    public cartaBJ(String nipe, String valor){
        this.nipe = nipe;
        this.valor = valor;
    }
    @Override
    public String getNipe() {
        return nipe;
    }

    @Override
    public String getValor() {
        return valor;
    }

    @Override
    public int getPontuacao() {
        switch (valor) {
            case "A":
                return 11;
            case "K":
            case "Q":
            case "J":
                return 10;
            default:
                return Integer.parseInt(valor);
        }  
    }

    @Override
    public void setPontuacao(int pontuacao) {
        
    }

    @Override
    public void exibir() {
        System.out.print(nipe);
        System.out.print(valor);
    }
    
}
