import java.util.*;

public class LotsOfStrings {
 
  private static final LinkedList<String> LOTS_OF_STRINGS = new LinkedList<>();
 
  public static void main(String[] args) throws Exception {
    int iteration = 0;
    while (true) {
      for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 1000; j++) {
          LOTS_OF_STRINGS.add(new String("String " + j));
        }
      }
      iteration++;
      System.out.println("Survived Iteration: " + iteration);
      Thread.sleep(100);
    }
  }
}

//java LotsOfStrings -Xmx1m -XX:+UseG1GC -Xloggc:c:/users/jitendra/gc.log -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps 
// java -Xmx1m -XX:+UseG1GC -Xloggc:c:/users/jitendra/gc1.log -XX:+PrintGCTimeStamps -XX:+PrintGCDateStamps -XX:+UseStringDeduplication -XX:+PrintStringDeduplicationStatistics -XX:-HeapDumpOnOutOfMemoryError  -XX:HeapDumpPath=c:\users\jitendra\1.hprof LotsOfStrings 