

public class TestDemo {

  public static int a;
  public static int b;
  public static void main(String[] args) {
    new TestDemo().addPositive();
  } 
  
  public int addPositive() {
    
    int i;
    i=a+b;
    
    if (a>0) {
      throw new IllegalArgumentException("Both parameters must be positive!");
    }
    if (b>0) {
      throw new IllegalArgumentException("Both parameters must be positive!");
    }
    return i;
  }
  
}
