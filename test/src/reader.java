import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class reader {
    public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.out.println("usage lineswap <input filename> <output filename>");
			System.exit(1);
		}
		try ( 
        BufferedReader br = new BufferedReader (new FileReader(args[0]));
				BufferedWriter bw = new BufferedWriter (new FileWriter(args[1]));) {
			
				String line1;
                String lineOld;


                while ((line1 = br.readLine())!=null){
                    lineOld=line1;
                    line1=br.readLine();
                    bw.write(line1);
                    bw.newLine();
                    bw.write(lineOld);
                    bw.newLine();
                }
		}		
        catch (Exception e) {
            


        }
	}


}
