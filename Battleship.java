import java.util.Scanner;
public class Battleship{
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int t =1;

    Ship a = new Ship();
    Ship b = new Ship();
    Ship c = new Ship();
    a.init("戦艦1");
    /* a.disp();  確認用*/
    b.init("戦艦2");
    /* b.disp(); */
    c.init("戦艦3"); 
    /* c.disp(); */
    
    System.out.println("＋＋＋＋＋ルール説明始まり＋＋＋＋＋");
    System.out.println("敵船３船に攻撃を３回ずつ当てること");
    System.out.println("攻撃はX座標Y座標の1〜５で攻撃すること");
    System.out.println("攻撃時、反応あり（３パターン）");
    System.out.println("（１）攻撃後、当たったら敵船移動する");
    System.out.println("（２）攻撃後、各１方向に敵船がある時、波高しと表示");
    System.out.println("（３）攻撃後、当たらなかったらハズレと表示");
    System.out.println("ターン制限なし");
    System.out.println("敵船のライフは０以下になっても表示される");
    System.out.println("敵船撃沈後も残骸が残っているので反応がある");
    System.out.println("敵船のライフが３船とも０になっても終了");
    System.out.println("最後に何ターンかかったかわかる！");
    System.out.println("＋＋＋＋＋ルール説明終わり＋＋＋＋＋");
    
    System.out.println("＊＊＊＊＊戦艦ゲーム開始＊＊＊＊＊");
    while(a.life>0 || b.life>0 || c.life>0){
      System.out.println("----"+"ターン"+t+"----");
      a.information();
      b.information();
      c.information();
      System.out.println("縦座標のXを１〜５でセットしてください");
      int x = scanner.nextInt();
      System.out.println("横座標のYを１〜５でセットしてください");
      int y = scanner.nextInt();
      System.out.println("攻撃開始");
      a.judgement(x,y);
      b.judgement(x,y);
      c.judgement(x,y);
     /*  a.disp();確認用
      b.disp();
      c.disp();  */
      t++;
    }
    System.out.println("＊＊＊＊＊戦艦ゲーム終了＊＊＊＊＊");
    System.out.println("----あなたは"+"ターン"+t+"かかりました----");
  }
}