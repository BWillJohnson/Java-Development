import java.time.LocalDate;

public class userInterface<B extends FixedList> {
    public static void main(String[] args) {
        FixedList<Integer> num = new FixedList<>(3);
        num.add(10);
        num.add(3);
        num.add(92);
       // num.add(43);

        System.out.println(num.getItems().size());
        System.out.println("==================================");
        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        //dates.add(15);

    }
}
