/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Game {
      Player arr_player[]=new Player[4];
   private Card   arr_card[]=new Card[52];
   private static int high_score =0 ;
   private static int index_high_score;
   private boolean push =false;

    public static int getIndex_high_score() {
        return index_high_score;
    }

    public static void setIndex_high_score(int index_high_score) {
        Game.index_high_score = index_high_score;
    }

    public boolean isPush() {
        return push;
    }

    public void setPush(boolean push) {
        this.push = push;
    }
  
    public Player[] getArr_player() {
        return arr_player;
    }

    public Card[] getArr_card() {
        return arr_card;
    }

    public static int getHigh_score() {
        return high_score;
    }

    public Scanner getIn() {
        return in;
    }
   
   Scanner in =new Scanner (System.in); 
   public Game(){
       for (int y=0;y<4;y++){
           arr_player[y]= new Player (" ",false);
        //   this.arr_player[y].setScore(0);
         //  this.arr_player[y].setWon(false);
       }
       for(int q=0;q<52;q++){
          arr_card[q]=new Card(0,0,0);
          // this.arr_card[q].setSuit(0);
          // this.arr_card[q].setValue(0);
           
           
       }
   }
   public  void generat_card_deck(){
       this.generat_rank();
       this.generat_suit();
       this.generat_value();
     // this.generat_number2();
   }
   void generat_number2(){
              int counter =0 ;
       for(int z=0;z<4;z++){
           for(int q=0;q<13;q++){
               int value=(q>=10)?10:q+1;
               Card kard =new Card(z,value,q);
               this.arr_card[counter]=kard;
               counter++;
               
               
           }
       }
       
   }
   void take_names(){
       System.out.println("please enter your names ");
       System.out.print("The first player_name is : ");
       String player1 =in.nextLine();System.out.println("");
       this.arr_player[0].setName(player1);
       System.out.print("The secound  player_name is : ");
       String player2 =in.nextLine();System.out.println("");
       this.arr_player[1].setName(player2);
       System.out.print("The third player_name is : ");
       String player3 =in.nextLine();System.out.println("");
       this.arr_player[2].setName(player3);
       System.out.print("The delar_player_name is : ");
       String player4 =in.nextLine();System.out.println("");
       this.arr_player[3].setName(player4);
       
   }   

   void generat_suit(){
       for(int i=0;i<52;i++){
           if((i<13)&&(i>=0)){
               this.arr_card[i].setSuit(0);
               
           }
             if((i<26)&&(i>=13)){
               this.arr_card[i].setSuit(1);
               
           }
               if((i<39)&&(i>=26)){
               this.arr_card[i].setSuit(2);
               
           }
                 if((i<52)&&(i>=39)){
               this.arr_card[i].setSuit(3);
               
           }
       }
   }
      void generat_value(){
       for(int g=0;g<52;g++){
           if((g<13)&&(g>=0)){
               if((g>=0)&&(g<=9)){
                 this.arr_card[g].setValue(g+1);
                 
               }
               else if((g>=10)&&(g<13)){
                    this.arr_card[g].setValue(10);
               }
             
               }
            if((g<26)&&(g>=13)){
                 if((g>=13)&&(g<=22)){
                    this.arr_card[g].setValue(g-12);
                 
                                      }
                 else if((g>=23)&&(g<26)){
                    this.arr_card[g].setValue(10);
                                          }
               
                               }
             if((g<=39)&&(g>=26)){
                  if((g>=26)&&(g<=35)){
                    this.arr_card[g].setValue(g-25);
                 
                                      }
                 else if((g>=36)&&(g<=38)){
                    this.arr_card[g].setValue(10);
                                          }
               
                                  }
                 if((g<52)&&(g>=39)){
                     if((g>=39)&&(g<=48)){
                          this.arr_card[g].setValue(g-38);}
                     else if((g>=49)&&(g<=51)){
                         this.arr_card[g].setValue(10);}
                     
                         
                         
                         
                         
               
               
           }
             
               
           }
    
           }
      void generat_rank(){
          for(int x=0;x<=51;x++){
              if((x>=0)&&(x<=12)){
                  this.arr_card[x].setRank(x);
              }
              if((x>=13)&&(x<=25)){
                  this.arr_card[x].setRank(x-13);
              }
              if((x>=26)&&(x<=38)){
                  this.arr_card[x].setRank(x-26);
                  
              }
              if((x>=39)&&(x<=51)){
                  this.arr_card[x].setRank(x-39);
                  
              }
               }
          
          } 
      
      
      
      
      
      
      public Card generate_random_card(Card arr_card[]){
          Random randm=new Random ();
          Card new_card=new Card(0,0,0);
          
          boolean isnull=true;
          
          while(isnull){
              int rand = randm.nextInt(52);
              if(arr_card[rand]!=null){
                  
                  
                  isnull=false;
                  int new_card_rank,new_card_suit,new_card_value;
                    new_card_rank=arr_card[rand].getRank();
                    new_card_suit=arr_card[rand].getSuit();
                    new_card_value=arr_card[rand].getValue();
                    new_card.setSuit(new_card_suit);
                     new_card.setRank(new_card_rank);
                     new_card.setValue(new_card_value);
                    
                  arr_card[rand]=null;
                 
              }
                  
              }
     
              
            return new_card;  
          }
      public void give_every_play_2card(Game game){
          arr_player[0].add_Card(this.generate_random_card(this.getArr_card()));
          arr_player[0].add_Card(this.generate_random_card(this.getArr_card()));
          arr_player[1].add_Card(this.generate_random_card(this.getArr_card()));
          arr_player[1].add_Card(this.generate_random_card(this.getArr_card()));
          arr_player[2].add_Card(this.generate_random_card(this.getArr_card()));
          arr_player[2].add_Card(this.generate_random_card(this.getArr_card()));
          arr_player[3].add_Card(this.generate_random_card(this.getArr_card()));
          arr_player[3].add_Card(this.generate_random_card(this.getArr_card()));
      
      }
  
 public void check_high_score(){
     
     
        if(((this.arr_player[0].getScore()==21)&&(this.arr_player[1].getScore()==21))
           ||(((this.arr_player[0].getScore())==(this.arr_player[1].getScore()))&&((this.arr_player[0].getScore())==high_score))){    
                
       high_score =this.arr_player[0].getScore();
       this.push=true;
       
       
                    }
            else if(((this.arr_player[0].getScore()==21)&&(this.arr_player[2].getScore()==21))
                  ||(((this.arr_player[0].getScore())==(this.arr_player[1].getScore()))&&
                    ( ((this.arr_player[1].getScore())==(this.arr_player[2].getScore()))&&((this.arr_player[0].getScore())==high_score)) 
                    )){ 
                       high_score =this.arr_player[0].getScore();
                         this.push=true;
       
                       }
                 else if(((this.arr_player[1].getScore()==21)&&(this.arr_player[2].getScore()==21))
                       ||((this.arr_player[1].getScore())==(this.arr_player[2].getScore())) &&((this.arr_player[1].getScore())==high_score))  
                          {
                               high_score =this.arr_player[1].getScore();
       
                                   this.push=true;
                                   
                                   
                                   
                                   
                               }
                else  if(((this.arr_player[0].getScore())>(this.arr_player[1].getScore()))
                          &&((this.arr_player[2].getScore())>21)
                          && ((this.arr_player[0].getScore())<22)
                          ){
                      high_score =this.arr_player[0].getScore();
                      index_high_score =0;
                  }
                   else if(((this.arr_player[0].getScore())>(this.arr_player[2].getScore()))
                          &&((this.arr_player[1].getScore())>21)
                          && ((this.arr_player[0].getScore())<22)
                            ){
                      high_score =this.arr_player[0].getScore();
                      index_high_score =0;
                  }
                    else  if(((this.arr_player[1].getScore())>(this.arr_player[0].getScore()))
                          &&((this.arr_player[2].getScore())>21)
                          && ((this.arr_player[1].getScore())<22)  
                              ){
                      high_score =this.arr_player[1].getScore();
                      index_high_score =1;
                  }
                   else    if(((this.arr_player[1].getScore())>(this.arr_player[2].getScore()))
                          &&((this.arr_player[0].getScore())>21)
                          && ((this.arr_player[1].getScore())<22)     
                               ){
                      high_score =this.arr_player[1].getScore();
                      index_high_score =1;
                  }
                      else if(((this.arr_player[2].getScore())>(this.arr_player[0].getScore()))
                          &&((this.arr_player[1].getScore())>21)
                          && ((this.arr_player[2].getScore())<22)          
                                    ){
                      high_score =this.arr_player[2].getScore();
                      index_high_score =2;
                  }
                    else   if(((this.arr_player[2].getScore())>(this.arr_player[1].getScore()))
                          &&((this.arr_player[0].getScore())>21)
                          && ((this.arr_player[2].getScore())<22)       
                                   ){
                      high_score =this.arr_player[2].getScore();
                      index_high_score =2;
                  }
                           
                           
                           
                           
                           
 
         else  if(this.arr_player[0].getScore()==21){
                     high_score =this.arr_player[0].getScore();
                     index_high_score =0;
       
          }  
         else if(this.arr_player[1].getScore()==21){
                    high_score =this.arr_player[1].getScore();
                    index_high_score =1;
       
                                                    }
       else  if(this.arr_player[2].getScore()==21){
                 high_score =this.arr_player[2].getScore();
                 index_high_score =2;
       
                                              }   
         
         
         
         
         
         
         
         
          else  if((this.arr_player[0].getScore()<22)&&
           ((this.arr_player[1].getScore())>21)&&
           (((this.arr_player[2].getScore())>21))){
              high_score =this.arr_player[0].getScore();
              index_high_score =0;
         }
            
              else   if((this.arr_player[1].getScore()<22)&&
           ((this.arr_player[2].getScore())>21)&&
           (((this.arr_player[0].getScore())>21))){
              high_score =this.arr_player[1].getScore();
              index_high_score =1;
         }
                    else  if((this.arr_player[2].getScore()<22)&&
           ((this.arr_player[1].getScore())>21)&&
           (((this.arr_player[0].getScore())>21))){
              high_score =this.arr_player[2].getScore();
              index_high_score =2;
              
         }
         
         
         
         
         
         
         
         
         
         
       else  if((this.arr_player[0].getScore()<22)&&
           ((this.arr_player[0].getScore())>(this.arr_player[1].getScore()))&&
           (((this.arr_player[0].getScore())>(this.arr_player[2].getScore())))){
              high_score =this.arr_player[0].getScore();
              index_high_score =0;
         }
         else  if((this.arr_player[1].getScore()<22)&&
           ((this.arr_player[1].getScore())>(this.arr_player[0].getScore()))&&
           (((this.arr_player[1].getScore())>(this.arr_player[2].getScore())))){
             high_score =this.arr_player[1].getScore();
             index_high_score =1;
         }
          else   if((this.arr_player[2].getScore()<22)&&
           ((this.arr_player[2].getScore())>(this.arr_player[0].getScore()))&&
           (((this.arr_player[2].getScore())>(this.arr_player[1].getScore())))){
             high_score =this.arr_player[2].getScore();
             index_high_score =2;
         }
             
   
   
   
   
   
   
 }
 public void three_player(GUI gui){
     int m;
     int b;
     for (  m=0;m<3;m++){
         System.out.println("player"+(m+1)+" in his hand :"+this.arr_player[m].getScore());
     
         do{
             
               System.out.println("1)hit ");
               System.out.println("2)stand ");
                b=in.nextInt();
               switch (b){
                   case 1:{
                       Card add_card=new Card(this.generate_random_card(this.getArr_card()));
                      this.arr_player[m].add_Card(add_card);
                       gui.updatePlayerHand(add_card, m);
                   } 
                   
                   System.out.println("now player"+(m+1)+"has in his hand :"+this.arr_player[m].getScore());
                   this.arr_player[m].check_Busted();
                   break;
                   case 2:
                       break ;
         }}
         while((b!=2)&&(this.arr_player[m].getScore()<21));
         
     }
     this.check_high_score();
     
     }
     public void start_game(GUI gui){

         this.three_player(gui);
         this.check_high_score();
         System.out.println("player4 (delar) has in his hand :"+this.arr_player[3].getScore());
         while((this.arr_player[3].getScore()<=high_score)){
             Card new3_card=new Card(this.generate_random_card(this.getArr_card()));
             this.arr_player[3].add_Card(new3_card);
             gui.updateDealerHand(new3_card, this.arr_card);
              System.out.println(" now player4 (delar) has in his hand :"+this.arr_player[3].getScore());
         }
         if((this.isPush()==true)&&(this.arr_player[3].getScore()>high_score)){
             if((this.arr_player[3].getScore()>21)){
             System.out.println("Push");
             }
             else if((this.arr_player[3].getScore()<21)){
                 System.out.println("the winner is : player 4 (delar) ");
                 
             }
         }
         else if (this.arr_player[3].getScore()<=21){
             System.out.println("the winner is : player 4 (delar) Black jack ");
         }
         else {
              
             System.out.println("the winner is : player "+(index_high_score+1));
         }
             
                
  
      
      }
     
 }








    
