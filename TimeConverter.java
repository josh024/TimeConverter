
public class TimeConverter {
    
    private int hours;
    private int minutes;
    private int seconds;
    private boolean notPM;

    //default constructor
    public TimeConverter()
    {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
        this.notPM = true;
    }

    //parameterized constructor
    public TimeConverter(int xHours, int xMinutes, int xSeconds)
    {
        this.setHours(xHours);
        this.setMinutes(xMinutes);
        this.setSeconds(xSeconds);
    }

    //accessors
    public int getHours()
        {return this.hours;}

    public int getMinutes()
        {return this.minutes;}

    public int getSeconds()
        {return this.seconds;}

    //mutators
    public void setHours(int xHours)
    {
        if(xHours > 0 && xHours < 24)
            {this.hours = xHours;}
        else
            {
                System.out.println("Invalid value entered for hours!");
            }
    }

    public void setMinutes(int xMinutes)
    {
        if(xMinutes >= 0 && xMinutes <= 59)
            {this.minutes = xMinutes;}
        else
            {
                System.out.println("Invalid value entered for minutes!");
            }
    }

    public void setSeconds(int xSeconds)
    {
        if(xSeconds >= 0 && xSeconds <= 59)
            {this.seconds = xSeconds;}
        else
            {
                System.out.println("Invalid value entered for seconds!");
            }
    }


    //methods
    
    //overloaded update time
    public String updateTime(int xHours, int xMinutes, int xSeconds) throws TimeException
    {
        try
        {
            if(xHours > 0 && xHours < 24 && xMinutes >= 0 && xMinutes <= 59 && xSeconds >= 0 && xSeconds <= 59)
            {
                if(xHours > 12)
                {
                    this.notPM = false;
                    this.hours = xHours - 12;
                } 
                return displayTime();
                
            }
            else
            {
                throw new TimeException();
            }
        }   
        catch(TimeException e)
        {return "";}
        //catches exception to prevent code from stopping
        catch(Exception e)
        {return "";}
       
        
    
    }


    public String updateTime(String currentTime) throws TimeException
    {
        String sub1 = currentTime.substring(0,2);
        String sub2 = currentTime.substring(3,5);
        String sub3 = currentTime.substring(6,8);
        //converts string into three substrings

        try
        {
            Integer subHours = Integer.valueOf(sub1);
            Integer subMinutes = Integer.valueOf(sub2);
            Integer subSeconds = Integer.valueOf(sub3);
            //converts substrings to int values

            if(subHours < 0 || subHours > 23 || subMinutes < 0 || subMinutes > 59 || subSeconds < 0 || subSeconds > 59)
            {//input validation
                throw new TimeException();
            }
            else if (subHours > 12)
            {
                subHours -= 12;
                this.notPM = false;
            }
            this.hours = subHours;
            this.minutes = subMinutes;
            this.seconds = subSeconds;
            
            return displayTime();
        }
        catch(TimeException e)
            {return "";}

        catch(Exception e)
            {return "";}

        
    }


    public String displayTime()
    {
        String dayOrNight = "";
        if (notPM = true)
            {dayOrNight = "AM";}
        else if (notPM = false)
            {dayOrNight = "PM";}
            //determines whether the time is am or pm 

        return this.hours+":"+this.minutes+":"+this.seconds+" "+dayOrNight;
    }

}
