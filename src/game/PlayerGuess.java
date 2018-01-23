package game;
import JDKObjects.JDKObject;
public class 
    PlayerGuess 
    extends GameObject{
        //Methods
        @Override
        public String
            input(){
                return(PlayerInput.input()); //fix this??
            }
        //Objects
        private final JDKObject
            PlayerInput;
        //Constructors
        public 
            PlayerGuess(JDKObject playerInput) {
                PlayerInput = playerInput;
            }
}
