import java.util.PriorityQueue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class toy_store {
    
    private int id;
    private String name;
    private int frequency;
    
    public toy_store(int id, String name, int frequency) {
        this.id = id;
        this.name = name;
        this.frequency = frequency;
    }
    
    public static void main(String[] args) {
        
       
        int[] ids = {1, 2, 3};
        int[] frequencies = {5, 3, 2};
        
      
        PriorityQueue<toy_store> toyQueue = new PriorityQueue<>();
        
    
        for (int i = 0; i < ids.length; i++) {
           toy_store toy = new toy_store(ids[i], "Toy " + ids[i], frequencies[i]);
            toyQueue.add(toy);
        }
        
        
        File file = new File("draw_results.txt");
        
        try {
          
            FileWriter writer = new FileWriter(file);
            
            
            for (int i = 0; i < 10; i++) {
                toy_store toy = toyQueue.poll();
                writer.write(toy.name + "\n");
            }
            
            
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}