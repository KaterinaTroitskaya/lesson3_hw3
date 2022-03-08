package hw3;
import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruitsInBox = new ArrayList();
    private int boxweight = 0;

    public Box() {
        this.fruitsInBox = fruitsInBox;
        this.boxweight = 0;
    }
    public void add(T fruit){
        fruitsInBox.add(fruit);

    }
    public int getWeigth () {
        if (this.fruitsInBox.isEmpty()) {
            return boxweight = 0;
        } else {
            for (int i = 0; i < this.fruitsInBox.size(); i++) {

                Fruit fruit = this.fruitsInBox.get(i);
                this.boxweight = this.boxweight + fruit.getWeight();
            }
            return boxweight;
        }
    }
    public void move(Box box1, Box box2){
        box2.fruitsInBox.addAll(box1.fruitsInBox);
        box1.fruitsInBox.removeAll(box1.fruitsInBox);
    }
}
