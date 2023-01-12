import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SugarsPick extends JFrame implements ActionListener {
    
    String[] sugarType={"Cake","Chocolate","Ice cream"};
    JLabel per100g=new JLabel();
    JLabel sugarInfo=new JLabel();
    JComboBox typeOfSugar=new JComboBox(sugarType);
    JLabel yourChoice=new JLabel();
    JButton confirm=new JButton("Confirm");

    SugarsPick(){
        this.setSize(250,500);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);

        typeOfSugar.setSize(100,30);
        typeOfSugar.setSelectedIndex(0);
        typeOfSugar.setLocation(70, 50);
        typeOfSugar.addActionListener(this);
        typeOfSugar.setSelectedItem(sugarType[0]);

        per100g.setSize(150,150);
        per100g.setLocation(10,100);
        per100g.setFont(new Font("Tahoma",Font.BOLD,12));

        sugarInfo.setSize(150, 150);
        sugarInfo.setLocation(10,300);
        sugarInfo.setFont(new Font("Tahoma",Font.BOLD,12));

        yourChoice.setSize(250, 150);
        yourChoice.setLocation(10,365);
        yourChoice.setFont(new Font("Tahoma",Font.BOLD,12));

        confirm.setSize(100, 25);
        confirm.setLocation(70,20);
        confirm.setFont(new Font("Tahoma",Font.BOLD,12));
        confirm.addActionListener(this);
        confirm.setFocusable(false);

        this.add(typeOfSugar);
        this.add(sugarInfo);
        this.add(confirm);
        this.add(yourChoice);
        this.add(per100g);
    }


    public String returnSugar(){
        String sugarChoice=yourChoice.getText();
           return sugarChoice;
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
       
        if(e.getSource()==confirm){
            FoodCategoryPick FCP=new FoodCategoryPick();
        }
        
        JComboBox cb=(JComboBox)e.getSource();
        String sugarType=(String)cb.getSelectedItem();
        switch(sugarType){
            
            case "Cake":
            per100g.setText("<html>Per 100g: <br> Fat: 18g<br>Cholesterol: 75mg<br>Sodium: 269mg<br>Potassium: 53mg<br>Carbs: 56g<br>Fiber: 0.3g<br>Sugars: 42g<br>Protein: 3g</html>");
            sugarInfo.setText("<html>Vitamins:<br>Iron: 5.9%<br>Vitamin A: 2.2%<br>Vitamin C: 0%<br>Calcium: 4.8%</html>");
            yourChoice.setText("You Chose: Cake");
            typeOfSugar.setSelectedItem(0);
            
            FinalizationAndCalculation obj=new FinalizationAndCalculation();
            FruitPick Fp=new FruitPick();
            CarbsPick Cp=new CarbsPick();
            VeggiePick Vp=new VeggiePick();
            MeatPick Mp=new MeatPick();

            String meatChoice=Mp.ReturnMeat();
            String veggieChoice=Vp.veggieReturn();
            String carbChoice=Cp.carbReturn();
            String fruitChoice=Fp.fruitReturn();
            String pick=yourChoice.getText();

            obj.myUpdateCarb(carbChoice);
            obj.myUpdateMeat(meatChoice);
            obj.myUpdateVeggie(veggieChoice);
            obj.myUpdateSugar(pick);
            obj.myUpdateFruit(fruitChoice);
            obj.setVisible(true);

            Vp.dispose();
            Mp.dispose();
            Cp.dispose();
            Fp.dispose();

            break;
            
            case "Chocolate":
            per100g.setText("<html>Per 100g: <br> Fat: 30g<br>Cholesterol: 23mg<br>Sodium: 79mg<br>Carbs: 59g<br>Fiber: 3.4g<br>Sugars: 52g<br>Protein: 7.7g<br>Caffein: 20mg</html>");
            sugarInfo.setText("N/A");
            yourChoice.setText("You Chose: Chocolate");
            FinalizationAndCalculation obj2=new FinalizationAndCalculation();
            typeOfSugar.setSelectedItem(1);
            pick=yourChoice.getText();
            obj2.myUpdateSugar(pick);
            obj2.setVisible(true);
            

            FruitPick Fp2=new FruitPick();
            CarbsPick Cp2=new CarbsPick();
            VeggiePick Vp2=new VeggiePick();
            MeatPick Mp2=new MeatPick();

            String meatChoice2=Mp2.ReturnMeat();
            String veggieChoice2=Vp2.veggieReturn();
            String carbChoice2=Cp2.carbReturn();
            String fruitChoice2=Fp2.fruitReturn();

            obj2.myUpdateCarb(carbChoice2);
            obj2.myUpdateMeat(meatChoice2);
            obj2.myUpdateVeggie(veggieChoice2);
            obj2.myUpdateSugar(pick);
            obj2.myUpdateFruit(fruitChoice2);
            obj2.setVisible(true);

            Mp2.dispose();
            Cp2.dispose();
            Fp2.dispose();
            Vp2.dispose();

            break;
            
            case "Ice cream":
            per100g.setText("<html>Per 100g: <br> Fat: 11g<br>Cholesterol: 44mg<br>Sodium: 80mg<br>Potassium: 199mg<br>Carbs: 24g<br>Fiber: 0.7g<br>Sugars: 21g<br>Protein: 3.5g</html>");
            sugarInfo.setText("<html>Vitamins:<br>Iron: 0.5%<br>Vitamin A: 8.4%<br>Vitamin C: 1%<br>Calcium: 9.8%</html>");
            yourChoice.setText("You Chose: Ice cream");
            typeOfSugar.setSelectedItem(2);
            FinalizationAndCalculation obj3=new FinalizationAndCalculation();
            pick=yourChoice.getText();
            obj3.myUpdateSugar(pick);
            obj3.setVisible(true);

            FruitPick Fp3=new FruitPick();
            CarbsPick Cp3=new CarbsPick();
            VeggiePick Vp3=new VeggiePick();
            MeatPick Mp3=new MeatPick();

            String meatChoice3=Mp3.ReturnMeat();
            String veggieChoice3=Vp3.veggieReturn();
            String carbChoice3=Cp3.carbReturn();
            String fruitChoice3=Fp3.fruitReturn();

            obj3.myUpdateCarb(carbChoice3);
            obj3.myUpdateMeat(meatChoice3);
            obj3.myUpdateVeggie(veggieChoice3);
            obj3.myUpdateSugar(pick);
            obj3.myUpdateFruit(fruitChoice3);
            obj3.setVisible(true);

            Mp3.dispose();
            Cp3.dispose();
            Fp3.dispose();
            Vp3.dispose();

            break;
        }
        
        String pick=yourChoice.getText();
        FinalizationAndCalculation obj=new FinalizationAndCalculation();
        obj.myUpdateSugar(pick);
        obj.setVisible(true);
        obj.dispose();
    }   
}
