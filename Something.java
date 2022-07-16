public class Something {
    public static void main(String[] stuff) {
        System.out.println("We made it!");

        // Primitive Data Types

        // 1 byte
        byte byte1 = -128;
        byte byte2 = 127;

        // 2 bytes
        short short1 = -32_768;
        short short2 = 32_767;

        // 4 bytes
        int int1 = -2_147_483_648;
        int int2 = 2_147_483_647;

        // 8 bytes
        long long1 = -9_223_372_036_854_775_807l;
        long long2 = 9_223_372_036_854_775_806l;

        // 4 bytes
        float float1 = 1.0000001f;

        // 8 bytes
        double double1 = 1.000000000000001d;

        // 1 byte
        boolean t = true;
        boolean f = false;

        // 2 bytes
        char a = 'a';

        // Non-primitive Data Types
        String string = "This is a string";

        String[] array = {"One", "Two", "Three"};
        // Format
        String formatting = String.format("This is a test of adding float 1 (%.2f) and double 1 (%.2f)",
                                      float1, double1);
        System.out.println(formatting);

        // IndexOf [returns int >= 0 if found, or -1]
        int strInd = formatting.indexOf("test");
        // equals [boolean] // compare values, not object
        boolean isEquals = string.equals(formatting);




    }
}
