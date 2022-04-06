package SS07_Abstract_Class_Interface.Bai_tap.Trien_khai_interface_Colorable;

public class Rectange extends HinhHoc {

    private double dai;
    private double rong;
    private String color;

    public Rectange(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public Rectange(double dai, double rong, String color) {
        this.dai = dai;
        this.rong = rong;
        this.color = color;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getArea() {
        return getDai() * getRong();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String howToColor() {
        return "Color all four sides " + getColor();
    }

    @Override
    public String resize(double percent) {
        return "RectangleResize " + getArea() * percent;
    }
}
