package input_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;



public class file_out_stream {
    public static void main(String[] args){
        try{
            FileOutputStream fos=new FileOutputStream("output.txt");
            String data="Hello java fileoutput stream";

            fos.write(data.getBytes());

            fos.close();

            System.out.println("Data written successfully");
        }catch(IOException e){
            System.out.print("Error "+e.getMessage());
        }

        
    }
}
