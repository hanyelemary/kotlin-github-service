package github

import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class GitHubService(templateBuilder: RestTemplateBuilder) {
    val baseUrl = "https://api.github.com"
    val restTemplate = templateBuilder.rootUri(baseUrl).build()

    fun userProfile(username: String): ResponseEntity<String>? {
        return restTemplate.getForEntity("/users/${username}", String::class.java)
    }

    fun reposByUser(username: String): ResponseEntity<String>? {
        return restTemplate.getForEntity("/users/${username}/repos", String::class.java)
    }
}