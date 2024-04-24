public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minut, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //operator ? akan return value pertama jika kondisi benar dan value kedua jika kondisi salah 
    //kondisi ? valuepertama : valuekedua

    public Time nextSecond() {
        int nextSecondValue = (second + 1) % 60;
        int nextMinuteValue = minute;
        int nextHourValue = hour;

        if (nextSecondValue == 0) {
            nextMinuteValue = (minute + 1) % 60;

            if (nextMinuteValue == 0) {
                nextHourValue = (hour + 1) % 24;
            }
        }

        return new Time(nextHourValue, nextMinuteValue, nextSecondValue);
    }

    public Time previousSecond() {
        int previousSecondValue = (second == 0) ? 59 : (second - 1);
        int previousMinuteValue = minute;
        int previousHourValue = hour;

        if (previousSecondValue == 59) {
            previousMinuteValue = (minute == 0) ? 59 : (minute - 1);

            if (previousMinuteValue == 59) {
                previousHourValue = (hour == 0) ? 23 : (hour - 1);
            }
        }

        return new Time(previousHourValue, previousMinuteValue, previousSecondValue);
    }

    public String toString() {
        return (this.hour + ":" + this.minute + ":" + this.second);
    }

}

// public class Time {
//     private int hour;
//     private int minute;
//     private int second;

//     public Time(int hour, int minute, int second){
//         this.hour = hour;
//         this.minute = minute;
//         this.second = second;
//     }
//     public int getHour(){
//         return hour;
//     }
//     public int getMinute(){
//         return minute;
//     }
//     public int getSecond(){
//         return second;
//     }
//     public void setHour(int hour){
//         this.hour = hour;
//     }
//     public void setMinute(int minute){
//         this.minute = minute;
//     }
//     public void setSecond(int second){
//         this.second = second;
//     }
//     public void setTime(int hour,int minute,int second){
//         this.hour = hour;
//         this.minute = minute;
//         this.second = second;
//     }
//     public String toString(){
//        if (second >= 60){
//             second = 0;
//             ++minute;
//             if (minute >= 60){
//                 minute =  0;
//                 ++hour;
//                 if (hour >= 24){
//                     hour =0;
//                 }
//             }
//        }
//        return String.format("%02d:%02d:%02d", hour,minute,second);
//     }
//     public Time nextSecond(){
//         ++second;
//         if (second >= 60){
//             second =0;
//             ++minute;
//             if (minute >=60){
//                 minute=0;
//                 ++hour;
//                 if(hour>=24){
//                     hour=0;
//                 }
//             }
//         }
//         return this;
//     }
//     public Time previousSecond(){
//         --second;
//         if (second <0){
//             second =59;
//             --minute;
//             if(minute <0){
//                 minute = 59;
//                 --hour;
//                 if (hour <0){
//                     hour =23;
//                 }
//             }
//         }
//         return this;
//     }
// }

