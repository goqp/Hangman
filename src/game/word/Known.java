package game.word;

import game.Deprecated.ConsuleOut;
import game.GameObject;

public class Known 
    extends GameObject{           
        @Override public String toString(){
            return (this.Letter); 
        }
        @Override public GameObject print(){
            new ConsuleOut().print(toString());
            return(this);
        }       
        public Known(String letter, GameObject word) {
            this.Letter = String.valueOf(letter.charAt(0)); //clean up
            this.Word = word;
        }        
        private final String Letter;
        private final GameObject Word;        
}
