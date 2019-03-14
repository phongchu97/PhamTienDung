package Assignment3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Triangle> triangleList = new ArrayList();
        ArrayList<Rectangle> rectangleList = new ArrayList();

        triangleList.add(new Triangle());
        triangleList.add(new Triangle());
        triangleList.add(new Triangle());

        for(Triangle trL: triangleList){
            trL.triangle();
        }

    }
}
