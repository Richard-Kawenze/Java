public class Concurrency {
   public static void main(String[] args) {
    Thread thread=new Thread(new Runnable()
    {
        public void run()
        {
            for(int i=0;i<5;i++)
            {
            System.out.println("Printing "+i+" in the worker thread");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();

            }
            }
        }
    }
    );
    thread.start();
      for(int i=0;i<5;i++)
            {
            System.out.println("Printing "+i+" in the main thread" );
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();

            }
            }
   } 
}
