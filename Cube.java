public class Cube {

    // Variable
    private int length;
    private int width;
    private int height;

    //Construction
    
    public Cube(int sides){
        this.height = sides;
        this.length = sides;
        this.width = sides;
    }
    // Method
    public void getVolume() {
        System.out.printIn(length * width * height)
    }

}