package JDKObjects;

public class ConsuleText
extends JDKObject{
    
    @Override
        public JDKObject 
        display(){
            System.out.print(Memory);
            return (this);
        }

        private final String Memory;   
        
        public 
        ConsuleText(String pattern, Object... strings) {
            Memory = String.format(pattern, strings);
        }
        
}
