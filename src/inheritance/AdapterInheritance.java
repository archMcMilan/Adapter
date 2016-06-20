package inheritance;

/**
 * Created by Artem on 20.06.16.
 */
public class AdapterInheritance {
    public static void main(String[] args) {
        VectorGraphicsInterface g1=new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
    }
}

//Adapter
interface VectorGraphicsInterface{
    void drawLine();
    void drawSquare();
}

//Adaptee
class RasterGraphics{
    void drawRasterLine(){
        System.out.println("Draw line");
    }
    void drawRasterSquare(){
        System.out.println("Draw square");
    }
}
//Concrete Adapter
class VectorAdapterFromRaster extends RasterGraphics implements  VectorGraphicsInterface{

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}