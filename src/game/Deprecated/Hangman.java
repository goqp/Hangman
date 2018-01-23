package game.Deprecated;

import game.GameObject;

public class Hangman
    extends GameObject{    
        @Override public GameObject playerGuessed(String letter){     
            return(this);
        }
        @Override public GameObject roundOver(){
            return(this);
        }     
        @Override public GameObject gameOver(){
           return(this);
        }            
        public Hangman(GameObject word, GameObject game) {
            Word = word;
            Game = game;    
        }    
        private final GameObject Word;
        private final GameObject Game;
}
