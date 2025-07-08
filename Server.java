import java.io.*;
import java.net.*;
import java.nio,FileChannel;

public class Server {
  public static void main(String[] args) {
    JioChannel channel = new JioChannel();
    try{
      if(args.length < 3){
        System.out.println("usage:    JioChannel    <source> <destination> <mode>\n");
        return;
      }
      if("1"equals(args[2])){
        long start = System.currentTimeMillis();
        channel.copy(args[0], args[1]);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time "+ time+ " millisecond");

      }
      else{
        long start = System.currentTimeMillis();
        channel.zeroCopy(args[0],args[1]);
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println("Time "+ time+ " millisecond");
      }
      
    }
    catch(IOException e) {
        e.printStackTrace();
      }
  }
  public void copy()
}
