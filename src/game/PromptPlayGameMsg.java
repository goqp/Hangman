package game;
import game.Deprecated.ConsuleOut;
import game.GameObject;
public class PromptPlayGameMsg 
    extends GameObject {
        private final ConsuleOut Consule;     
        private final int Turns;
        public PromptPlayGameMsg(int turns) {
            Consule = new ConsuleOut(); 
            Turns = turns;
        }
        @Override public GameObject print() {
            Consule.consuleMsg(String.format("\nLet's Play Hangman! You have %s tries!", String.valueOf(Turns)));
            return(this);
        }
}
