
public class Review01 {

    // 税率を定数として定義
    public static final double TAX_RATE = 0.10;

    public static void main(String[] args) {
        int price = 1500; //商品価格
        // 消費税額を計算する int型の引数を持つtaxメソッドを呼び出し、処理結果をint型変数に代入
        int taxAmount = tax(price);
        int totalPrice = price + taxAmount; //税込価格を計算する

        // 演算結果を表示する
        System.out.println(price + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。");
    }

    // int型引数を受け取るtaxメソッドの定義（戻り値あり）
    public static int tax(int price) {
        return (int)(price * TAX_RATE);// 消費税額を計算し小数点以下を切り捨て
    }


}
