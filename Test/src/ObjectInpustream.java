import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class Rec implements Serializable {
	int x, y;

	Rec(int x, int y) {
		this.x = x;
		this.y = y;

	}
	void show() {
		System.out.println(x + " " + y);
	}
}

public class ObjectInpustream {
	public static void main(String[] args) throws Exception {

		ObjectInputStream in =
				new ObjectInputStream(new FileInputStream("obj.dat"));
		
		Rec r1 = (Rec)in.readObject();
		Rec r2 = (Rec)in.readObject();
		String r3 = (String)in.readObject();
		
		r1.show();
		r2.show();
		System.out.println(r3);
		
//		FileOutputStream fos = new FileOutputStream("obj.dat");
//		ObjectOutputStream os = new ObjectOutputStream(fos);
//
//		Rec r = new Rec(4, 7);
//
//		os.writeObject(r);
//		os.writeObject(new Rec(8, 5));
//		os.writeObject(new String("glgl"));
//		
//		os.close();
		
	}
}