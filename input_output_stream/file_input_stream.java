package input_output_stream;

import java.io.FileInputStream;
import java.io.IOException;



public class file_input_stream {
    public static void main(String[] args){
        try{
            FileInputStream fis=new FileInputStream("input.txt");

            int data;
            
            while ((data=fis.read())!= -1) {
                System.out.print((char)data);
            }
            fis.close();
        }catch(IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
