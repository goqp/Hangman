package game.word;

import game.GameObject;

public class Secret 
    extends GameObject{
        @Override public GameObject playerGuessed(String letter){
            return(doA(letter).doB(letter));
        }
        @Override public GameObject print(){
            System.out.print(String.format(toString()));      
            return(this);
        }
        @Override public GameObject update(GameObject letter){return(this);}        
        @Override public String toString(){return ("_");}
        private Secret doA(String letter){
            if(this.Letter.equals(letter)){
                Word.hit(doC());
            }
            return this;
        }
        private Secret doB(String letter){
            if(!this.Letter.equals(letter)){
                Word.miss(this);
            }
            return this;
         }   
        private GameObject doC(){
            return(
                Index.update( 
                   new Known(Letter, Word) 
               )
           );
       } 
        public Secret(String letter, GameObject word, GameObject index) {
            this.Letter = String.valueOf(letter.charAt(0)); //clean up
            this.Word = word;
            this.Index = index;
        }     
        private final String Letter;
        private final GameObject Word;
        private final GameObject Index;        
}
