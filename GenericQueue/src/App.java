import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        GenericQueue<Integer> queue = new GenericQueue<>();

        for(int i=0 ; i<10 ; i++)
        {
            queue.enqueue(i+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0 ; i<10 ; i++)
        {
            System.out.println(queue.getHead());
            queue.dequeue();
        }

        for(int i=0 ; i<list.size() ; i++)
        {
            System.out.println(list.get(i));
        }

    }
}
