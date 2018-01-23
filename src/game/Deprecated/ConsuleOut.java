package game.Deprecated;
import game.GameObject;
public class ConsuleOut
    extends GameObject{
        @Override public GameObject print(String msg) { 
            System.out.print(msg);
            return(this);
        }         
        //fix this        
        @Override public GameObject consuleMsg(String msg) { 
            System.out.print(msg);
            return(this);
        }     
        @Override public GameObject consuleMsg(GameObject msg) {
            System.out.print(msg);
            return(this);
        }               
}
