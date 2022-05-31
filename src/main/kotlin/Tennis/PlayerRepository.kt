package tennis

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, String> {
	@Query("select * from players")
	fun findPlayers(): List<Player>
}