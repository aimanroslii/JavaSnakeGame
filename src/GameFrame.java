import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame(){

        // GamePanel panel = new GamePanel(); #shortcut version is below
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this .setLocationRelativeTo(null); //if we need to allocate the apps in middle
    }
    
}
