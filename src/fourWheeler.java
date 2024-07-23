import com.automobile.FourWheeler.*;
public class fourWheeler {
	public static void main(String args[])
	{
		Logan l = new Logan("Model Logan 1","1256","Ranjith",160);
		System.out.println(l.getModelName());
		System.out.println(l.getRegistrationNumber());
		System.out.println(l.getOwnerName());
		System.out.println(l.speed());
		l.gps();
		
		Ford f = new Ford("Model Ford 1 ","54321","Ranjith",200);
		System.out.println("\n"+f.getModelName());
		System.out.println(f.getRegistrationNumber());
		System.out.println(f.getOwnerName());
		System.out.println(f.speed());
		f.tempControl();
	}
}
