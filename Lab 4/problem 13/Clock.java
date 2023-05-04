public class Clock{
  private int hours;
  private int minutes;
  private int seconds;
  public Clock(){
    hours=12;
    minutes=0;
    seconds=0;
  }
  public Clock(int hours, int minutes, int seconds){
    this.hours=hours;
    this.minutes=minutes;
    this.seconds=seconds;
  }
  public Clock(int s){
    hours=s/3600;
    s=s%3600;
    minutes=s/60;
    seconds=s%60;
  }
  public void setClock(int seconds){
    hours=seconds/3600;
    seconds=seconds%3600;
    minutes=seconds/60;
    this.seconds=seconds%60;
  }
  public int getHours(){
    return hours;
  }
  public int getMinutes(){
    return minutes;
  }
  public int getSeconds(){
    return seconds;
  }
  public void setHours(int h){
    hours=h;
  }
  public void setMinutes(int m){
    minutes=m;
  }
  public void setSeconds(int s){
    seconds=s;
  }
  public void tick(){
    seconds++;
    if(seconds>=60){
      seconds-=60;
      minutes++;
      if(minutes>=60){
        minutes-=60;
        hours++;
        if(hours>=24)
          hours-=24;
      }
    }
  }
  public Clock addClock(Clock c){
    Clock d=new Clock();
    d.hours=this.hours+c.hours;
    d.minutes=this.minutes+c.minutes;
    d.seconds=this.seconds+c.seconds;
    if(d.seconds>=60){
      d.seconds-=60;
      d.minutes++;
    }
    if(d.minutes>=60){
      d.minutes-=60;
      d.hours++;
    }
    if(d.hours>=24)
      d.hours-=24;
    this.hours=d.hours;
    this.minutes=d.minutes;
    this.seconds=d.seconds;
    return d;
  }
  public String toString(){
    String s="(";
    if(hours<10)
      s+="0"+hours+":";
    else
      s+=hours+":";
    if(minutes<10)
      s+="0"+minutes+":";
    else
      s+=minutes+":";
    if(seconds<10)
      s+="0"+seconds+")";
    else
      s+=seconds+")";
    return s;
  }
  public void tickDown(){
    seconds--;
    if(seconds<0){
      seconds+=60;
      minutes--;
      if(minutes<0){
        minutes+=60;
        hours--;
        if(hours<0)
          hours+=24;
      }
    }
  }
  public Clock subtractClock(Clock c){
    Clock d=new Clock();
    d.hours=this.hours-c.hours;
    d.minutes=this.minutes-c.minutes;
    d.seconds=this.seconds-c.seconds;
    if(d.seconds<0){
      d.seconds+=60;
      d.minutes--;
    }
    if(d.minutes<0){
      d.minutes+=60;
      d.hours--;
    }
    if(d.hours<0)
      d.hours+=24;
   
    return d;
  }
}