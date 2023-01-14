import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitPick extends JFrame implements ActionListener{
    
    String[] fruitType={"Select","Apple","Orange","Banana","Cherries","Strawberries"};
    JComboBox typeOfFruit=new JComboBox(fruitType);
    JLabel per100g=new JLabel();
    JLabel fruitStats=new JLabel();
    JLabel yourChoice=new JLabel();
    JButton confirm=new JButton("Confirm");
    JLabel chart=new JLabel();
    ImageIcon fruit1=new ImageIcon("Fruit1.png");
    ImageIcon fruit2=new ImageIcon("Fruit2.png");
    ImageIcon fruit3=new ImageIcon("Fruit3.png");
    ImageIcon fruit4=new ImageIcon("Fruit4.png");
    ImageIcon fruit5=new ImageIcon("Fruit5.png");
    JLabel recServing=new JLabel();

    FruitPick(){
        
        this.setSize(550,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);

        typeOfFruit.setSize(100, 30);
        typeOfFruit.setLocation(70, 50);
        typeOfFruit.setSelectedIndex(0);
        typeOfFruit.addActionListener(this);

        per100g.setSize(150,150);
        per100g.setLocation(10, 100);
        per100g.setFont(new Font("Tahoma",Font.BOLD,12));

        chart.setSize(300,150);
        chart.setLocation(200,100);
        chart.setVisible(true);

        recServing.setSize(300,25);
        recServing.setLocation(200, 300);
        recServing.setFont(new Font("Tahoma",Font.BOLD,12));

        fruitStats.setSize(150,150);
        fruitStats.setLocation(10, 250);
        fruitStats.setFont(new Font("Tahoma",Font.BOLD,12));

        yourChoice.setSize(250, 150);
        yourChoice.setLocation(10,365);
        yourChoice.setFont(new Font("Tahoma",Font.BOLD,12));

        confirm.setSize(100, 25);
        confirm.setLocation(70,20);
        confirm.setFont(new Font("Tahoma",Font.BOLD,12));
        confirm.addActionListener(this);
        confirm.setFocusable(false);


        this.add(typeOfFruit);
        this.add(per100g);
        this.add(recServing);
        this.add(chart);
        this.add(fruitStats);
        this.add(confirm);
        this.add(yourChoice);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==confirm){
            FoodCategoryPick FCP=new FoodCategoryPick();
        }
        
        JComboBox cb=(JComboBox)e.getSource();
        String fruitType=(String)cb.getSelectedItem();
       switch(fruitType){
        
        case "Apple":
        per100g.setText("<html>Per 100g:<br>Calories: 52<br> Fat: 0.2g<br>Cholesterol: 0mg<br>Sodium: 1mg<br>Potassium: 107mg<br>Carbs: 14g<br>Fiber: 2.4g<br>Sugars: 10g<br>Protein: 0.3g</html>");
        fruitStats.setText("<html>Vitamins:<br>Iron: 0.7%<br>Vitamin A: 1.1%<br>Vitamin C: 7.7%<br>Calcium: 0.5%</html>");
        yourChoice.setText("You chose: Apple");
        recServing.setText("<html>Recommended serving: 1 medium apple per day<br>do not eat both dessert and fruit in one meal</html>");
        chart.setIcon(fruit1);

        break;
        
        case "Orange":
        per100g.setText("<html>Per 100g:<br>Calories: 49<br> Fat: 0.2g<br>Cholesterol: 0mg<br>Sodium: 1mg<br>Potassium: 166mg<br>Carbs: 13g<br>Fiber: 2.2g<br>Sugars: 8.5g<br>Protein: 0.9g</html>");
        fruitStats.setText("<html>Vitamins:<br>Iron: 0.7%<br>Vitamin A: 4.9%<br>Vitamin C: 99%<br>Calcium: 3.3%</html>");
        yourChoice.setText("You chose: Orange");
        recServing.setText("<html>Recommended serving: 1 navel orange per day<br>do not eat both dessert and fruit in one meal</html>");
        chart.setIcon(fruit2);
        break;
        
        case "Banana":
        per100g.setText("<html>Per 100g:<br>Calories: 89<br> Fat: 0.3g<br>Cholesterol: 0mg<br>Sodium: 1mg<br>Potassium: 358mg<br>Carbs: 23g<br>Fiber: 2.6g<br>Sugars: 12g<br>Protein: 1.1g</html>");
        fruitStats.setText("<html>Vitamins:<br>Iron: 1.4%<br>Vitamin A: 1.3%<br>Vitamin C: 15%<br>Calcium: 0.4%</html>");
        yourChoice.setText("You chose: Banana");
        recServing.setText("<html>Recommended serving: 1-2 per day<br>do not eat both dessert and fruit in one meal</html>");
        chart.setIcon(fruit3);
        break;
        
        case "Cherries":
        per100g.setText("<html>Per 100g:<br>Calories: 63<br> Fat: 0.2g<br>Cholesterol: 0mg<br>Sodium: 0mg<br>Potassium: 222mg<br>Carbs: 16g<br>Fiber: 2.1g<br>Sugars: 13g<br>Protein: 1.1g</html>");
        fruitStats.setText("<html>Vitamins:<br>Iron: 2%<br>Vitamin A: 1.3%<br>Vitamin C: 12%<br>Calcium: 1%</html>");
        yourChoice.setText("You chose: Cherries");
        recServing.setText("<html>Recommended serving: 14 cherries<br>do not eat both dessert and fruit in one meal</html>");
        chart.setIcon(fruit4);
        break;
        
        case "Strawberries":
        per100g.setText("<html>Per 100g:<br>Calories: 32<br> Fat: 0.3g<br>Cholesterol: 0mg<br>Sodium: 1mg<br>Potassium: 153mg<br>Carbs: 7.7g<br>Fiber: 2g<br>Sugars: 4.9g<br>Protein: 0.7g</html>");
        fruitStats.setText("<html>Vitamins:<br>Iron: 2.3%<br>Vitamin A: 0.2%<br>Vitamin C: 98%<br>Calcium: 1.2%</html>");
        yourChoice.setText("You chose: Strawberries");
        recServing.setText("<html>Recommended serving: 7 strawberries<br>do not eat both dessert and fruit in one meal</html>");
        chart.setIcon(fruit5);
        break;
       }

       
    }

}
