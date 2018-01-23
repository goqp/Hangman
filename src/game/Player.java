package game;
import JDKObjects.CachedTextInput;
import JDKObjects.ConsuleText;
import JDKObjects.JDKObject;

public class Player 
extends GameObject {   
    
    // methods
    @Override 
        public GameObject 
        gameStart(){
            newRound(); 
            return(this);
        } 
        
    @Override 
        public GameObject 
        gameOver(){
            PlayerInput.close();
            return(this);
        }    
        
    @Override 
        public GameObject 
        newRound(){
            this.playerGuessed(
                new PlayerGuess(
                    new CachedTextInput(
                        PlayerInput)));
            return(this);
        }   
        
    @Override
        public GameObject
        playerGuessed(GameObject guess){
            new PlayerGuessMsg(
                new ConsuleText(
                    "You guessed '%s'.\nFeeling lucky?\n", guess.input()));               
            Game.playerGuessed(guess);
            return(this);
        }
        
        // objects            
        private final JDKObject PlayerInput;  
        private final GameObject Game;
        
        // constructors
        public 
        Player(GameObject game, JDKObject playerInput) {
                PlayerInput = playerInput;
                Game = game;
            }        
        
    }
