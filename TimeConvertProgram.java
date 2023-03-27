public class TimeConvertProgram             // Declaring public class as the name of the name of the TimeConvertProgram
{
    public static void main(String[] arguments)     // Executing the main function of arguments array space without return value
    {
        int source=100000;      // Entering 100000s into integer variable 'source'
        int day=100000/(24*60*60);      // Dividing 100000s by the value of a day seconds and save to the variable 'day'
        int hour=(100000%(24*60*60))/(60*60);       // Dividing 100000s by the remaining seconds of a day and save in the variable 'hour'
        int minute=((100000%(24*60*60))%(60*60))/60;    // Dividing 100000s by the remaining seconds of an hour and save in the variable 'minute'
        int seconds=((100000%(24*60*60))%(60*60))%60;   // Dividing 100000s by the remaining seconds of a minute and save in the variable 'second'

        System.out.println(day+" days");        // Outputting how many days
        System.out.println(hour+" hours");      // Outputting how many hours
        System.out.println(minute+" minutes");  // Outputting how many minutes
        System.out.println(seconds+" seconds"); // Outputting how many seconds
        System.out.println("-----------------------------------");  // Separate the final message

        if (day>365)        // If the variable day is greater than 365
        {
            System.out.println(source+" seconds are more than 1 year.");        // Printing a message indicating that a given value is more than one year
        }

        else                // Unless the variable day is grater than 365
        {
            System.out.println(source+" seconds is less than 1 year.");         // Printing a message indicating that a given value is less than one year
        }
    }
}
