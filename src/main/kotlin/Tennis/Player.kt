package tennis

import org.springframework.data.relational.core.mapping.Table

@Table("players")
data class Player (val id: Int?, val name: String, val email: String, val creditCard: String)