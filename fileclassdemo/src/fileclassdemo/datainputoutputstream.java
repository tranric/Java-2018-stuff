package fileclassdemo;

import java.io.*;

public class datainputoutputstream {

	public static void main(String[] args) throws IOException {

		DataOutputStream output =
			new DataOutputStream(new FileOutputStream("data.dat"));

		output.writeInt(5);
		output.writeDouble(3.5);
		output.writeChar('S');
		output.writeBoolean(false);
		output.writeUTF("Sheridan");
		output.close();

		DataInputStream input =
				new DataInputStream (new FileInputStream("data.dat"));

		System.out.println(input.readInt());
		System.out.println(input.readDouble());
		System.out.println(input.readChar());
		System.out.println(input.readBoolean());
		System.out.println(input.readUTF());

		input.close();





	}

}
