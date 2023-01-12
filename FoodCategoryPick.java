import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FoodCategoryPick extends JFrame implements ActionListener{
    
    JButton veggieBtn=new JButton();
    JButton fruitBtn=new JButton();
    JButton carbsBtn=new JButton();
    JButton sugarsBtn=new JButton();
    JButton meatBtn=new JButton();
    JButton finalizeBtn=new JButton();
    JLabel optional=new JLabel();
    

    FoodCategoryPick(){
        this.setSize(250,500);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        veggieBtn.setSize(130,25);
        veggieBtn.setLocation(50, 50);
        veggieBtn.setFocusable(false);
        veggieBtn.setFont(new Font("Tahoma",Font.BOLD,10));
        veggieBtn.setText("Pick your veggies");
        veggieBtn.setBackground(Color.black);
        veggieBtn.setForeground(Color.ORANGE);
        veggieBtn.addActionListener(this);

        fruitBtn.setSize(130,25);
        fruitBtn.setLocation(50, 100);
        fruitBtn.setFocusable(false);
        fruitBtn.setFont(new Font("Tahoma",Font.BOLD,13));
        fruitBtn.setText("Pick your fruit");
        fruitBtn.setBackground(Color.black);
        fruitBtn.setForeground(Color.orange);
        fruitBtn.addActionListener(this);

        carbsBtn.setSize(130,25);
        carbsBtn.setLocation(50, 150);
        carbsBtn.setFocusable(false);
        carbsBtn.setFont(new Font("Tahoma",Font.BOLD,12));
        carbsBtn.setText("Pick your carbs");
        carbsBtn.setBackground(Color.black);
        carbsBtn.setForeground(Color.orange);
        carbsBtn.addActionListener(this);

        optional.setText("optional:");
        optional.setSize(70, 25);
        optional.setLocation(50,180);
        optional.setFont(new Font("Tahoma",Font.BOLD,12));

        sugarsBtn.setSize(130,25);
        sugarsBtn.setLocation(50, 210);
        sugarsBtn.setFocusable(false);
        sugarsBtn.setFont(new Font("Tahoma",Font.BOLD,11));
        sugarsBtn.setText("Pick your sugars");
        sugarsBtn.setBackground(Color.black);
        sugarsBtn.setForeground(Color.orange);
        sugarsBtn.addActionListener(this);

        meatBtn.setSize(130,25);
        meatBtn.setLocation(50, 260);
        meatBtn.setFocusable(false);
        meatBtn.setFont(new Font("Tahoma",Font.BOLD,11));
        meatBtn.setText("Pick your meat");
        meatBtn.setBackground(Color.black);
        meatBtn.setForeground(Color.orange);
        meatBtn.addActionListener(this);

        finalizeBtn.setSize(160,25);
        finalizeBtn.setLocation(36, 350);
        finalizeBtn.setFocusable(false);
        finalizeBtn.setFont(new Font("Tahoma",Font.BOLD,11));
        finalizeBtn.setText("Finalize and calculate");
        finalizeBtn.setBackground(Color.black);
        finalizeBtn.setForeground(Color.orange);
        finalizeBtn.addActionListener(this);

        this.add(veggieBtn);
        this.add(fruitBtn);
        this.add(carbsBtn);
        this.add(optional);
        this.add(sugarsBtn);
        this.add(meatBtn);
        this.add(finalizeBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==veggieBtn){
            VeggiePick VP=new VeggiePick();
            this.dispose();
        }
            else if(e.getSource()==fruitBtn){
                FruitPick FP=new FruitPick();
                this.dispose();
            }
            
            else if(e.getSource()==carbsBtn){
                CarbsPick CP=new CarbsPick();
                this.dispose();
            }

            else if(e.getSource()==sugarsBtn){
                SugarsPick SP=new SugarsPick();
                this.dispose();
            }

            else if(e.getSource()==meatBtn){
                MeatPick MP=new MeatPick();
                this.dispose();
            }

            else if(e.getSource()==finalizeBtn){
                MeatPick MP=new MeatPick();
                VeggiePick VP=new VeggiePick();
                SugarsPick SP=new SugarsPick();
                CarbsPick CP=new CarbsPick();
                FruitPick FP=new FruitPick();
                FinalizationAndCalculation FAC=new FinalizationAndCalculation();

                String SC=SP.returnSugar();
                String FC=FP.fruitReturn();
                String MC=MP.ReturnMeat();
                String VC=VP.veggieReturn();
                String CC=CP.carbReturn();

                FAC.myUpdateCarb(CC);
                FAC.myUpdateFruit(FC);
                FAC.myUpdateMeat(MC);
                FAC.myUpdateSugar(SC);
                FAC.myUpdateVeggie(VC);

                FP.dispose();
                CP.dispose();
                SP.dispose();
                VP.dispose();
                MP.dispose();
            }
    }

}   
