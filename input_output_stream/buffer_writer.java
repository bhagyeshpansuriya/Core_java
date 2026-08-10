package input_output_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class buffer_writer {
    public static void main(String[] args) {
        try{
            BufferedWriter bw=new BufferedWriter(
                new FileWriter("output.txt")
            );

            bw.write("Hello java");
            bw.newLine();
            bw.write("Welcome to BufferWriter");
            bw.newLine();
            bw.write("This is java program");

            bw.close();

            System.out.println("Data written successfully");
        }catch(IOException e){
            System.out.print("Error:"+e.getMessage());
        }
    }
}
