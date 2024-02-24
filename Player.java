/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

/**
 *
 * @author hp
 */







public class Player {


  private  String name ;
  private  Card arr_card[]=new Card [11];
  private  int score=0 ;
  private  boolean play=true;
    private int numOfCards = 0;
      
    
     
      
        
       public Player(String name, boolean play) {
        this.name = name;
        this.play = play;
        for(int g=0;g<11;g++){
        this.arr_card[g]=new Card(0,0,0);
    } }
            
 

    public boolean isWon() {
        return play;
    }

    public void setWon(boolean won) {
        this.play = won;
    }
  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Card[] getArr_card() {
        return arr_card;
    }

    public void setArr_card(Card[] arr_card) {
        this.arr_card = arr_card;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
  void add_Card(Card card){
      arr_card[this.numOfCards].setRank(card.getRank()); 
       arr_card[this.numOfCards].setSuit(card.getSuit());
        arr_card[this.numOfCards].setValue(card.getValue());
     // card.Indexx++;
     this.numOfCards++;
      check_Score(card);
      
      
      
  }
  void check_Score(Card card){
      this.score=this.score+card.getValue();
      
  }
  void check_win(){
      if(this.getScore()==21){
         this.play =false;
          System.out.println("Black Jack");
      }
      if(this.getScore()>21){
          this.play=false;
          System.out.println("Busted");
          
      }
      else{
          this.play=true;
      }
      
  }
  void check_Busted(){
      if(this.getScore()>21){
          System.out.println("Busted");
      }
  }
  
    
    
}
