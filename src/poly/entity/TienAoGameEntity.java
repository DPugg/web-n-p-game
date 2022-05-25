package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TienAoGame")
public class TienAoGameEntity {
	
	@Id
	@Column(name ="LuongTienAo")
	private float tienAo;

	@ManyToOne
	@JoinColumn(name = "MaGame")
	private GameEntity Game;
	
	@ManyToOne
	@JoinColumn(name = "MaThe")
	private TienAoGameEntity TheNap;

	public TienAoGameEntity(float tienAo, GameEntity game, TienAoGameEntity theNap) {
		super();
		this.tienAo = tienAo;
		Game = game;
		TheNap = theNap;
	}

	public TienAoGameEntity() {
		super();
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

	public TienAoGameEntity getTheNap() {
		return TheNap;
	}

	public void setTheNap(TienAoGameEntity theNap) {
		TheNap = theNap;
	}
	
	
}
