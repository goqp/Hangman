package game.word;

import game.GameObject;

public class Index 
        extends GameObject{
       @Override public GameObject playerGuessed(String letter){
           return(this.Letter.playerGuessed(letter));
        }        
       @Override public GameObject print(){
           return(this.Letter.print());
        }
       @Override public String toString(){
           return(this.Letter.toString());
        }
       @Override public GameObject update(GameObject letter){
           this.Letter = letter;
           return(this);
       }
        private GameObject Letter;       
}
