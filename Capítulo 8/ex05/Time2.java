public class Time2 {
   private int totalSeconds; // Total de segundos desde a meia-noite

   public Time2() {
       this(0, 0, 0);
   }

   public Time2(int hour) {
       this(hour, 0, 0);
   }

   public Time2(int hour, int minute) {
       this(hour, minute, 0);
   }

   public Time2(int hour, int minute, int second) {
       setTime(hour, minute, second);
   }

   public Time2(Time2 time) {
       this.totalSeconds = time.totalSeconds;
   }

   public void setTime(int hour, int minute, int second) {
       if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
           throw new IllegalArgumentException("Hour, minute, and second must be within valid range");
       }
       this.totalSeconds = hour * 3600 + minute * 60 + second;
   }

   public void setHour(int hour) {
       if (hour < 0 || hour >= 24) {
           throw new IllegalArgumentException("Hour must be 0-23");
       }
       this.totalSeconds = hour * 3600 + getMinute() * 60 + getSecond();
   }

   public void setMinute(int minute) {
       if (minute < 0 || minute >= 60) {
           throw new IllegalArgumentException("Minute must be 0-59");
       }
       this.totalSeconds = getHour() * 3600 + minute * 60 + getSecond();
   }

   public void setSecond(int second) {
       if (second < 0 || second >= 60) {
           throw new IllegalArgumentException("Second must be 0-59");
       }
       this.totalSeconds = getHour() * 3600 + getMinute() * 60 + second;
   }

   public int getHour() {
       return totalSeconds / 3600;
   }

   public int getMinute() {
       return (totalSeconds % 3600) / 60;
   }

   public int getSecond() {
       return totalSeconds % 60;
   }

   public String toUniversalString() {
       return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }

   public String toString() {
       return String.format("%d:%02d:%02d %s", 
           (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12,
           getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   }
}