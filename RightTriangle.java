public class RightTriangle extends Triangle {
    private Double base;
    private Double height;

    public RightTriangle(String name, Double base, Double height) {
        super(name, base, height, Math.sqrt(base * base + height * height)); // Perhatikan urutan parameter di sini
        this.name = name;
        this.base = base;
        this.height = height;
        this.calculateArea();
    }

    private double getHyptenuse() {
        return Math.sqrt((base * base) + (height * height)); // Perbaiki operasi matematika di sini
    }

    public void calculateArea() {
        if (base != null && height != null) {
            super.area = (base * height) / 2;
        } else {
            super.area = null; // Atau lakukan penanganan khusus sesuai kebutuhan Anda
        }
    }

    public void getInfo() {
        System.out.println("RightTriangle " + name + " info");
        System.out.println("area: " + super.area);
        System.out.println("with base: " + base);
        System.out.println("and height: " + height);
        System.out.println("and hypotenuse: " + this.getHyptenuse());
        System.out.println();
    }
}
