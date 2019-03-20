package test;

public class child extends parent {
    public void openmouth(){
        super.makeSound();
    }
    public static void main(String[] args){
        child childone = new child();
        childone.openmouth();
    }
}
