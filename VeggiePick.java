import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VeggiePick extends JFrame implements ActionListener{
    
    String[] veggies={"Cucumber","Tomato","Olives","Turnip"};
    JComboBox typeOfVeggie=new JComboBox(veggies);
    JLabel veggieStatsPer100g=new JLabel();
    JLabel veggieVitaminInfo=new JLabel();
    JLabel yourChoice=new JLabel();
    JButton confirm=new JButton("Confirm");
    JLabel chart=new JLabel();
    ImageIcon veggie1=new ImageIcon("Veggie1.png");
    ImageIcon veggie2=new ImageIcon("Veggie2.png");
    ImageIcon veggie3=new ImageIcon("Veggie3.png");
    ImageIcon veggie4=new ImageIcon("Veggie4.png");
    JLabel recServing=new JLabel();

    
    VeggiePick(){
        this.setSize(550,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        typeOfVeggie.setSize(100,30);
        typeOfVeggie.setLocation(70,50);
        typeOfVeggie.setSelectedIndex(0);
        typeOfVeggie.addActionListener(this);
        typeOfVeggie.setSelectedItem(veggies[0]);


        veggieStatsPer100g.setSize(150, 150);
        veggieStatsPer100g.setLocation(10, 100);
        veggieStatsPer100g.setFont(new Font("Tahoma",Font.BOLD,12));

        veggieVitaminInfo.setSize(150, 150);
        veggieVitaminInfo.setLocation(10, 250);
        veggieVitaminInfo.setFont(new Font("Tahoma",Font.BOLD,12));

        yourChoice.setSize(250, 150);
        yourChoice.setLocation(10,365);
        yourChoice.setFont(new Font("Tahoma",Font.BOLD,12));

        chart.setSize(300,150);
        chart.setLocation(200,100);
        chart.setVisible(true);

        recServing.setSize(300,25);
        recServing.setLocation(200, 300);
        recServing.setFont(new Font("Tahoma",Font.BOLD,12));

        confirm.setSize(100, 25);
        confirm.setLocation(70,20);
        confirm.setFont(new Font("Tahoma",Font.BOLD,12));
        confirm.addActionListener(this);
        confirm.setFocusable(false);

        this.add(veggieStatsPer100g);
        this.add(veggieVitaminInfo);
        this.add(confirm);
        this.add(yourChoice);
        this.add(recServing);
        this.add(chart);
        this.add(typeOfVeggie);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
        if(e.getSource()==confirm){
            FoodCategoryPick FCP=new FoodCategoryPick();
        }

        JComboBox cb=(JComboBox)e.getSource();
        String veggieType=(String)cb.getSelectedItem();

        switch(veggieType){
            
            case "Cucumber":
                veggieStatsPer100g.setText("<html>Per 100g:<br>Calories: 15<br>Fats:0.1g<br>Cholesterol: 0mg<br>Sodium: 2mg<br>Potassium: 147mg<br>Carbs: 3.6g<br>Fiber: 0.5g<br>Sugars: 1.7g<br>Protein: 0.7g</html>");
                veggieVitaminInfo.setText("<html>Vitamins:<br>Iron: 1.6%<br>Vitamin A: 2.1%<br>Vitamin C: 4.7%<br>Calcium: 1.2%</html>");
                yourChoice.setText("You chose: Cucumber");
                recServing.setText("Recommended serving: Your choice");
                chart.setIcon(veggie1);
                break;
            
            case "Tomato":
                veggieStatsPer100g.setText("<html>Per 100g:<br>Calories: 18<br>Fats: 0.2g<br>Cholesterol: 0mg<br>Sodium: 5mg<br>Potassium: 237mg<br>Carbs: 3.9g<br>Fiber: 1.2g<br>Sugars: 2.6g<br>Protein: 0.9g</html>");
                veggieVitaminInfo.setText("<html>Vitamins:<br>Iron: 1.5%<br>Vitamin A: 17%<br>Vitamin C: 23%<br>Calcium: 0.8%</html>");
                yourChoice.setText("You chose: Tomato");
                recServing.setText("Recommended serving: 200g (7 oz)");
                chart.setIcon(veggie2);
                break;
            
            case "Olives":
                veggieStatsPer100g.setText("<html>Per 100g:<br>Calories: 115<br>Fats: 11g<br>Cholesterol: 0mg<br>Sodium: 735mg<br>Potassium: 8mg<br>Carbs: 6.3g<br>Fiber: 3.2g<br>Sugars: 0g<br>Protein: 0.8g</html>");
                veggieVitaminInfo.setText("<html>Vitamins:<br>Iron: 18%<br>Vitamin A: 8.1%<br>Vitamin C: 1.5%<br>Calcium: 6.8%</html>");
                yourChoice.setText("You chose: Olives");
                recServing.setText("Recommended serving: 25g (6-7 olives)");
                chart.setIcon(veggie3);
                break;
            
            case "Turnip":
                veggieStatsPer100g.setText("<html>Per 100g:<br>Calories: 22<br>Fats: 0.1g<br>Cholesterol: 0mg<br>Sodium: 16mg<br>Potassium: 177mg<br>Carbs: 5.1g<br>Fiber: 2g<br>Sugars: 3g<br>Protein: 0.7g</html>");
                veggieVitaminInfo.setText("<html>Vitamins:<br>Iron: 1%<br>Vitamin A: 0%<br>Vitamin C: 19%<br>Calcium: 2.5%</html>");
                yourChoice.setText("You chose: Turnip");
                recServing.setText("Recommended serving: 80g (one scoop)");
                chart.setIcon(veggie4);
                break;
        }
        
       
        }

    }
