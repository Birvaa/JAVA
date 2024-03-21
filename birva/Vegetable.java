import java.util.*;
class vegetable{
    String color;
    vegetable(String color){
       this.color=color;
    }
    public abstract String getname();

        public String toString(){
            return getname()+"with color"+color;
        }
}


class Potato extends vegetable {
    public Potato(String color){
        super(color);
    }
    public String getname(){
        return "Potato";
    }
}
class Brinjal extends vegetable{
    Brinjal(String color){
        super(color);
    }
    public String getname(){
        return "Brinjal";
    }
}
class Tomato extends vegetable{
    Tomato(String color){
        super(color);
    }
    public String getname(){
        return "Tomato";
    }
}
public class Vegetable{
    public static void main(String[] args) {
        vegetable v1 = new Tomato();
    }
}