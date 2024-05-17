import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileHandling {
    public static void main(String[] args) throws IOException{
        // File outPut Stream Example
        FileOutputStream outPut = new FileOutputStream("temp.dat");

        for(int i = 0; i < 10; i++) {
            outPut.write(i);
        }
        outPut.close();

        FileInputStream inPut = new FileInputStream("temp.dat");

        int value;
        while((value = inPut.read()) != -1) {
            System.out.println(value + ", ");
        }
        inPut.close();


        // Data Output Stream Example
        DataOutputStream output2 = new DataOutputStream(new FileOutputStream("temp.dat"));

        output2.writeUTF("Yihun");
        output2.writeDouble(90.5);

        output2.close();
    }
}