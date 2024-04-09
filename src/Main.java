public class Main {
    
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int a = 20;
        int miles = service.calculate(price, a);
        System.out.println(miles);
    }
}