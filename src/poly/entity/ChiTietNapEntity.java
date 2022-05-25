package poly.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="ChiTietNap")
public class ChiTietNapEntity {
	
	@Id
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "mm/dd/yyyy")
	private Date NgayNapThe;
	
	@Column(name ="LoaiThe")
	private String loaiThe;
	
	@Column(name ="MenhGia")
	private float menhGia;
	
	@Column(name ="TienAo")
	private float tienAo;
	
	@ManyToOne
	@JoinColumn(name = "MaGame")
	private GameEntity Game;
	
	@ManyToOne
	@JoinColumn(name = "MaThe")
	private TheNapEntity TheNap;
	
	@ManyToOne
	@JoinColumn(name = "TenTaiKhoan")
	private TaiKhoanEntity TaiKhoan;

	public ChiTietNapEntity(Date ngayNapThe, String loaiThe, float menhGia, float tienAo, GameEntity game,
			TheNapEntity theNap, TaiKhoanEntity taiKhoan) {
		super();
		NgayNapThe = ngayNapThe;
		this.loaiThe = loaiThe;
		this.menhGia = menhGia;
		this.tienAo = tienAo;
		Game = game;
		TheNap = theNap;
		TaiKhoan = taiKhoan;
	}

	public ChiTietNapEntity() {
		super();
	}

	public Date getNgayNapThe() {
		return NgayNapThe;
	}

	public void setNgayNapThe(Date ngayNapThe) {
		NgayNapThe = ngayNapThe;
	}

	public String getLoaiThe() {
		return loaiThe;
	}

	public void setLoaiThe(String loaiThe) {
		this.loaiThe = loaiThe;
	}

	public float getMenhGia() {
		return menhGia;
	}

	public void setMenhGia(float menhGia) {
		this.menhGia = menhGia;
	}

	public float getTienAo() {
		return tienAo;
	}

	public void setTienAo(float tienAo) {
		this.tienAo = tienAo;
	}

	public GameEntity getGame() {
		return Game;
	}

	public void setGame(GameEntity game) {
		Game = game;
	}

	public TheNapEntity getTheNap() {
		return TheNap;
	}

	public void setTheNap(TheNapEntity theNap) {
		TheNap = theNap;
	}

	public TaiKhoanEntity getTaiKhoan() {
		return TaiKhoan;
	}

	public void setTaiKhoan(TaiKhoanEntity taiKhoan) {
		TaiKhoan = taiKhoan;
	}

	
	
	
	
	
	
}
