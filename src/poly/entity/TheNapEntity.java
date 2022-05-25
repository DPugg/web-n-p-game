package poly.entity;


import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="THE_NAP")
public class TheNapEntity {
	
	@Id
	@Column(name="MaThe")
	private String maThe;
	
	@Column(name="SoSeri")
	private String soSeri;
	
	@Column(name="LoaiThe")
	private String loaiThe;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "mm/dd/yyyy")
	private Date HSD;
	
	@Column(name="MucGia")
	private float mucGia;
	
	@OneToMany(mappedBy="TheNap", fetch=FetchType.EAGER)
	private Collection<TienAoGameEntity> tienAo;

	
	@OneToMany(mappedBy="TheNap", fetch=FetchType.EAGER)
	private Collection<ChiTietNapEntity> thongTinNap;


	public TheNapEntity(String maThe, String soSeri, String loaiThe, Date hSD, float mucGia,
			Collection<TienAoGameEntity> tienAo, Collection<ChiTietNapEntity> thongTinNap) {
		super();
		this.maThe = maThe;
		this.soSeri = soSeri;
		this.loaiThe = loaiThe;
		HSD = hSD;
		this.mucGia = mucGia;
		this.tienAo = tienAo;
		this.thongTinNap = thongTinNap;
	}


	public TheNapEntity() {
		super();
	}


	public String getMaThe() {
		return maThe;
	}


	public void setMaThe(String maThe) {
		this.maThe = maThe;
	}


	public String getSoSeri() {
		return soSeri;
	}


	public void setSoSeri(String soSeri) {
		this.soSeri = soSeri;
	}


	public String getLoaiThe() {
		return loaiThe;
	}


	public void setLoaiThe(String loaiThe) {
		this.loaiThe = loaiThe;
	}


	public Date getHSD() {
		return HSD;
	}


	public void setHSD(Date hSD) {
		HSD = hSD;
	}


	public float getMucGia() {
		return mucGia;
	}


	public void setMucGia(float mucGia) {
		this.mucGia = mucGia;
	}


	public Collection<TienAoGameEntity> getTienAo() {
		return tienAo;
	}


	public void setTienAo(Collection<TienAoGameEntity> tienAo) {
		this.tienAo = tienAo;
	}


	public Collection<ChiTietNapEntity> getThongTinNap() {
		return thongTinNap;
	}


	public void setThongTinNap(Collection<ChiTietNapEntity> thongTinNap) {
		this.thongTinNap = thongTinNap;
	}
 
	

	
	
	
}
