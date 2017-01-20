package toystorymatchinggame;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Board extends JFrame{
    private ArrayList <Card> deck = new ArrayList();
    private ArrayList <Card> action = new ArrayList();
    private ArrayList <JButton> buttons = new ArrayList();
    private ArrayList <Icon> images = new ArrayList();
    int pairs = 3;
    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Card card5;
    private Card card6; 
    private Card card7;
    private Card card8;
    private Card card9;
    private Card card10;
    private Card card11;
    private Card card12;
    private Card card13;
    private Card card14; 
    private Card card15;
    private Card card16;
    private Card card17;
    private Card card18;
    private Card card19;
    private Card card20;
    private Card card21;
    private Card card22;
    private Card card23;
    private Card card24;
    private Card c1;
    private Card c2;
    private Card currentCard;
    private int count;
    Icon woody = new ImageIcon(getClass().getResource("woody.png"));
    Icon alien = new ImageIcon(getClass().getResource("alien.png"));
    Icon buzz = new ImageIcon(getClass().getResource("buzz.png"));
    Icon toystory = new ImageIcon(getClass().getResource("toystory.png"));
    Icon jessie = new ImageIcon(getClass().getResource("jessie.png"));
    Icon dog = new ImageIcon(getClass().getResource("dog.png"));
    Icon horse = new ImageIcon(getClass().getResource("horse.png"));
    Icon alltoystory = new ImageIcon(getClass().getResource("alltoystory.png"));
    Icon girlhead = new ImageIcon(getClass().getResource("girlhead.png"));
    Icon dino = new ImageIcon(getClass().getResource("dino.png"));
    Icon pig = new ImageIcon(getClass().getResource("pig.png"));
    Icon littlebo = new ImageIcon(getClass().getResource("littlebo.png"));
    Icon potatohead = new ImageIcon(getClass().getResource("potatohead.png"));
    Icon penguin = new ImageIcon(getClass().getResource("penguin.png"));
    
    
    public Board() {
        images.add(woody);
        images.add(buzz);
        images.add(alien);
        images.add(jessie);
        images.add(dog);
        images.add(horse);
        images.add(girlhead);
        images.add(dino);
        images.add(pig);
        images.add(littlebo);
        count = 0;
        card1 = new Card("woody", woody);
        card1.setIcon(alltoystory);
        deck.add(card1);
        card1.setActionCommand("card1");
        card2 = new Card("woody", woody);
        card2.setIcon(alltoystory);
        deck.add(card2);
        card2.setActionCommand("card2");
        card3 = new Card("buzz", buzz);
        card3.setIcon(alltoystory);
        deck.add(card3);
        card3.setActionCommand("card3");
        card4 = new Card("buzz", buzz);
        card4.setIcon(alltoystory);
        deck.add(card4);
        card4.setActionCommand("card4");
        card5 = new Card("alien",  alien);
        card5.setIcon(alltoystory);
        deck.add(card5);
        card5.setActionCommand("card5");
        card6 = new Card("alien", alien);
        card6.setIcon(alltoystory);
        deck.add(card6);
        card6.setActionCommand("card6");
        card7 = new Card("jessie", jessie);
        card7.setIcon(alltoystory);
        deck.add(card7);
        card7.setActionCommand("card7");
        card8 = new Card("jessie", jessie);
        card8.setIcon(alltoystory);
        deck.add(card8);
        card8.setActionCommand("card8");
        card9 = new Card("dog", dog);
        card9.setIcon(alltoystory);
        deck.add(card9);
        card9.setActionCommand("card9");
        card10 = new Card("dog", dog);
        card10.setIcon(alltoystory);
        deck.add(card10);
        card10.setActionCommand("card10");
        card11 = new Card("horse", horse);
        card11.setIcon(alltoystory);
        deck.add(card11);
        card11.setActionCommand("card11");
        card12 = new Card("horse", horse);
        card12.setIcon(alltoystory);
        deck.add(card12);
        card12.setActionCommand("card12");
        card13 = new Card("girlhead", girlhead);
        card13.setIcon(alltoystory);
        deck.add(card13);
        card13.setActionCommand("card13");
        card14 = new Card("girlhead", girlhead);
        card14.setIcon(alltoystory);
        deck.add(card14);
        card14.setActionCommand("card14");
        card15 = new Card("dino", dino);
        card15.setIcon(alltoystory);
        deck.add(card15);
        card15.setActionCommand("card15");
        card16 = new Card("dino", dino);
        card16.setIcon(alltoystory);
        deck.add(card16);
        card16.setActionCommand("card16");
        card17 = new Card("pig",  pig);
        card17.setIcon(alltoystory);
        deck.add(card17);
        card17.setActionCommand("card17");
        card18 = new Card("pig", pig);
        card18.setIcon(alltoystory);
        deck.add(card18);
        card18.setActionCommand("card18");
        card19 = new Card("littlebo", littlebo);
        card19.setIcon(alltoystory);
        deck.add(card19);
        card19.setActionCommand("card19");
        card20 = new Card("littlebo", littlebo);
        card20.setIcon(alltoystory);
        deck.add(card20);
        card20.setActionCommand("card20");
        card21 = new Card("potatohead",  potatohead);
        card21.setIcon(alltoystory);
        deck.add(card21);
        card21.setActionCommand("card21");
        card22 = new Card("potatohead", potatohead);
        card22.setIcon(alltoystory);
        deck.add(card22);
        card22.setActionCommand("card22");
        card23 = new Card("penguin", penguin);
        card23.setIcon(alltoystory);
        deck.add(card23);
        card23.setActionCommand("card23");
        card24 = new Card("penguin", penguin);
        card24.setIcon(alltoystory);
        deck.add(card24);
        card24.setActionCommand("card24");
        ButtonHandler buttonHandler = new ButtonHandler();
        for (int i = 0; i < deck.size(); i++) {
            deck.get(i).addActionListener(buttonHandler);
        }
        Collections.shuffle(deck);
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(4, 6));
        for (Card c : deck){
            pane.add(c);
        }
        setTitle("Memory Match");  
    }
    
    private class ButtonHandler implements ActionListener {
    public void actionPerformed( ActionEvent event )
        {
            
            for(int i=0; i <deck.size(); i++) {
                if(event.getActionCommand() == deck.get(i).getActionCommand()) {
                    currentCard = deck.get(i);
                    turnAround();
                    checkForMatch();
                }
            }
        }
            
    }
    
    public void turnAround() {
         if (c1 == null && c2 == null){
            c1 = currentCard;
            c1.setIcon(currentCard.getImage());
           
        }

        if (c1 != null && c1 != currentCard && c2 == null){
            c2 = currentCard;
            c2.setIcon(currentCard.getImage());
           
        }
    }
    public void checkForMatch() {
        if (c1 != null & c2 != null) {
             Timer timer = new Timer(500, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                        if(c1.getName() == c2.getName()) {
                            c1.setEnabled(false);
                            c1.setIsMatched(true);
                            c2.setEnabled(false);
                            c2.setIsMatched(true);
                            if(gameWon()) {
                                String[] options = {"Yes", "No"};
                                int selectedItem = JOptionPane.showOptionDialog(null, "You won! Would you like to play again?", "", JOptionPane.PLAIN_MESSAGE, 0, null, options, options[1]);
                                if (selectedItem == 0) {
                                    for (Card c : deck) {
                                        c.setIcon(alltoystory);
                                        c.setEnabled(true);
                                    }
                                    Collections.shuffle(deck);
                                }
                                else {
                                    dispose();
                                }
                            }
                            count++;
                        }
                        else {
                            c1.setIcon(alltoystory);
                            c2.setIcon(alltoystory);
                        }
                        c1 = null;
                        c2 = null;
                        }
                    });
              timer.setRepeats(false); 
              timer.start();
            
        }
    }
    public boolean gameWon() {
        for(Card c: this.deck){
            if (c.isIsMatched() == false){
                return false;
            }
        }
        return true;
    }
}
