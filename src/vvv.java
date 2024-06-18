public class vvv {
    public void calculateDifference(int saat1, int dakika1, int saat2, int dakika2) {
    int totalMinutes1 = saat1 * 60 + dakika1;
    int totalMinutes2 = saat2 * 60 + dakika2;

    int differenceMinutes = Math.abs(totalMinutes2 - totalMinutes1);
    int saatFark = differenceMinutes / 60;
    int dakikaFark = differenceMinutes % 60;

    System.out.println(saatFark + " saat " + dakikaFark + " dakika fark var.");
}

    public static void main(String[] args) {
        vvv vvv=new vvv();
        vvv.calculateDifference(10,30,14,15);
    }











}
