package EasyLevel;

public class ReverseBits {


    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1; //Eger son bit 1 ise 1 0 ise 0 olur result.
            n >>>= 1; //Bitleri 1 saga kaydırır ve - olmaması için işarat en sol bite 0 ekler.
            if(i<31){
                result<<=1; //Yeni bit eklenmesi için 1 bit sola kaydırır
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}
