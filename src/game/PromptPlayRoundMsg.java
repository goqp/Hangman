package game;
import game.Deprecated.ConsuleOut;
import game.GameObject;
public class PromptPlayRoundMsg 
    extends GameObject {
        private final ConsuleOut Consule;     
        private final int Count;
        public PromptPlayRoundMsg(int count) {
            Consule = new ConsuleOut(); 
            Count = count;
        }
        @Override public GameObject print() {
            Consule.consuleMsg(String.format("\n\n*** Ready for guess #%s! ***", String.valueOf(Count)));
            return(this);
        }
}
