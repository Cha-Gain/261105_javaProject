package studentManager;

public class Subject {
   private String name;
   private String period;
   
   public Subject() {}
   
   public Subject(String name, String period) {
      this.name = name;
      this.period = period;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getPeriod() {
      return period;
   }

   public void setPeriod(String period) {
      this.period = period;
   }

   @Override
   public String toString() {
      return "강의명" + name + ", 기간" + period;
   }
}
