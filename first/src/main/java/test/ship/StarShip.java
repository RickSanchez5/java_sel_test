package test.ship;

public class StarShip {
    /*высота*/
    public double shipHeight;
    //добавляю конструктор для корабля
    public StarShip (double shipHeight){
        this.shipHeight=shipHeight;
    }
    //возвращаю высоту корабля
    public double getShipHeight(){
        return this.shipHeight;
    }
}
