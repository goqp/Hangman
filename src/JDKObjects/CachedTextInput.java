package JDKObjects;
public class 
    CachedTextInput
    extends JDKObject{
        @Override 
            public String 
            input() {
                return(Memory);
            } 
        @Override 
            public JDKObject 
            close() {
                return(TextInput.close());
            }   
            //objects
            private final String Memory;    
            private final JDKObject TextInput;
            //constructors
            public 
            CachedTextInput(JDKObject textInput) {
                    Memory = textInput.input();
                    TextInput = textInput;
                }
    }
