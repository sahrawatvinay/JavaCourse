public class Hello {
    public static void main(String[] args) {
        //Primitive data types
        int num = 100;
        byte by = 127; //max range
        short sh = 515;
        long lg = 9576746L;

        float price = 50.1f; //always f suffix at end
        double amount = 100.8;

        char letter = 'x';

        boolean isActive = false;

        //literals : fixed value written directly in code
        int a = 10;      // 10 is a literal
        String msg = "Hi"; // "Hi" is a literal

        // implicit conversion: small to big
        int x = 55;
        long y = x;
        System.out.println(x + " -- " + y);

        // explicit conversion: big to small, we have to cast it
        float temp = 7.84f;
        int value = (int)temp;
        System.out.println(temp + " -- " + value);

        System.out.println( temp > 8 ? "true" : "false");
    }
}