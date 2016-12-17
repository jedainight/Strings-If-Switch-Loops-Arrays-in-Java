public class Cases {
      public static void main(String[] arguments) {
            float x = 9;
            float y = 5;
            int z = (int)(x / y);
            System.out.println("Value of z: " + z);
            switch (z) {
            case 1:
                  x = x + 2;
                  System.out.println("case1: ");
            case 2:
                  x = x + 3;
                  System.out.println("case2: ");
            default:
                  x = x + 1;
                  System.out.println("default: ");
            }
            System.out.println("Value of x: " + x);
      }
}
