
public class TimeException extends Exception{
    public TimeException()
    {
        System.out.println("EXCEPTION: Invalid time entered!");
    }

    public TimeException(String msg)
    {
        super(msg);
    }
}
