package tennis

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessageResource(val service: MessageService) {
	@GetMapping
	fun index(): List<Player> = service.findPlayers()

	@PostMapping
	fun post(@RequestBody player: Player) {
		service.post(player)
	}
}