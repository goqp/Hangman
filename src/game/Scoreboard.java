package game;
public class Scoreboard 
    extends GameObject {
        @Override public GameObject playerGuessed(String letter){
            stepTurns();
            notifyIfNewRound();
            notifyIfGameEnd();
            return(this);
        }    
        @Override public int turns() {
            return(Turns);
        }        
        @Override public int maxTurns() {
            return(MaxTurns);
        }                
        private void stepTurns(){
            Turns++;
        }            
        private void notifyIfGameEnd(){ //move to rule
            if(Turns > MaxTurns){
                Game.gameOver();
            }
        }
        private void notifyIfNewRound(){ ///move to rulex
            if(Turns <= MaxTurns){
                Game.newRound();
            }
        }        
        public Scoreboard(GameObject game) {
            Game = game;    
            Turns = 1; //fix
            MaxTurns = 5; //fix            
        }
        private final GameObject Game;
        private int Turns;    //fix
        private final int MaxTurns; //fix            
}
