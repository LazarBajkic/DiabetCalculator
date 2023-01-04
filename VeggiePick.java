import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VeggiePick extends JFrame implements ActionListener{
    
    String[] veggies={"Cucumber","Tomato","Olives","Turnip"};
    JComboBox typeOfVeggie=new JComboBox(veggies);
    JLabel veggieStatsPer100g=new JLabel();
    JLabel veggieStatsPerPortion=new JLabel();
    
    VeggiePick(){
        this.setSize(250,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        typeOfVeggie.setSize(100,30);
        typeOfVeggie.setLocation(70,50);
        typeOfVeggie.setSelectedIndex(0);
        typeOfVeggie.addActionListener(this);

        veggieStatsPer100g.setSize(750, 150);
        veggieStatsPer100g.setLocation(10, 100);
        veggieStatsPer100g.setFont(new Font("Tahoma",Font.BOLD,12));

        veggieStatsPerPortion.setSize(300, 150);
        veggieStatsPerPortion.setLocation(100, 300);
        veggieStatsPerPortion.setFont(new Font("Tahoma",Font.BOLD,12));

        this.add(veggieStatsPer100g);
        this.add(veggieStatsPerPortion);
        this.add(typeOfVeggie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JComboBox cb=(JComboBox)e.getSource();
        String veggieType=(String)cb.getSelectedItem();
        if(veggieType.equals("Cucumber")){
            veggieStatsPer100g.setText("<html>Per 100g: <br>Fats:0.1<br>Cholesterol 0mg<br>Sodium 2mg<br>Potassium 147mg<br>Carbs 3.6g<br>Fiber 0.5g<br>Sugars 1.7g<br>Protein 0.7g</html>");
        }
    }
}
