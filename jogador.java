/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public abstract class jogador {
    
    protected ArrayList<carta> maoJogador;
    protected int numCartas;
    
    
    public abstract void comprarCarta(carta carta);
    /**
     * Adiciona uma carta do baralho para a mão
     * @param carta carta comprada do baralho
     */
    public abstract void comprarCartas(ArrayList<carta> cartas);
    /**
     * Adiciona uma lista de cartas 
     * @param cartas arraylist de cartas
     */
    protected abstract void exibirMao();
    /**
     * exibe lista de cartas
     * se for o dealer não exibe a primeira carta até o fim da jogada do player
     * se for o player exibe normalmente
     * cartas devem ser exibidas em ordem (implementar Comparable em Carta e usar Collections.sort)
     */
}