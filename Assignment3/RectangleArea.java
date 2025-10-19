class RectangleArea {
    public static void main(String[] abc) {
        int width = Integer.parseInt(abc[0]);
        int height = Integer.parseInt(abc[1]); 
        
        int area = height * width;
        System.out.print("Width = " + width + "\n");
        System.out.print("Height = " + height + "\n");
        System.out.print("Area = " + area);
    }
}