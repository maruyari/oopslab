import java.util.Scanner;
interface GeometricObject {
    public float Perimeter(float r);
    public float Area(float r);
}
interface ResizeableObject {
    public void resize();

}
class Circle implements GeometricObject {
    @Override
    public float Perimeter(float r) {
        return (float) (2 * Math.PI * r);
    }
    @Override
    public float Area(float r) {
        return (float) (Math.PI * r * r);
    }

  
}
class ResizableCircle extends Circle implements ResizeableObject   {
    float r;
    float p;
    public ResizableCircle(float a, float b) {
        r = a;
        p = b;
    }
    @Override
    public void resize() {
        this.r = this.r * this.p / 100;
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float r = Float.parseFloat(a.nextLine());
        float p = Float.parseFloat(a.nextLine());

        ResizableCircle obj = new ResizableCircle(r, p);
        float a= obj.Area(r);
        obj.resize();
        float b= obj.Area(r);

    }
}
