import com.workintech.composition.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom= new Bedroom("fg",
                new Wall("kuzey"),
                new Wall("güney"),
                new Wall("Doğu"),
                new Wall("Batı"),
                new Lamp(LampType.LED,true,12),
                new Bed("çiçekli",1,1,1,1),
                new Wardrobe(2,2,12),
                new Ceiling(3,PaintColor.BEJ),
                new Carpet(1,1,PaintColor.TURUNCU)
        );

        System.out.println(bedroom);
        System.out.println("------------------------------------------------");


        LampType lampType=LampType.HALOJEN;
        PaintColor paintColor=PaintColor.YESIL;

        Lamp lamp1=new Lamp(lampType,false,5);
        lamp1.turnOn();
        System.out.println("Lamp Style:  "+ lamp1.getStyle());
        System.out.println("Lamp Glop Rating"+lamp1.getGlobRating());
        System.out.println("Lamp battery"+lamp1.isBattery());



}

}