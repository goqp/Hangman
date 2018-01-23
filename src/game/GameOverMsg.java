package game;
import game.Deprecated.ConsuleOut;
import game.GameObject;
public class GameOverMsg 
    extends GameObject {
        private final ConsuleOut Consule;           
        public GameOverMsg() {
            Consule = new ConsuleOut();            
        }
        @Override public GameObject print() {
            Consule.consuleMsg("\n\nGame over!");
            return(this);
        }
}
