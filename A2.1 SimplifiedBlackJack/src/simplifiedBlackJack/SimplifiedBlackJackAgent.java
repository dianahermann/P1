// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simplifiedBlackJack;


import cards.*;
import cards.Card.*;
import static cards.Card.*;
import static cards.Card.Constant.*;

import java.util.Scanner;

/* 
 * @author  Diana Hermann
 * @version 2024/05/04
 */
public class SimplifiedBlackJackAgent {

    //access to other classes
    Card card;
    Deck deck;
    
    Scanner scan = new Scanner(System.in);

    int userPoints; //total points of the user
    int valueCard; //card value explicit for BlackJack
    

    /**
     * "Play" Black Jack
     */
    public void playBlackJack(){

        //start with a new deck
        deck = new Deck();
        
        System.out.printf("Deine Runde Blackjack startet\n\n"); //introduction

        boolean keepPlaying = true;

        while (keepPlaying && userPoints < 21) {

            //let user decide whether he wants to draw another card
            System.out.println("Möchtest du eine Karte ziehen? (ja/nein)");
            String userInput = scan.nextLine().toLowerCase();
            
            keepPlaying = userInput.equals("ja");

            if (keepPlaying) {
                card = deck.deal(); //deals a new card
                System.out.printf("► Du hast eine " + card + " gezogen! ◄\n"); //prints out drawn card

                //changes value from card class to required value for BlackJack
                switch(card.getRank()) {
                    case TWO : valueCard = 2; break;
                    case THREE : valueCard = 3; break;
                    case FOUR : valueCard = 4; break;
                    case FIVE : valueCard = 5; break;
                    case SIX : valueCard = 6; break;
                    case SEVEN : valueCard = 7; break;
                    case EIGHT : valueCard = 8; break;
                    case NINE : valueCard = 9; break;
                    case TEN, JACK, QUEEN, KING: valueCard = 10; break;
                    case ACE : valueCard = 11; break;
                    default : assert false: "card got no value";
                }

                userPoints += valueCard; //add card value to user points
                System.out.printf("Der Wert der Karte beträgt " + valueCard);
                System.out.printf(", deine Punktzahl beträgt " + userPoints + "\n\n");
            }

            //check if points above 21
            if (userPoints > 21) {
                System.out.println("LOST");
                keepPlaying = false;  //game ends
            }
        }

            System.out.println("Du hast die Runde mit " + userPoints + " Punkten beendet.");
        }
    }
