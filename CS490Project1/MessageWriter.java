
public class MessageWriter implements Runnable
{
    private int myCounter;

    private String myName;

    public MessageWriter(String name)
    {
        myCounter = 0;
        myName = name;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            try
            {
                Thread.sleep(1000); // 1000 ms
            }
            catch (InterruptedException exc)
            {
                System.out.println(exc);
            }

            ++myCounter;
            System.out.println("Message #" + myCounter + " - " + myName);
        }
    }
}