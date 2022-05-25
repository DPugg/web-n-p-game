package poly.entity;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="GAME")
public class GameEntity {
	
	@Id
	@Column(name ="MaGame")
	private String maGame;
	
	@Column(name = "TenGame")
	private String tenGame;
	
	@Column(name ="NhaPhatHanh")
	private String nhaPhatHanh;
	
	@Column(name = "TheLoai")
	private String theLoai;


	@OneToMany(mappedBy="Game", fetch=FetchType.EAGER)
	private Collection<TienAoGameEntity> tienAo;

	@OneToMany(mappedBy="Game", fetch=FetchType.EAGER)
	private Collection<ChiTietNguoiChoiEntity> nguoiChoi;
	
	@OneToMany(mappedBy="Game", fetch=FetchType.EAGER)
	private Collection<ChiTietNapEntity> thongTinNap;

	public GameEntity(String maGame, String tenGame, String nhaPhatHanh, String theLoai,
			Collection<TienAoGameEntity> tienAo, Collection<ChiTietNguoiChoiEntity> nguoiChoi,
			Collection<ChiTietNapEntity> thongTinNap) {
		super();
		this.maGame = maGame;
		this.tenGame = tenGame;
		this.nhaPhatHanh = nhaPhatHanh;
		this.theLoai = theLoai;
		this.tienAo = tienAo;
		this.nguoiChoi = nguoiChoi;
		this.thongTinNap = thongTinNap;
	}

	public GameEntity() {
		super();
	}

	public String getMaGame() {
		return maGame;
	}

	public void setMaGame(String maGame) {
		this.maGame = maGame;
	}

	public String getTenGame() {
		return tenGame;
	}

	public void setTenGame(String tenGame) {
		this.tenGame = tenGame;
	}

	public String getNhaPhatHanh() {
		return nhaPhatHanh;
	}

	public void setNhaPhatHanh(String nhaPhatHanh) {
		this.nhaPhatHanh = nhaPhatHanh;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public Collection<TienAoGameEntity> getTienAo() {
		return tienAo;
	}

	public void setTienAo(Collection<TienAoGameEntity> tienAo) {
		this.tienAo = tienAo;
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
