import java.util.HashMap;
import java.util.Map;

public class CarHashMapExample{
  private String colar;
  private int price;
  private String model;
  private int yearofissue;

    public CarHashMapExample(String colar, int price, String model, int yearofissue) {
        this.colar = colar;
        this.price = price;
        this.model = model;
        this.yearofissue = yearofissue;
    }

    public String getColar() {
        return colar;
    }

    public void setColar(String colar) {
        this.colar = colar;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearofissue() {
        return yearofissue;
    }

    public void setYearofissue(int yearofissue) {
        this.yearofissue = yearofissue;
    }

    @Override
    public String toString() {
        return "CarHashMapExample{" +
                "colar='" + colar + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", yearofissue=" + yearofissue +
                '}';
    }
}

