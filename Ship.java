import java.util.Random;

public class Ship{
  Random ran = new Random();
  int[][] field = new int [7][7];
  public String name;
  public int life=3;
  public int ship_x,ship_y;

/*   船を座標にセット */ 
  public void init(String name){
      this.name = name;
      this.ship_x=ran.nextInt(4)+1;
      this.ship_y=ran.nextInt(4)+1;
      field[this.ship_x][this.ship_y] =2;
  }

/* 攻撃判定  */
  public void judgement(int x,int y){
     if(field[x][y]== field[this.ship_x][this.ship_y]){
        this.life--;
          if(this.life>0){
            System.out.println("命中"+this.name+"生存"+" "+"移動します");
            this.moving();
          }else{
            System.out.println(this.name+"撃沈");
            this.moving(); 
          }
      }else if(field[x+1][y]==field[this.ship_x][this.ship_y]){
            System.out.println(this.name+"波高し");
      }else if(field[x-1][y]==field[this.ship_x][this.ship_y]){
            System.out.println(this.name+"波高し"); 
      }else if(field[x][y+1]==field[this.ship_x][this.ship_y]){ 
            System.out.println(this.name+"波高し"); 
      }else if(field[x][y-1]==field[this.ship_x][this.ship_y]){ 
            System.out.println(this.name+"波高し"); 
       }else{
            System.out.println(this.name+"ハズレ");
       }
  }
    

    /* 移動 */
  public void moving(){
      if(this.life!=0){
        field[this.ship_x][this.ship_y] =0;
        this.ship_x=ran.nextInt(4)+1;
        this.ship_y=ran.nextInt(4)+1;
        field[this.ship_x][this.ship_y] =2;
      }else{
        field[this.ship_x][this.ship_y] =0;
        
      }
    }

    public void information(){
      System.out.println(this.name+"のライフは"+this.life+"です");
    }

   /*  確認用 */
  /* public void disp(){
    System.out.printf("%sのライフは%dです。%d,%d\n",name,life,ship_x,ship_y);
    for(int i=0; i<7; i++){
      for(int j=0; j<7; j++){
       System.out.print(field[i][j]+" ");
      }
      System.out.println();
    }
  } */

}