// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  Random liczby = new Random();
  
  int Suma = 0;
  for(int i=0; i<5 ;i++)
{
  int liczby losowe = liczby.nextInt(100);
  int Kwadrat = liczby losowe;
  liczby losowe = (int)Math.pow(kwadrat,2.0);
  suma = suma +liczby losowe;
  System.out.printl("losowa liczba:" + liczby losowe);
}
system.out.printl("suma=" +suma);
}
  }
 
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}