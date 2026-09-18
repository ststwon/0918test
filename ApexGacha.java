import java.util.Random;

public class ApexGacha {
    public static void main(String[] args) {

        Random rand = new Random();

        int legendary = 0;
        int epic = 0;
        int rare = 0;
        int heirloom = 0;

        for (int i = 1; i <= 50; i++) {

            double r = rand.nextDouble() * 100;

            if (r < 0.045) {
                heirloom++;
                System.out.println(i + "連目 : ★★★スーパーレジェンド★★★");
            }
            else if (r < 7.4) {
                legendary++;
                System.out.println(i + "連目 : レジェンダリー");
            }
            else if (r < 24.8) {
                epic++;
                System.out.println(i + "連目 : エピック");
            }
            else {
                rare++;
                System.out.println(i + "連目 : レア");
            }
        }

        System.out.println("\n===== 結果 =====");
        System.out.println("スーパーレジェンド : " + heirloom);
        System.out.println("レジェンダリー     : " + legendary);
        System.out.println("エピック           : " + epic);
        System.out.println("レア               : " + rare);
    }
}
