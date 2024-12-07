
import java.util.ArrayList;
import java.util.List;

public class FixedList<B>{
    private List<B> items;
   private int maxSize;

    public FixedList( int maxSize) {
       this.maxSize = maxSize;
       this.items = new ArrayList<>();
    }
    public int getMaxSize() {
        return maxSize;
    }
    public void add(B item){
           if (items.size() < maxSize) {
               items.add(item);
               System.out.println("Notice item has been added to the list.");
           } else{
               throw new IllegalStateException("Your item can not be added ");
           }

    }
    public List<B> getItems() {
        return items;
    }

}
