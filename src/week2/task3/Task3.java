package week2.task3;
public class Task3 {
}
//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class rectangle {
    private int length,width ;
    // nhap chieu dai , chieu rong
    public  void setInFo(int n,int m)
    {
        this.length = n;
        this.width = m;
    }
    // tinh chu vi
    public int perimeter()
    {
        int Perimeter = 2*(length+width);
        return Perimeter;
    }
    // tinh dien tich
    public int acreage()
    {
        int Acreage = length * width;
        return Acreage;
    }
    // Kiem tra co phai hinh vuong
    public boolean Square()
    {
        if(length == width)
            return true;
        else
            return false;
    }
    public int getInFo(rectangle a)
    {

        return a.perimeter();
    }
    public void display(rectangle a)
    {
        if(a.Square()== true)
            System.out.println("La Hinh Vuong" + " \nDien Tich :"+ a.acreage());
        else
            System.out.println("La hinh chu nhat "+ "\nDien Tich :"+ a.acreage());
    }
}
class teacher{
    private String Name;
    private int age;
    private int soSVtheohoc;
    public void setinfo(String name,int age,int n)
    {
        this.Name = name;
        this.age = age;
        this.soSVtheohoc = n;
    }
    public String check()
    {
        String a = "Giao Vien Tot";
        String b = "Giao vien Kho Tinh";
        if(soSVtheohoc >  60 )
        {
            return a;
        }
        else
            return b;
    }
    public String VeHuu()
    {
        if(age > 60 )
        {
            return "Giao Vien Sap Ve Huu";
        }
        else if(age<30)
        {
            return "Giao vien Tre";
        }
        else
            return null;
    }

    public void display()
    {
        System.out.println("Name :" +Name + "Age :"+age + " " + this.check()+ this.VeHuu());
    }
}
class SinhVien{
    private String Name;
    private Double Diem,tuoi;
    public void SinhVien(String Name,double tuoi, double diem)
    {
        this.Name = Name;
        this.tuoi = tuoi;
        this.Diem = diem;
    }
    public  String getInFo()
    {
        return Name;
    }

    public String XepLoai()
    {
        if( Diem >= 3.2 )
            return "Sinh Vien hoc luc tot";
        else
            return "Sinh Vien chua cham hoc";
    }
    public String SV()
    {
        if(tuoi == 18 )
        {
            return "SV nam 1";
        }
        if(tuoi == 19){
            return "SV nam 2";
        }
        if(tuoi == 20 ){
            return "SV nam 3";
        }
        if(tuoi == 21 )
        {
            return "SV nam 4";
        }
        else
            return null;
    }
    public void hienthi()
    {
        System.out.println(Name+ " :" +this.SV() + ", " + this.XepLoai() );
    }

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.SinhVien("Chinh",19,4.0);
        sv1.hienthi();
    }
}



