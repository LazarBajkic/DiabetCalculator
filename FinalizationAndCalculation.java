import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FinalizationAndCalculation extends JFrame{
    
   JLabel veggieChoice=new JLabel();
   JLabel fruitChoice=new JLabel();
   JLabel carbsChoice=new JLabel();
   JLabel sugarsChoice=new JLabel();
   JLabel meatChoice=new JLabel();

    FinalizationAndCalculation(){
        
        this.setSize(250,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        veggieChoice.setSize(200,30);
        veggieChoice.setFont(new Font("Tahoma",Font.BOLD,12));
        veggieChoice.setLocation(10,20);

        fruitChoice.setSize(200,30);
        fruitChoice.setFont(new Font("Tahoma",Font.BOLD,12));
        fruitChoice.setLocation(10,80);

        carbsChoice.setSize(200,30);
        carbsChoice.setFont(new Font("Tahoma",Font.BOLD,12));
        carbsChoice.setLocation(10,140);

        sugarsChoice.setSize(200,30);
        sugarsChoice.setFont(new Font("Tahoma",Font.BOLD,12));
        sugarsChoice.setLocation(10,200);

        meatChoice.setSize(200,30);
        meatChoice.setFont(new Font("Tahoma",Font.BOLD,12));
        meatChoice.setLocation(10,260);

        this.add(veggieChoice);
        this.add(fruitChoice);
        this.add(carbsChoice);
        this.add(sugarsChoice);
        this.add(meatChoice);

    }
    public void myUpdateVeggie(String strVeggie) {
		veggieChoice.setText(strVeggie);
	}

    public void myUpdateFruit(String strFruit) {
		veggieChoice.setText(strFruit);
	}

    public void myUpdateCarb(String strCarb) {
		veggieChoice.setText(strCarb);
	}

    public void myUpdateSugar(String strSugar) {
		veggieChoice.setText(strSugar);
	}

    public void myUpdateMeat(String strMeat) {
		veggieChoice.setText(strMeat);
	}
}
