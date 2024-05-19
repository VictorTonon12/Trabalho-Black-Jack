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
public abstract class baralho {
    
    protected String[] nipes;
    protected String[] valores;
    protected ArrayList<carta> cartas;
    
    
    public abstract void gerarBaralho();
   /**
     * Gerar lista de cartas/
     */
    public abstract void embaralhar();
    /**
     * usar método shuffle da classe Colections/ 
     */
    public abstract carta darCarta();
     /**
     * entrega uma carta do baralho para a mão do jogador
     * @return um objeto do tipo carta/
     */
    public abstract ArrayList<carta> darCartas();
    /**
     * entrega uma lista de cartas para a mão do jogador
     * @return ArrayList de cartas/
     */
    protected abstract void exibirBaralho();
    /**
     * exibir baralho. para controle interno ( testes)
     */
    protected abstract void verificarEPreencherBaralho();
     /**
     * método interno. verifica se baralho está vazio e gera novo 
     */
}