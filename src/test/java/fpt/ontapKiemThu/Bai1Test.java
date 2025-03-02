package fpt.ontapKiemThu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Bai1Test {

  Bai1 bai1 = new Bai1();

  // 9.5,8.5, 7.5,6.5 ,5
  @Test
    public void test_PhanVungTuongDuong_95() throws IllegalAccessException {
      String exp = "Xuất Sắc";
      String act = bai1.tinhDiemTrungBinh(9.5);
      Assertions.assertEquals(exp, act);
  }
  @Test
  public void test_PhanVungTuongDuong_85() throws IllegalAccessException {
    String exp = "Giỏi";
    String act = bai1.tinhDiemTrungBinh(8.5);
    Assertions.assertEquals(exp, act);
  }
  @Test
  public void test_PhanVungTuongDuong_75() throws IllegalAccessException {
    String exp = "Giỏi";
    String act = bai1.tinhDiemTrungBinh(7.5);
    Assertions.assertEquals(exp, act);
  }
  @Test
  public void test_PhanVungTuongDuong_65() throws IllegalAccessException {
    String exp = "Khá";
    String act = bai1.tinhDiemTrungBinh(6.5);
    Assertions.assertEquals(exp, act);
  }

  @Test
  public void test_PhanVungTuongDuong_5() throws IllegalAccessException {
    String exp = "Trung Bình";
    String act = bai1.tinhDiemTrungBinh(5.5);
    Assertions.assertEquals(exp, act);
  }

  @Test
  public void test_PhanVungTuongDuong_Ngoaile() throws IllegalAccessException {
    Assertions.assertThrows(
            IllegalArgumentException.class, () -> bai1.tinhDiemTrungBinh(0)
    );
  }

  @Test
  public void test_CanBien_Min() throws IllegalAccessException {
    Assertions.assertThrows(
            IllegalArgumentException.class, () -> bai1.tinhDiemTrungBinh(-2)
    );
  }

  @Test
  public void test_CanBien_Max() throws IllegalAccessException {
    Assertions.assertThrows(
            IllegalArgumentException.class, () -> bai1.tinhDiemTrungBinh(20)
    );
  }
}