
public class TestDemo {

  public int addPositive(int a, int b) {
    
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
