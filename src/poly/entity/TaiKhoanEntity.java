package poly.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TaiKhoan")

public class TaiKhoanEntity {

	@Id
	@Column(name="TenDangNhap")
	private String username;
	
	@Column(name="MatKhau")
	private String password;
	
	@Column(name="Ho")
	private String ho;
	
	@Column(name="Ten")
	private String ten;
	
	@Column(name="Tuoi")
	private int tuoi;
	
	@Column(name="role")
	private int role;
	
	@OneToMany(mappedBy="TaiKhoan", fetch=FetchType.EAGER)
	private Collection<ChiTietNguoiChoiEntity> nguoiChoi ;
	
	@OneToMany(mappedBy="TaiKhoan", fetch=FetchType.EAGER)
	private Collection<ChiTietNapEntity> thongTinNap;

	public TaiKhoanEntity(String username, String password, String ho, String ten, int tuoi, int role,
			Collection<ChiTietNguoiChoiEntity> nguoiChoi, Collection<ChiTietNapEntity> thongTinNap) {
		super();
		this.username = username;
		this.password = password;
		this.ho = ho;
		this.ten = ten;
		this.tuoi = tuoi;
		this.role = role;
		this.nguoiChoi = nguoiChoi;
		this.thongTinNap = thongTinNap;
	}

	public TaiKhoanEntity() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public Collection<ChiTietNguoiChoiEntity> getNguoiChoi() {
		return nguoiChoi;
	}

	public void setNguoiChoi(Collection<ChiTietNguoiChoiEntity> nguoiChoi) {
		this.nguoiChoi = nguoiChoi;
	}

	public Collection<ChiTietNapEntity> getThongTinNap() {
		return thongTinNap;
	}

	public void setThongTinNap(Collection<ChiTietNapEntity> thongTinNap) {
		this.thongTinNap = thongTinNap;
	}

}
