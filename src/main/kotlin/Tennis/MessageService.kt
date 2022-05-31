package tennis

import org.springframework.stereotype.Service

@Service
class MessageService(val db: PlayerRepository) {

	fun findPlayers(): List<Player> = db.findPlayers()

	fun post(player: Player){

		if (player.email.length > 32) {
			throw Exception("invalid email")
		}

		if (player.name.length > 32) {
			throw Exception("invalid name")
		}



		db.save(player)
	}
}

class CardValidation