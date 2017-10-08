package github

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationIntegrationTests {

    @Autowired
    lateinit var restTemplate : TestRestTemplate

    @Test
    fun `GET repos by username returns 200 OK`() {
        // When
        val response = restTemplate.getForEntity("/users/hanyelemary/repos", String::class.java)

        // Then
        assertThat(response.statusCode).isEqualTo(HttpStatus.OK)
    }
}