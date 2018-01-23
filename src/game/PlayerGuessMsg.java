package game;
import JDKObjects.JDKObject;
/*
*   I model text in the player's consule.
*/
public class PlayerGuessMsg 
extends GameObject{   
    @Override public GameObject
        playerGuessed() {            
            Text.display();
            return (this);
        } 
    private final JDKObject
        Text;
    public 
        PlayerGuessMsg(JDKObject text) {
            Text = text;
            playerGuessed();
        }
}


//        @Override public GameObject gameStart(){
//            ConsuleOut.printLine(String.format("\nLet's Play Hangman! You have %s tries!", String.valueOf(Board.maxTurns())));
//            newRound();
//            return(this);
//        }         
//        @Override public GameObject gameOver(){
//            ConsuleOut.printLine("\n\nGame over!");
//            return(this);
//        }          
//        @Override public GameObject newRound(){
//            ConsuleOut.printLine(String.format("\n\n*** Ready for guess #%s! ***", String.valueOf(Board.turns())));
//            return(this);
//        }    
