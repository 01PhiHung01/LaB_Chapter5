package hinh;
import java.util.ArrayList;
public class Hinh {
    public double dienTich(double dt) {
        System.out.println("Dien tich hinh: ");
        return dt;
    }
public static class HinhChuNhat extends Hinh {
    public float cd;
    public float cr;
    public HinhChuNhat() {}
    public HinhChuNhat(float cd, float cr) {
        this.cd=cd;
        this.cr=cr;
    }

        public float getCd() {
            return cd;
        }

        public void setCd(float cd) {
            this.cd = cd;
        }

        public float getCr() {
            return cr;
        }

        public void setCr(float cr) {
            this.cr = cr;
        }


    @Override
    public double dienTich(double dt) {
        return dt=cd*cr;
    }
    @Override
    public String toString() {
        return "Chieu dai"+cd+"Chieu rong"+cr;
    }
}
public static class HinhTron extends Hinh {
    public float r;
    public HinhTron() {}
    public HinhTron(float r) {
        this.r=r;
    }

        public float getR() {
            return r;
        }

        public void setR(float r) {
            this.r = r;
        }
@Override
 public double dienTich(double dt) {
     return dt=r*r*Math.PI;
    }
    @Override
    public String toString() {
    return "Ban kinh"+r;
}
}
public class DanhSachHinh {
    ArrayList<Hinh> dshinh = new ArrayList<Hinh>();
    public DanhSachHinh() {}
    public void Them(ArrayList Hinh) {
        System.out.println("Them");
    }
    public void InDanhSach() {
        System.out.println("In danh sach"+dshinh);
    }
}  
    public static void main(String[] args) {
        Hinh hinh = new Hinh();
        hinh.dienTich(0);
        hinh = new HinhChuNhat();
        hinh.dienTich(0);
        hinh = new HinhTron();
        hinh.dienTich(0);
    }
}