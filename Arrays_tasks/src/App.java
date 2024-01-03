public class App {
    public static void main(String[] args) throws Exception {
        int[] temps = {20,24,57,23,0};
        temps[2] = 9;
        for(int temp:temps){
            System.out.println(temp);
        }
    }
}
