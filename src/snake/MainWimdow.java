package snake;


import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class MainWimdow extends JFrame{
    public MainWimdow(){
    setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setVisible(true);
    }
    public static void main(String[] args) {
        MainWimdow mw=new MainWimdow();
    }
   
}
