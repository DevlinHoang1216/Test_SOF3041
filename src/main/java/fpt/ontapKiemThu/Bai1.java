package fpt.ontapKiemThu;

public class Bai1 {
    public String tinhDiemTrungBinh(double diemTB) throws IllegalAccessException {

        if(diemTB < 0 || diemTB > 10){
            throw  new IllegalAccessException("Điểm Trung Bình Không bé hơn 0 và lớn hơn 10");
        }
        if(diemTB>=9){
            return "Xuất Sắc";
        } else if (diemTB>=8) {
            return "Giỏi";
        } else if (diemTB>=6) {
            return "Khá";
        } else if (diemTB>=5) {
            return "Trung Bình";
        } else {
            return "Yếu";
        }

    }
}
