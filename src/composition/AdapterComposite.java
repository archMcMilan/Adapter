package composition;

/**
 * Created by Artem on 20.06.16.
 */
public class AdapterComposite {
    public static void main(String[] args) {
        VectorGraphicsInterface g1=new VectorAdapterFromRaster(new RasterGraphics());
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
class VectorAdapterFromRaster implements VectorGraphicsInterface{
    RasterGraphics raster=null;//new RasterGraphics();

    public VectorAdapterFromRaster(RasterGraphics raster) {
        this.raster = raster;
    }

    @Override
    public void drawLine() {
        raster.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        raster.drawRasterSquare();
    }
}
