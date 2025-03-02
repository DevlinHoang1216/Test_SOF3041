package fpt.ontapKiemThu.Bai2;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {

    public List<NhanVien> nhanVienList = new ArrayList<NhanVien>();

    public String addNhanVien(NhanVien nhanVien) throws IllegalAccessException {
       if (nhanVien == null) {
           throw  new IllegalAccessException("Các Trường Không Được Để Trống");
       }
       if (nhanVien.getId() == null || nhanVien.getId().isEmpty() ||
               nhanVien.getName() == null || nhanVien.getName().isEmpty()
       || nhanVien.getDepartment() == null || nhanVien.getDepartment().isEmpty()) {
           throw new IllegalAccessException("Không để trống trường id, name, department");
       }
       if(nhanVien.getAge() < 18 || nhanVien.getAge() > 70) {
           throw new IllegalAccessException("Tuổi không được dưới 18 và trên 70");
       }
       if (nhanVien.getYearOfWork() <0 || nhanVien.getYearOfWork() > 50) {
           throw new IllegalAccessException("Năm làm việc không được dưới 0 và trên 50");
       }
        nhanVienList.add(nhanVien);
        return "Thêm Thành Công";
    }

    public String deleteNhanVien(String id) throws IllegalAccessException {
       boolean removed =  nhanVienList.removeIf(nhanVien -> nhanVien.getId().equals(id));

        if(!removed) {
            throw new IllegalAccessException("Không thể tìm thấy id nhân viên: "+ id);
        }
        return "Xoá Thành Công";
    }
}
