package planWar1;

import java.awt.Image;
import java.awt.Graphics;
import java.awt.Toolkit;

public class PlayerPlane {
    //定义数据
    int x,y;
    int width,height;
    Image image;
    int lifeValue;
    int speed;
    int fireSort;

    //构造方法进行初始化
    public PlayerPlane(){
        this.x = 200;
        this.y = 200;
        this.image = Toolkit.getDefaultToolkit().getImage("Java\\images\\myPlane.png");
        this.width = image.getWidth(null);
        this.height = image.getHeight(null);
    }


    //定义方法
    public void move(){

    }
    public void fire(){
        
    }
    public void eatTools(){
        
    }
    public void paint(Graphics g){
        g.drawImage(image, x, y, null);
    }

}
