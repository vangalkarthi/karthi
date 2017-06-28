class holiday
{
public static void main(String args[])
{
 public boolean isHoliday(Date date)
    {
        boolean isHoliday = false;
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        
        if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY
            || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
        {
            isHoliday = true;
        }

        
        return isHoliday;
    }
}
