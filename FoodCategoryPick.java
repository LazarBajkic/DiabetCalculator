import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FoodCategoryPick extends JFrame{
    
    JButton veggieBtn=new JButton();
    JButton fruitBtn=new JButton();
    JButton carbsBtn=new JButton();
    JButton sugarsBtn=new JButton();
    JButton fatsBtn=new JButton();
    JButton meatBtn=new JButton();
    JButton finalizeBtn=new JButton();
    JLabel optional=new JLabel();

    FoodCategoryPick(){
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        veggieBtn.setSize(130,25);
        veggieBtn.setLocation(50, 50);
        veggieBtn.setFocusable(false);
        veggieBtn.setFont(new Font("Tahoma",Font.BOLD,13));
        veggieBtn.setText("Pick a Veggie");
        veggieBtn.setBackground(Color.black);
        veggieBtn.setForeground(Color.ORANGE);

        fruitBtn.setSize(130,25);
        fruitBtn.setLocation(50, 80);
        fruitBtn.setFocusable(false);
        fruitBtn.setFont(new Font("Tahoma",Font.BOLD,13));
        fruitBtn.setText("Pick a fruit");
        fruitBtn.setBackground(Color.black);
        fruitBtn.setForeground(Color.orange);

        carbsBtn.setSize(130,25);
        carbsBtn.setLocation(50, 110);
        carbsBtn.setFocusable(false);
        carbsBtn.setFont(new Font("Tahoma",Font.BOLD,12));
        carbsBtn.setText("Pick your carbs");
        carbsBtn.setBackground(Color.black);
        carbsBtn.setForeground(Color.orange);

        optional.setText("optional:");
        optional.setSize(70, 25);
        optional.setLocation(50,130);
        optional.setFont(new Font("Tahoma",Font.BOLD,12));

        sugarsBtn.setSize(130,25);
        sugarsBtn.setLocation(50, 150);
        sugarsBtn.setFocusable(false);
        sugarsBtn.setFont(new Font("Tahoma",Font.BOLD,12));
        sugarsBtn.setText("Pick your sugars");
        sugarsBtn.setBackground(Color.black);
        sugarsBtn.setForeground(Color.orange);





        this.add(veggieBtn);
        this.add(fruitBtn);
        this.add(carbsBtn);
        this.add(optional);
        this.add(sugarsBtn);
        this.add(fatsBtn);
        this.add(meatBtn);
        this.add(finalizeBtn);
    }

}   
