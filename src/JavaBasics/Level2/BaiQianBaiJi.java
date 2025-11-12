package JavaBasics.Level2;
//需求:我国古代数学家张丘建在《算经》一书中提出的数学问题:鸡翁一值钱五, 鸡母一值钱三,鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何?
public class BaiQianBaiJi {
    public static void main(String[] args) {
        chicken();
    }
    public static void chicken() {
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 33; y++) {
                int z = 100 - x - y;
                if(100 == x*5 + y*3 + z*1/3){
                    System.out.println(x+","+y+","+z);
                }
            }
        }
    }
}
