public class TestaContinue { 
    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 100; j++) {
            if (j > 50 && j < 60) {
                continue;
            }
            System.out.println(j);
        }
    }
    
}
