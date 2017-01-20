package toystorymatchinggame;
import javax.swing.Icon;
import javax.swing.JButton;

public class Card extends JButton{
    private Icon image;
    private String name;
    private boolean isMatched;

    public Card() {
        name = "";
    }
    public Card (String name, Icon image) {
        this.name = name;
        this.image = image;
    }
    public boolean isIsMatched() {
        return isMatched;
    }

    public void setIsMatched(boolean isMatched) {
        this.isMatched = isMatched;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
