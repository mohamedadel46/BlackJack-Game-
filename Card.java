/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package blackjack;

/**
 *
 * @author hp
 */
public class Card {
    private  int suit=0 ;
    private  int value=0 ;
    private  int rank =0;
    public   int Indexx =0;
    
    public Card (int suit,int value,int rank){
        this.suit=suit;
        this.value=value;
        this.rank=rank;
        
    }
    public  Card (Card card1){
        this.suit=card1.suit;
        this.value=card1.value;
        this.rank=card1.rank;
        
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
     
    

}
