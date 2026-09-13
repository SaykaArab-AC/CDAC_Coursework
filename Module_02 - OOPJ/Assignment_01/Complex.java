class Complex
{
    int real;
    int img;

    Complex(int real, int img)
    {
        this.real=real;
        this.img=img;
    }

    Complex add(Complex obj)
    {
        return new Complex(real+obj.real,img+obj.img);
    }

    Complex subtract(Complex obj)
    {
        return new Complex(real-obj.real,img-obj.img);
    }

    Complex multiply(Complex obj)
    {
        int realPart=(real*obj.real)-(img*obj.img);
        int imgPart=(real*obj.img)+(img*obj.real);

        return new Complex(realPart, imgPart);
    }

    void display()
    {
        System.out.println(real+" + "+img+"i");
    }
}