import com.workintech.composition.Lamp;
import com.workintech.composition.LampType;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


    Lamp lamp = new Lamp(LampType.AKKOR, true, 10);
        System.out.println("lamp:"+lamp);
}

}