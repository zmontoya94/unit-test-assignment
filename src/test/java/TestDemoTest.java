import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class TestDemoTest {
  int a;
  int b;
  @BeforeEach
  void setUp() throws Exception {

    new TestDemo().addPositive( 1, 2);
  }

  @ParameterizedTest
  void assertThatTwoPositiveNumbersAreAddedCorrectly() {
    boolean expectException;
    if(!expectException) {
      assertThat(TestDemo.addPositive(a, b)).isEqualTo(expected);
    }
  }

}
