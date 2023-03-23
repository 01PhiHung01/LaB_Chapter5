package lab_chapter5;
import java.util.ArrayList;
import lab_chapter5.ChuyenXe.CXNOT;
public class ChuyenXe {
    public String Masochuyen;
    public String Hovaten;
    public int Soxe;
 public ChuyenXe() {}
 public ChuyenXe(String Masochuyen,String Hovaten,int Soxe) {
     this.Masochuyen=Masochuyen;
     this.Hovaten=Hovaten;
     this.Soxe=Soxe;
 }

    public String getMasochuyen() {
        return Masochuyen;
    }

    public void setMasochuyen(String Masochuyen) {
        this.Masochuyen = Masochuyen;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String Hovaten) {
        this.Hovaten = Hovaten;
    }

    public int getSoxe() {
        return Soxe;
    }

    public void setSoxe(int Soxe) {
        this.Soxe = Soxe;
    }
public void doanhthu() {
    System.out.println("Doanh thu tat ca chuyen xe: ");
}
public static class CXNOT extends ChuyenXe {
    public int Sotuyen;
    public float Sokmdiduoc;
   public CXNOT() {}
   public CXNOT(int Sotuyen,float Sokmdiduoc) {
       this.Sotuyen=Sotuyen;
       this.Sokmdiduoc=Sokmdiduoc;
   }

        public int getSotuyen() {
            return Sotuyen;
        }

        public void setSotuyen(int Sotuyen) {
            this.Sotuyen = Sotuyen;
        }

        public float getSokmdiduoc() {
            return Sokmdiduoc;
        }

        public void setSokmdiduoc(float Sokmdiduoc) {
            this.Sokmdiduoc = Sokmdiduoc;
        }
    @Override
    public void doanhthu() {
        System.out.println("Doanh thu cua xe noi thanh: ");
    }
    public String toString() {
        return "Sotuyen" +Sotuyen+"So km di duoc"+Sokmdiduoc;
    }
}
public static class CXNGT extends ChuyenXe {
    public String noiden;
    public int songaydi;
    public CXNGT() {}
    public CXNGT(String noiden,int songaydi) {
        this.noiden=noiden;
        this.songaydi=songaydi;
    }

        public String getNoiden() {
            return noiden;
        }

        public void setNoiden(String noiden) {
            this.noiden = noiden;
        }

        public int getSongaydi() {
            return songaydi;
        }

        public void setSongaydi(int songaydi) {
            this.songaydi = songaydi;
        }
    @Override
    public void doanhthu() {
        System.out.println("Tong doanh thu xe ngoai thanh: ");
    }
}

public class DanhSachChuyenXe {
    ArrayList<ChuyenXe> cx = new ArrayList<ChuyenXe>();
    public DanhSachChuyenXe() {}
    //public void Them(ChuyenXe) {
    //}
    public void InDanhSach() {
        System.out.println("Danh sach chuyen xe"+cx);
    }
}
    public static void main(String[] args) {
        ChuyenXe cx= new ChuyenXe();
        cx.doanhthu();
        cx = new CXNOT();
        cx.doanhthu();
        cx = new CXNGT();
        cx.doanhthu();   
    }
}