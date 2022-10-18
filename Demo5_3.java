/* 3)	Write a program in Java to show the usefulness of Interfaces as a place to keep constant value of the program. */

class Demo5_3 {
    public static void main(String args[]) {
        show sh = new show();
        sh.display();
        sh.calc_area();
    }
}

interface constant
{
    double pi = 3.14;
    int r=25;
    void calc_area();
    void display();
}

class show implements constant
{
    public void calc_area()
    {
        double area=4*pi*r*r;
        System.out.println("Area of a Sphere : "+area);

    }
    public void display()
    {
        System.out.println("Constant Value of pie : "+pi);
    }
}