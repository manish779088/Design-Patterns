package StructuralDesignPattern.FlyweightPattern.Issues;

public class Robot {
    int coordinateX;  //4 byte
    int coordinateY; // 4 byte
    String type;   //50 byte
    Sprites body;  //30kb - this is image or bitmap

    // total consider as 31kb

    Robot(int x, int y, String type, Sprites body){
        this.coordinateX=x;
        this.coordinateY=y;
        this.type=type;
        this.body=body;
    }

    // getter and setters
}
