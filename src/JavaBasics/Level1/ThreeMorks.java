package JavaBasics.Level1;

public class ThreeMorks {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //先比较前两个
        int tempHeight = height1 > height2 ? height1 : height2;
        //前两个中较大的和第三个比较
        int maxHeight = tempHeight > height3 ? tempHeight : height3;

        System.out.println("maxHeight:" + maxHeight);
    }
}
