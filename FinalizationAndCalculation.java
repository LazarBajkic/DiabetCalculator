import javax.swing.JFrame;
import javax.swing.JLabel;

public class FinalizationAndCalculation extends JFrame{
    
    private JLabel carbsChoice=new JLabel();
    private JLabel veggieChoice=new JLabel();

    FinalizationAndCalculation(){
        this.setSize(250,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);


    }
    public void myUpdate(String str) {
		carbsChoice.setText(str);
	}
}
