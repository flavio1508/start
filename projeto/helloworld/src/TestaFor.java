public class TestaFor { 
    public static void main(String[] args) {
        int y = 25;
        for (int i = 1; i < y; i++) {
            System.out.println(i);
            if(i % 19 == 0) {
                System.out.println("achamos um numero divisivel por 19.");
                break;
            }
            
        }
    }
    
}
