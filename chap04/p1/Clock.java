package chap04.p1;

class Clock {
    private String time;
  
    public void setTime(String t) {
      time = t;
    }
  
    public String getTime() {
      return time;
    }
  }
  
  class ClockTestDrive {
    public static void main(String[] args) {
      Clock c = new Clock();
  
      c.setTime("1245");
      String tod = c.getTime();
      System.out.println("time: "+tod);
      System.out.println("time: "+ a);

      
    }

    static int calc(int x, int y) {
        return x * y;
    }
    static int a = calc(7, 12);
  }
