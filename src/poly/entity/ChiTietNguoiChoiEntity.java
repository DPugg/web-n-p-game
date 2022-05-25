package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ChiTietNguoiChoi")
public class ChiTietNguoiChoiEntity {

	
	@Id
	@Column(name ="SoLuongGameChoi")
	private int SLG;
	
	@ManyToOne
	@JoinColumn(name = "TenTaiKhoan")
	private TaiKhoanEntity TaiKhoan;
	
	
	@ManyToOne
	@JoinColumn(name = "MaGame")
	private GameEntity Game;


	public ChiTietNguoiChoiEntity(int sLG, TaiKhoanEntity taiKhoan, GameEntity game) {
		super();
		SLG = sLG;
		TaiKhoan = taiKhoan;
		Game = game;
	}
	
	
	public ChiTietNguoiChoiEntity() {
		super();
	}


	public int getSLG() {
		return SLG;
	}


	public void setSLG(int sLG) {
		SLG = sLG;
	}


	public TaiKhoanEntity getTaiKhoan() {
		return TaiKhoan;
	}


	public void setTaiKhoan(TaiKhoanEntity taiKhoan) {
		TaiKhoan = taiKhoan;
	}


	public GameEntity getGame() {
		return Game;
	}


	public void setGame(GameEntity game) {
		Game = game;
	}

	
	
}