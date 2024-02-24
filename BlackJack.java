/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackjack;

/**
 *
 * @author hp
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI gui = new GUI();

        Game game =new Game ();
        game.generat_card_deck();
        game.take_names();
       game.give_every_play_2card(game);
       gui.runGUI( game.getArr_card(), game.arr_player[0].getArr_card(), game.arr_player[1].getArr_card(), game.arr_player[2].getArr_card(), game.arr_player[3].getArr_card() );
       game.start_game(gui);
        
        // TODO code application logic here
      //  
        System.out.println(game.generate_random_card(game.getArr_card()).getSuit());
        
        
        
        
        
        
        
    }
    
}
