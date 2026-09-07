class Solution {
    public int dayOfYear(String date) {
        String sp[] = date.split("-");
        int year = Integer.parseInt(sp[0]);
        int mon = Integer.parseInt(sp[1]);
        int day = Integer.parseInt(sp[2]);
        boolean isLeap = isLeap(year);
        int noofdays=0;
        int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=0;i<mon - 1;i++)
        {
            if(isLeap && i==1)
            {
                noofdays += days[i]+1;
                continue;
            }
            noofdays+=days[i];
        }
        return noofdays+day;
    }

    public static boolean isLeap(int year)
    {
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                return year%400==0;
            }
            return true;
        }
        return false;
    }
}