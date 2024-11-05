import com.pluralsight.finance.IValuable;

public abstract class FixedAssets implements IValuable{
String name;
double value;

    FixedAssets(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setValue(double value) {
        this.value = value;
    }
}

