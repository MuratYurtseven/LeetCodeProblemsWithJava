package EasyLevel;

public class Sqrt {
    public static int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int left = 1,right = x/2,result = 0;
        while (left<=right){
            int mid = left + (right - left) / 2;
            if(mid<=(x/mid)){
                result = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }
}
