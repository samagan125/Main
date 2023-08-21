
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1,"Mersedes");
        Car car2 = new Car(2,"BMW");
        Car car3 = new Car(3,"Matiz");
        Car car4 = new Car(4,"Tiko");
        Car car5 = new Car(5,"Jguli");
        CarHashMapExample carHashMapExample1 = new CarHashMapExample("blue",2000058,"BMW",2000);
        CarHashMapExample carHashMapExample2 = new CarHashMapExample("blue",200063,"tiko",2023);
        CarHashMapExample carHashMapExample3 = new CarHashMapExample("blue",200000044,"matiz",2020);
        CarHashMapExample carHashMapExample4 = new CarHashMapExample("blue",20000000,"juguli",2005);
        CarHashMapExample carHashMapExample5 = new CarHashMapExample("blue",2000007,"Mersedes",20204);
        HashMap<Car,CarHashMapExample>hashMap=new HashMap<>();
        hashMap.put(car1,carHashMapExample1);
        hashMap.put(car2,carHashMapExample2);
        hashMap.put(car3,carHashMapExample3);
        hashMap.put(car4,carHashMapExample4);
        hashMap.put(car5,carHashMapExample5);
        for (Map.Entry<Car,CarHashMapExample> a :hashMap.entrySet()) {
            System.out.println("Key: " + a.getKey()+" "+"Value: "+ a.getKey());
        }
    }

}

