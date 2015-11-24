// vui doan Greensboro Warning
public class GreensboroWarning{
   public static void main (String [] args)throws java.io.FileNotFoundException{
           
    
      java.io.File holder= new java.io.File("weatherDaily.txt");// to hold the file weatherDaily.dat
      java.util.Scanner read= new java.util.Scanner(holder);// creat a object to carry hold of file
               
      int year, month, day, precipitation, snow, dailyHigh, dailyLow;//set variable as a integer 
      int counterDay=0;
      int counterYear=0;// initallize variable to 0
      int sumOfYear=0;// initalliaze variable to 0
      int yearSquared=0;
      double sumAverageLow=0;
      double sumYearTAverLow=0;
      double fahHigh;
      double fahLow=0.0;
      double averageLow=0,slope=0;
      while (read.hasNext()){
         year=read.nextInt();// read first integer for year
         month=read.nextInt();// read second integer for month
         day=read.nextInt();// read third integer for day
         precipitation=read.nextInt();// read the fourth integer for precipitation
         snow=read.nextInt();// fifth for snow
         dailyHigh=read.nextInt();//sixth for daily high temp
         
         dailyLow=read.nextInt();// seventh for daily low temp
         fahLow+=((9.0* dailyLow)/50.0)+32.0;// change degree to fah
         
         counterDay++;//count the days
         if (month==12 && day==31){
            averageLow= fahLow/(counterDay*1.0);// calculate average daily low temp
            System.out.println(year+ " " +averageLow);// print out year follow by average low temp
            counterYear++;// count number of years
            sumOfYear+=year;// sum up the year
            yearSquared+=year * year;// squared the year
            sumAverageLow+=averageLow;// sum the average daily low temp
            sumYearTAverLow+=year*averageLow; // mutiply sum of year to average daily low temp  
            counterDay=0;
            fahLow=0;// reset counter day and daily low temp
         
         
         }
      }
    
      slope=(counterYear*sumYearTAverLow-sumOfYear*sumAverageLow)/(counterYear* yearSquared -sumOfYear*sumOfYear);// calculate temp
      System.out.println("increase in annual low is "+slope+ " degrees per year");// display the temperture 
     
         
                  
   }   
                   
}
