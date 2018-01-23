package JDKObjects;
import java.util.Scanner;
public class 
    Keyboard
    extends JDKObject{
    
        @Override 
            public String 
            input() {
                return(Scanner.next());
            } 
            
        @Override 
            public JDKObject 
            close() {
                Scanner.close();
                return(this);
            } 
            
            private final Scanner Scanner;         
            
            public
            Keyboard(){
                this.Scanner = new Scanner(System.in);
            }    
    }
