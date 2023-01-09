import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarbsPick extends JFrame implements ActionListener{
    
    String[] carbTypes={"Potatoes","Rice","Bread(White)","Bread(Wholemeal)","Bread(Rye)","Bread(Granary)"};
    JComboBox typeOfCarb=new JComboBox(carbTypes);
    JLabel per100Grams=new JLabel();
    JLabel carbStats=new JLabel();

    CarbsPick(){

        this.setSize(250,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        typeOfCarb.setSize(100,25);
        typeOfCarb.setLocation(70, 50);
        typeOfCarb.setSelectedIndex(0);
        typeOfCarb.addActionListener(this);

        per100Grams.setSize(150,150);
        per100Grams.setLocation(10,150);
        per100Grams.setFont(new Font("Tahoma",Font.BOLD,12));

        carbStats.setSize(150, 150);
        carbStats.setLocation(10,300);
        carbStats.setFont(new Font("Tahoma",Font.BOLD,12));
        
        this.add(typeOfCarb);
        this.add(per100Grams);
        this.add(carbStats);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       JComboBox cb=(JComboBox)e.getSource();

       String carbType=(String)cb.getSelectedItem();

       switch(carbType){
        
        case "Potatoes":
        per100Grams.setText("<html>Per 100g:<br>Calories: 93<br>Fats: 0.1g<br>Cholesterol: 0mg<br>Sodium: 10mg<br>Potassium: 535mg<br>Carbs: 21g<br>Fiber: 2.2g<br>Sugars: 1.2g<br>Protein: 2.5g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 1.1%<br>Vitamin A: 0%<br>Vitamin C: 0%<br>Calcium: 0.8%</html>");
        
        break;

        case "Rice":
        per100Grams.setText("<html>Per 100g:<br>Calories: 130<br>Fats: 0.3g<br>Cholesterol: 0mg<br>Sodium: 1mg<br>Potassium: 35mg<br>Carbs: 28g<br>Fiber: 0.4g<br>Sugars: 0.1g<br>Protein: 2.7g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 6%<br>Vitamin A: 0.2%<br>Vitamin C: 16%<br>Calcium: 1.2%</html>");
        
        break;

        case "Bread(White)":
        per100Grams.setText("<html>Per 100g:<br>Calories: 266<br>Fats: 3.3g<br>Cholesterol: 0mg<br>Sodium: 490mg<br>Potassium: 126mg<br>Carbs: 49g<br>Fiber: 2.7g<br>Sugars: 5.7g<br>Protein: 8.9g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 20%<br>Vitamin A: 0%<br>Vitamin C: 0%<br>Calcium: 11%</html>");
        
        break;

        case "Bread(Wholemeal)":
        per100Grams.setText("<html>Per 100g:<br>Calories: 252<br>Fats: 3.5g<br>Cholesterol: 0mg<br>Sodium: 455mg<br>Potassium: 254mg<br>Carbs: 43g<br>Fiber: 6g<br>Sugars: 4.3g<br>Protein: 12g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 14%<br>Vitamin A: 0.1%<br>Vitamin C: 0%<br>Calcium: 12%</html>");
        
        break;

        case "Bread(Rye)":
        per100Grams.setText("<html>Per 100g:<br>Calories: 259<br>Fats: 3.3g<br>Cholesterol: 0mg<br>Sodium: 603mg<br>Potassium: 166mg<br>Carbs: 48g<br>Fiber: 5.8g<br>Sugars: 3.9g<br>Protein: 8.5g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 16%<br>Vitamin A: 0.1%<br>Vitamin C: 0.7%<br>Calcium: 5.6%</html>");
        
        break;

        case "Bread(Granary)":
        per100Grams.setText("<html>Per 100g:<br>Calories: 252<br>Fats: 3.5g<br>Cholesterol: 0mg<br>Sodium: 455mg<br>Potassium: 254mg<br>Carbs: 43g<br>Fiber: 6g<br>Sugars: 4.3g<br>Protein: 12g</html>");
        carbStats.setText("<html>Vitamins:<br>Iron: 14%<br>Vitamin A: 0.1%<br>Vitamin C: 0%<br>Calcium: 12%</html>");
        
        break;

       }

    }
}

