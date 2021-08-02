package kadai7;

//ゲームクラス
public class Game {
    //名前と値段
    private String name;
    private int price;
    //コンストラクタ
    public Game(String name,int price) {
        this.name = name;
        this.price = price;
    }
    //名称を取得
    public String getName() {
        return name;
    }
    //価格を取得
    public int getPrice() {
        return price;
    }
}