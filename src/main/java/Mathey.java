public class Mathey {
    // find the maximum of two ints
    public static int max(int x, int y){
        if (x > y){
            return x; 
        }
        else{
            return y; 
        }
    }
    // find the maximum of two doubles
    public static double max(double x, double y){
       if (x > y){
            return x; 
        }
        else{
            return y; 
        }
    } 
    // find the maximum of three ints
    public static int max(int x, int y, int z){
        return max(x, max(y, z));
    }
    // find the maximum of three doubles
    public static double max(double x, double y, double z){
        return max(x, max(y, z));
    }
    // find the minimum of two ints
    public static int min(int x, int y){
        if (x < y){
            return x; 
        }
        else{
            return y; 
        }
    }
    // find the minimum of two doubles
    public static double min(double x, double y){
       if (x < y){
            return x; 
        }
        else{
            return y; 
        }
    } 
    // find the minimum of three ints
    public static int min(int x, int y, int z){
        return min(x, min(y, z));
    }
    // find the minimum of three doubles
    public static double min(double x, double y, double z){
        return min(x, min(y, z));
    }
    // returns random int between a and b
    public static int randomInteger(int a, int b) { 
        return a + (int)(Math.random() * b);
    }
    public static int randomInteger(int b) { 
        return (int)(Math.random() * b);
    }
    public static void main(String[] args){
        System.out.println(max(5, 9, 7));
        System.out.println(max(4.6, 2.1, 8.2));
        System.out.println(max(1.0, 12.7));
        System.out.println(max(20, 3));
        System.out.println(min(5, 9, 7));
        System.out.println(min(4.6, 2.1, 8.2));
        System.out.println(min(1.0, 12.7));
        System.out.println(min(20, 3));
        System.out.println(randomInteger(5, 25));
        System.out.println(randomInteger(200));
    }
}