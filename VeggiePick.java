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
    JLabel veggieVitaminInfo=new JLabel();
    
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

        veggieStatsPer100g.setSize(150, 150);
        veggieStatsPer100g.setLocation(10, 100);
        veggieStatsPer100g.setFont(new Font("Tahoma",Font.BOLD,12));

        veggieVitaminInfo.setSize(150, 150);
        veggieVitaminInfo.setLocation(10, 250);
        veggieVitaminInfo.setFont(new Font("Tahoma",Font.BOLD,12));

        this.add(veggieStatsPer100g);
        this.add(veggieVitaminInfo);
        this.add(typeOfVeggie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        JComboBox cb=(JComboBox)e.getSource();
        String veggieType=(String)cb.getSelectedItem();

        switch(veggieType){
            
            case "Cucumber":
                veggieStatsPer100g.setText("<html>Per 100g: <br>Fats:0.1g<br>Cholesterol: 0mg<br>Sodium: 2mg<br>Potassium: 147mg<br>Carbs: 3.6g<br>Fiber: 0.5g<br>Sugars: 1.7g<br>Protein: 0.7g</html>");
                veggieVitaminInfo.setText("<html>Vitamins:<br>Iron: 1.6%<br>Vitamin A: 2.1%<br>Vitamin C: 4.7%<br>Calcium: 1.2%</html>");
            
                break;
            
            case "Tomato":
                veggieStatsPer100g.setText("<html>Per 100g: <br>Fats: 0.2g<br>Cholesterol: 0mg<br>Sodium: 5mg<br>Potassium: 237mg<br>Carbs: 3.9g<br>Fiber: 1.2g<br>Sugars: 2.6g<br>Protein: 0.9g</html>");
                veggieVitaminInfo.setText("<html>Vitamins:<br>Iron: 1.5%<br>Vitamin A: 17%<br>Vitamin C: 23%<br>Calcium: 0.8%</html>");
            
                break;
            
            case "Olives":
                veggieStatsPer100g.setText("<html>Per 100g: <br>Fats: 11g<br>Cholesterol: 0mg<br>Sodium: 735mg<br>Potassium: 8mg<br>Carbs: 6.3g<br>Fiber: 3.2g<br>Sugars: 0g<br>Protein: 0.8g</html>");
                veggieVitaminInfo.setText("<html>Vitamins:<br>Iron: 18%<br>Vitamin A: 8.1%<br>Vitamin C: 1.5%<br>Calcium: 6.8%</html>");
            
                break;
            
            case "Turnip":
                veggieStatsPer100g.setText("<html>Per 100g: <br>Fats: 0.1g<br>Cholesterol: 0mg<br>Sodium: 16mg<br>Potassium: 177mg<br>Carbs: 5.1g<br>Fiber: 2g<br>Sugars: 3g<br>Protein: 0.7g</html>");
                veggieVitaminInfo.setText("<html>Vitamins:<br>Iron: 1%<br>Vitamin A: 0%<br>Vitamin C: 19%<br>Calcium: 2.5%</html>");
            
                break;
        }

        }
    }
