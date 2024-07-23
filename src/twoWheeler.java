import com.automobile.twoWheeler.*;
public class twoWheeler {
public static void main(String args[])
{
	Hero h = new Hero("HF DELUXE","123545","RANJITH",120);
	System.out.println(h.getModelName());
	System.out.println(h.getRegistrationNumber());
	System.out.println(h.getOwnerName());
	System.out.println(h.getSpeed());
	h.radio();
	Honda h1 = new Honda("activa","987564","sunny",100);
	System.out.println(h1.getModelName());
	System.out.println(h1.getRegistrationNumber());
	System.out.println(h1.getOwnerName());
	System.out.println(h1.getSpeed());
	h1.cdPlayer();
}
}
