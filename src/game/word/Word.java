package game.word;
import game.GameObject;
import java.util.ArrayList;
import java.util.List;
public class Word 
    extends GameObject{    
    @Override public GameObject letter(String letter){
        add(letter);
        return(this);
    }
    @Override public GameObject playerGuessed(String letter){
        decode(letter);   
        this.printWord();
        return(this);
    }     
    @Override public GameObject hit(GameObject letter){ 
        Game.hit(letter);
        return(this);
    }
    @Override public GameObject miss(GameObject letter){
        Game.hit(letter);        
        return(this);
    }    
    private void add(String letter){
        Index index = new Index();
        this.Letters.add(
            index.update( 
                new Secret(letter, this, index)
            )
        );          
    }  
    private void decode(String letter){
        this.Letters.forEach(
            (GameObject l) -> {l.playerGuessed(letter);}
        );
    }
    private void printWord(){ //move this to message
        System.out.print("The word is: ");
        this.Letters.forEach(
            (GameObject l) -> {l.print(); System.out.print(" ");}
        );
    }    
    public Word(GameObject game){
        this.Game = game;
    }   
    private final List<GameObject> Letters = new ArrayList();
    private final GameObject Game;    
}
