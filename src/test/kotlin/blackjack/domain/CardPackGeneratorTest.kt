package blackjack.domain

import domain.CardPackGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardPackGeneratorTest {
    @Test
    fun `카드팩을 중복 없이 52장 생성한다`() {
        val cards = CardPackGenerator().createCards()
        assertThat(cards.cards.distinct().size).isEqualTo(52)
    }
}
