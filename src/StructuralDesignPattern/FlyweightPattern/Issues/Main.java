package StructuralDesignPattern.FlyweightPattern.Issues;

public class Main {
    public static void main(String[] args) {
        // to create robotic army
        int x=0;
        int y=0;
        for(int i=0;i<500000;i++){
            Sprites humaoidSprites = new Sprites();
            Robot humanoidRobot = new Robot( x+i,y+i,"humanrobot",humaoidSprites);
        }
        for(int i=0;i<500000;i++){
            Sprites dogSprites = new Sprites();
            Robot dogRobot = new Robot(x+i,y+i,"dogrobot",dogSprites); // 31kb
        }
    }
    // total memory 31kb*10lakh = 31gb
}
