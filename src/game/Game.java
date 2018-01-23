package game;
import game.word.Word;
import JDKObjects.Keyboard;  

public class Game 
extends GameObject{
    
    // methods       
   @Override 
       public GameObject 
       gameStart(){
           new PromptPlayGameMsg(Board.maxTurns()).print(); //fix
           Player.gameStart();
           return(this);
       }  
       
   @Override 
       public GameObject 
       gameOver(){
           new GameOverMsg().print(); //fix
           Player.gameOver();               
           return(this);
       }   
       
   @Override 
       public GameObject 
       newRound(){
           new PromptPlayRoundMsg(Board.turns()).print(); //fix
           Player.newRound();               
           return(this);
       }       
       
   @Override 
       public Game 
       playerGuessed(GameObject guess){
           Word.playerGuessed(guess.input());            //fix
           Board.playerGuessed(guess.input());       //fix
           return(this);
       } 
       
       // factory methods               
       private Player
       player(){
           return(
               new Player(this, new Keyboard())      
           );
       }
       
       // objects             
       private final GameObject  Word;   
       private final GameObject Board = new Scoreboard(this);      
       private final GameObject Player;     
       
       // constructors         
       public 
       Game(){
           Word = new Word(this).letter("c").letter("a").letter("r").letter("p"); //fix this
           Player = player();          
       }        
    }
