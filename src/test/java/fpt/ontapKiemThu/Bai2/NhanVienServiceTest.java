package fpt.ontapKiemThu.Bai2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NhanVienServiceTest {

    NhanVienService nhanVienService = new NhanVienService();

    @Test
    public void testAddThanhCong() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("1","Phan",20,2000.0f,2,"Hà nội");
        String exp = "Thêm Thành Công";
        String act = nhanVienService.addNhanVien(nhanVien);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testAdd_EX1() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("","",20,2000.0f,2,"");
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(nhanVien)
        );
    }
    @Test
    public void testAdd_Bien_Age_Min() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("3","Phan",18,2000.0f,2,"Hà nội");
        nhanVienService.addNhanVien(nhanVien);

    }
    @Test
    public void testAdd_CanBien_AgeEX_Min() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("3","Phan",-1,2000.0f,2,"Hà nội");
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(nhanVien)
        );
    }
    @Test
    public void testAdd_CanBien_AgeEX_Max() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("3","Phan",100,2000.0f,2,"Hà nội");
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(nhanVien)
        );
    }
    @Test
    public void testAdd_CanBien_YearOfWork_Max() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("3","Phan",20,2000.0f,50,"Hà nội");
       nhanVienService.addNhanVien(nhanVien);
    }
    @Test
    public void testAdd_CanBien_YearOfWorkEX_Min() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("3","Phan",20,2000.0f,-12,"Hà nội");
        Assertions.assertThrows(
                IllegalArgumentException.class, () -> nhanVienService.addNhanVien(nhanVien)
        );
    }

    @Test
    public void testDelete_ThanhCong() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("1","Phan",20,2000.0f,2,"Hà nội");

        nhanVienService.addNhanVien(nhanVien);

        nhanVienService.deleteNhanVien(nhanVien.getId());
    }

    @Test
    public void testDelete_KhongTimThayId() throws IllegalAccessException {
        NhanVien nhanVien = new NhanVien("1","Phan",20,2000.0f,2,"Hà nội");
        NhanVien nhanVien2 = new NhanVien("2","Phan",20,2000.0f,2,"Hà nội");
        nhanVienService.addNhanVien(nhanVien);

        nhanVienService.deleteNhanVien(nhanVien.getId());
        nhanVienService.deleteNhanVien(nhanVien2.getId());
    }



}