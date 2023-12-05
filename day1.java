import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day1{
    public static void main(String[] args) {
        System.out.println(sol("input.txt"));
    }
    public static int sol(String filename){
        try{
            int sum = 0;
            File f = new File(filename);
            Scanner inpt = new Scanner(f);
            while(inpt.hasNextLine()){
                String lne = inpt.nextLine().toLowerCase().replaceAll("[a-zA-Z]", "");
                sum+=Integer.valueOf(lne.substring(0,1)+lne.charAt(lne.length()-1));
            }
            return sum;
        }
        catch(FileNotFoundException ex){
            System.out.println("you fucked up");
            System.exit(-1);
        }
        return -1;
    } 
}